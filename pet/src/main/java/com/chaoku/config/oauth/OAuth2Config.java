package com.chaoku.config.oauth;

import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.error.WebResponseExceptionTranslator;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.net.UnknownHostException;

@Configuration
@EnableAuthorizationServer
public class OAuth2Config extends AuthorizationServerConfigurerAdapter {


    private AuthenticationManager authenticationManager;

    private WebResponseExceptionTranslator webResponseExceptionTranslator;

    private DataSource dataSource;

    private RedisConnectionFactory redisConnectionFactory;

    @Autowired
    public OAuth2Config(AuthenticationManager authenticationManager, WebResponseExceptionTranslator webResponseExceptionTranslator,
                        HikariDataSource dataSource, RedisConnectionFactory redisConnectionFactory) {
        this.authenticationManager = authenticationManager;
        this.webResponseExceptionTranslator = webResponseExceptionTranslator;
        this.dataSource = dataSource;
        this.redisConnectionFactory = redisConnectionFactory;
    }

    @Bean
    public TokenStore tokenStore(RedisConnectionFactory redisConnectionFactory) {
        return new CustomRedisTokenStore(redisConnectionFactory);
    }

    @Bean
    public JdbcClientDetailsService clientDetailsService() {
        //配置在哪查询客户端认证
        //在数据库认证，需要配置表
        return new JdbcClientDetailsService(dataSource);
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        //配置拦截器：拦截需要拦截的路径
        //对应于配置AuthorizationServer安全认证的相关信息，创建ClientCredentialsTokenEndpointFilter核心过滤器
        //security.addTokenEndpointAuthenticationFilter(new CustomSecurityFilter());
        security
                .tokenKeyAccess("permitAll()")
                .checkTokenAccess("isAuthenticated()");
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        //配置客户端认证
        //配置OAuth2的客户端相关信息
        clients.withClientDetails(clientDetailsService());
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        //配置token的数据源、自定义的tokenServices等信息
        //配置身份认证器，配置认证方式，TokenStore，TokenGranter，OAuth2RequestFactory
        endpoints.authenticationManager(authenticationManager)
                .tokenStore(tokenStore(redisConnectionFactory))         //配置redis会存储哪些信息
                .tokenServices(authorizationServerTokenServices())      //配置token 、refreshToken等存储时间
                .accessTokenConverter(accessTokenConverter())           //配置jwt生产的token，可以在token中放入用户信息
                .exceptionTranslator(webResponseExceptionTranslator);   //配置登录失败的异常信息
    }

    @Bean
    public JwtAccessTokenConverter accessTokenConverter() {
        JwtAccessTokenConverter converter = new CustomTokenEnhancer();
        converter.setSigningKey("secret");
        return converter;
    }

    @Bean
    public AuthorizationServerTokenServices authorizationServerTokenServices() {
        CustomAuthorizationTokenServices customTokenServices = new CustomAuthorizationTokenServices();
        customTokenServices.setTokenStore(tokenStore(redisConnectionFactory));
        customTokenServices.setSupportRefreshToken(true);
        customTokenServices.setReuseRefreshToken(false);
        customTokenServices.setClientDetailsService(clientDetailsService());
        customTokenServices.setTokenEnhancer(accessTokenConverter());
        return customTokenServices;
    }

    @Configuration
    protected static class RedisConfiguration {

        @Bean
        @ConditionalOnMissingBean(name = "redisTemplate")
        public RedisTemplate<Object, Object> redisTemplate(
                RedisConnectionFactory redisConnectionFactory)
                throws UnknownHostException {
            RedisTemplate<Object, Object> template = new RedisTemplate<Object, Object>();
            template.setConnectionFactory(redisConnectionFactory);
            return template;
        }

        @Bean
        @ConditionalOnMissingBean(StringRedisTemplate.class)
        public StringRedisTemplate stringRedisTemplate(
                RedisConnectionFactory redisConnectionFactory)
                throws UnknownHostException {
            StringRedisTemplate template = new StringRedisTemplate();
            template.setConnectionFactory(redisConnectionFactory);
            return template;
        }
    }

    @Configuration
    @EnableTransactionManagement(mode = AdviceMode.ASPECTJ)
    @MapperScan("com.blueskykong.auth.dao.mapper")
    public static class DatasourceConfig  {


    }


}

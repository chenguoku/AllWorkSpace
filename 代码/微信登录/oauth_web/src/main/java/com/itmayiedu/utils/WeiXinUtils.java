/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.itmayiedu.com
 */
package com.itmayiedu.utils;

import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能说明: <br>
 * 创建作者:每特教育-余胜军<br>
 * 创建时间:2018年7月20日 下午4:29:54<br>
 * 教育机构:每特教育|蚂蚁课堂<br>
 * 版权说明:上海每特教育科技有限公司版权所有<br>
 * 官方网站:www.itmayiedu.com|www.meitedu.com<br>
 * 联系方式:qq644064779<br>
 * 注意:本内容有每特教育学员共同研发,请尊重原创版权
 */
@Component
public class WeiXinUtils {
	@Value("${appid}")
	private String appId;
	@Value("${secret}")
	private String secret;
	@Value("${redirecturi}")
	private String redirectUri;
	@Value("${authorizedUrl}")
	private String authorizedUrl;
	@Value("${access_token}")
	private String accessToken;
	@Value("${userinfo}")
	private String userinfo;

	public String getAuthorizedUrl() {
		return authorizedUrl.replace("APPID", appId).replace("REDIRECT_URI", URLEncoder.encode(redirectUri));
	}

	public String getAccessTokenUrl(String code) {
		return accessToken.replace("APPID", appId).replace("SECRET", secret).replace("CODE", code);
	}

	public String getUserInfo(String accessToken, String openId) {
		return userinfo.replace("ACCESS_TOKEN", accessToken).replace("OPENID", openId);
	}

}

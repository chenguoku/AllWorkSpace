//package com.example.testPrometheus.config;
//
//import io.prometheus.client.Counter;
//import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class PrometheusMetricsInterceptor extends HandlerInterceptorAdapter {
//    // 这里的命名不能出现 - ，比如 sbp_demo_requests_total 符合规范，但是 sbp-demo-requests-total 不符合规范，prometheus 会报错，启动不了。
//    private static final Counter requestCounter = Counter.build().name("sbp_demo_requests_total")
//            .labelNames("path", "method", "code")
//            .help("Total requests.").register();
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        String requestURI = request.getRequestURI();
//        String method = request.getMethod();
//        int status = response.getStatus();
//
//        requestCounter.labels(requestURI, method, String.valueOf(status)).inc();
//
//        super.afterCompletion(request, response, handler, ex);
//    }
//}
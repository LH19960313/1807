package com.jt.sys.FoundServiceProvideUser;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;


/**
 * Feign配置
 * 使用FeignClient进行服务调用之前进行公用操作，传递headers信息
 */
@Configuration
public class FeignConfig implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("token","8888");
    }

}


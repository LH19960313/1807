package com.jt.sys.FoundServiceProvideUser;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.net.SocketTimeoutException;

/**
 * 容错处理类，当调用失败时，执行方法
 */
@Component
public class DefaultFallback implements FallbackFactory< FoundServiceProvideUser >{
    @Override
    public FoundServiceProvideUser create(Throwable throwable) {
        return new FoundServiceProvideUser() {
            @Override
            public JsonResult post(@PathVariable(value = "check") String check,
                               Object bodyJson) {
                throwable.printStackTrace();
                return new JsonResult(new SocketTimeoutException("调用微服务失败，请求超时"));
            }
            @Override
            public JsonResult put(@PathVariable(value = "check") String check,
                                  Object bodyJson){
              return  this.post(check, bodyJson) ;
            }
            @Override
            public JsonResult get(@PathVariable(value = "check") String check,
                                  Object bodyJson){
                return  this.post(check, bodyJson) ;
            }
            @Override
            public JsonResult delect(@PathVariable(value = "check") String check,
                                  Object bodyJson){
                return  this.post(check, bodyJson) ;
            }
            @Override
            public JsonResult test(){
                return  this.post(null,null);
            }
        };
    }
}
package com.jt.sys.FoundServiceProvideUser;

import com.netflix.ribbon.proxy.annotation.Http.Header;
import feign.HeaderMap;
import feign.Headers;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * 这个接口用来寻找服务商的
 */
@FeignClient(name = "webService", fallbackFactory=DefaultFallback.class)
//@Headers({"token: 123" })
//@RequestLine()
public interface FoundServiceProvideUser{

    ///商内部的服务名 就是普通的Controller路径+mapping方法路径
    @PostMapping(value = "/{check}")
     JsonResult post(@PathVariable(value = "check") String check,
                       Object  bodyJson);
    @PutMapping(value="/{check}")
     JsonResult put(@PathVariable(value = "check") String check,
                      Object bodyJson);
    @GetMapping (value="/{check}")
     JsonResult get(@PathVariable(value = "check") String check,
                      Object  bodyJson);
    @DeleteMapping(value="/{check}")
    JsonResult delect(@PathVariable(value = "check") String check,
                          Object  bodyJson);
    @PostMapping(value = "test")
    JsonResult test();

}

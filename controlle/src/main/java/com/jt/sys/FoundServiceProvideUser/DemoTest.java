package com.jt.sys.FoundServiceProvideUser;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
//@RestController  //Controller+ResponseBody
@Controller
public class DemoTest {
    @Autowired
    FoundServiceProvideUser serviceProvideUser;
    @RequestMapping("s")//Test
    @ResponseBody
    public JsonResult Demo1(@RequestParam  HashMap map) {
        map.put("s",2);
        System.out.println(map);
        return serviceProvideUser.post("my", map);
    }
    @RequestMapping("ss")
    @ResponseBody
    public JsonResult Demo2(@RequestParam  HashMap map) {
        map.put("s",2);
        System.out.println(map);
        return serviceProvideUser.post("ss/my", map);
    }
    @RequestMapping("login")
    public String Demo3(@RequestParam  HashMap map) {
        return "login";
    }

    @RequestMapping("test")
    @ResponseBody
    public JsonResult Demo4() {
        return serviceProvideUser.test();
    }



}

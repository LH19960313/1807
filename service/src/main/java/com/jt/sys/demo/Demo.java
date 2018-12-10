package com.jt.sys.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
public class Demo {
    @Autowired
    daoDemo dao;

    @Value("${server.port}")
    private String port;

    @PostMapping(value = "/ss/my" )
    JsonResult update(@RequestBody Map bodyJson) {
     /*   try {
          Thread.currentThread().sleep(5000L);
        }catch (InterruptedException e){
        }*/
            System.out.println(bodyJson);
            Map map=new HashMap<>();
            map.put("s",dao.finnews());
            return new JsonResult(map);
    }
    @PostMapping(value = "/"+"my" )
    JsonResult Check( @RequestBody  Map mao) {
        System.out.println( mao);
        Map map=new HashMap<>();
        map.put("a",dao.finnews());



        return new JsonResult(map);



    }

    @PostMapping(value = "test" )
    JsonResult test(@RequestHeader() String token) {
        String result="本次访问的服务是"+port;
        result += "token:"+token;
        return new JsonResult(result);


    }
}
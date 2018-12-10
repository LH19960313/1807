package com.jt.sys;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekeApplicationTests {

    @Test
    public void contextLoads() {
        int[] a=new int[5];
        System.out.print(a[2]);
    }

}

package com.test.web;

import com.test.web.comm.OtherProperties;
import com.test.web.comm.TestProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplocationTest {

    @Value("${test.title}")
    private String title;

    @Test
    public void apptest(){
        System.out.println(title);
    }

    @Resource
    private TestProperties testProperties;

    @Test
    public void propertiesTest(){
        System.out.println("title :" + testProperties.getTitle());
        System.out.println("description :" + testProperties.getDescription());
    }

    @Resource
    private OtherProperties otherProperties;

    @Test
    public void testOtherProperties(){
        System.out.println("title :" + otherProperties.getTitle());
        System.out.println("description :" + otherProperties.getDescription());
    }
}

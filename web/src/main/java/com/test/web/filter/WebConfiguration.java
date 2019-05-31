package com.test.web.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {
    @Bean
    public FilterRegistrationBean testFilterRegistration1(){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilter1());
        registration.addUrlPatterns("/*");
        registration.setName("My Filter1");
        registration.setOrder(6);
        return registration;
    }

    @Bean
    public FilterRegistrationBean testFilterRegistration2(){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilter2());
        registration.addUrlPatterns("/*");
        registration.setName("My Filter2");
        registration.setOrder(2);
        return registration;
    }
}

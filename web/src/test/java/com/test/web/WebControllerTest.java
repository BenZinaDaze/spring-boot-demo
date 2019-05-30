package com.test.web;

import com.test.web.web.WebController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
public class WebControllerTest {

    MockMvc mockMvc;

    @Before
    public void setup(){
        mockMvc = MockMvcBuilders.standaloneSetup(new WebController()).build();
    }

    @Test
    public void getWeb() throws Exception {
        String str = mockMvc.perform(MockMvcRequestBuilders.post("/getUser")).andReturn().getResponse().getContentAsString();
        System.out.println("result :" + str);
    }

    @Test
    public void getWebs() throws Exception {
        String str = mockMvc.perform(MockMvcRequestBuilders.post("/getUsers")).andReturn().getResponse().getContentAsString();
        System.out.println("result :" + str);
    }

    @Test
    public void saveUser() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/saveUser")
                .param("name","")
                .param("age","666")
                .param("pass","test"));

    }
}

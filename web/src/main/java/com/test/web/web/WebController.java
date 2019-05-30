package com.test.web.web;

import com.test.web.model.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class WebController {
    @RequestMapping(value = "/getUser",method = RequestMethod.POST)
    public User getUser(){
        User user = new User("test",18,"pass");
        return user;
    }

    @RequestMapping(value = "/getUsers",method = RequestMethod.POST)
    public List<User> getUsers(){
        List<User> users = new ArrayList<User>();
        User user1 = new User("test1",18,"pass");
        User user2 = new User("test2",18,"pass");
        User user3 = new User("test3",18,"pass");

        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users;
    }

    @RequestMapping(value = "/saveUser",method = RequestMethod.POST)
    public void saveUser(@Valid User user, BindingResult result){
        System.out.println("user :" + user);
        if (result.hasErrors()){
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error : list){
                System.out.println(error.getCode() + ":" + error.getDefaultMessage());
            }
        }
    }
}

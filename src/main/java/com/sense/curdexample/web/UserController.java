package com.sense.curdexample.web;

import com.sense.curdexample.bean.User;
import com.sense.curdexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "common-user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public boolean addUser(User user) {
        System.out.println("begin to add...");
        boolean flag = false;
        flag = userService.addUser(user);
        return flag;
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public boolean deleteUser(@RequestParam(value = "id",required = true) int id) {
        System.out.println("begin to delete...");
        return userService.deleteUser(id);
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public boolean updateUser(User user) {
        System.out.println("begin to update");
        return userService.updateUser(user);
    }
    @RequestMapping(value = "/userAll", method = RequestMethod.GET)
    public List<User> queryAllUser() {
        System.out.println("begin to query...");
        return userService.findAll();
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User queryUserByName(@RequestParam(value = "name",required = true) String name) {
        System.out.println("begin to query all ...");
        return userService.findUserByName(name);
    }
}

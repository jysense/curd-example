package com.sense.curdexample.service;

import com.sense.curdexample.bean.User;
import com.sense.curdexample.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public boolean addUser(User user) {
        boolean flag=false;
        try {
            userDao.addUser(user);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }

        return flag;
    }

    @Override
    public boolean updateUser(User user) {
        boolean flag=false;
        try {
            userDao.updateUser(user);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }

        return flag;
    }

    @Override
    public boolean deleteUser(int id) {
        boolean flag=false;
        try {
            userDao.deleteUser(id);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }

        return flag;
    }

    @Override
    public User findUserByName(String userName) {
        User user = new User();
        try {
            user = userDao.findByName(userName);
        }catch (Exception e){
            e.printStackTrace();
        }

        return user;
    }

    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        try {
            userList = userDao.findAll();
        }catch (Exception e){
            e.printStackTrace();
        }

        return userList;
    }
}

package com.lnr.springapp.mvc.service;

import com.lnr.springapp.mvc.model.User;

import java.util.List;

public interface UserService {

    public void addUser(User user);

    public List<User> listUser();

    public void removeUser(Integer id);

    public User selectUser(Integer userId);

    public User updateUser(User user);
}

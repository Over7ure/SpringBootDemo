package cn.edu.zjut.service;

import cn.edu.zjut.entity.User;

public interface UserService {
    User login(User user);

    void register(User user);
}


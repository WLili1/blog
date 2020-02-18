package com.wzq.service;

import com.wzq.po.User;

public interface UserService {

    User checkUser(String username, String password);
}

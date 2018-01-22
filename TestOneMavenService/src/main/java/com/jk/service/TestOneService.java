package com.jk.service;

import com.jk.model.User;

import java.util.List;

public interface TestOneService {

    List<User> selectUser(String string, Integer start, Integer pageSize);

    int selectUserCount();

    User selectUpdateJsp(int id);

    void updateFrom(User user);

}

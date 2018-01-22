package com.jk.service;

import com.jk.dao.TestOneMavenDao;
import com.jk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Repository("testOneService ")
public class TestOneServiceImpl  implements  TestOneService{
    @Autowired
    private TestOneMavenDao testOneMavenDao;

    public List<User> selectUser(String string, Integer start, Integer pageSize){
        System.out.println(string);
        return testOneMavenDao.selectUser(string,start,pageSize);
    }

    @Override
    public int selectUserCount() {

        return testOneMavenDao.selectUserCount();
    }

    @Override
    public User selectUpdateJsp(int id) {

        return testOneMavenDao.selectUpdateJsp(id);
    }

    @Override
    public void updateFrom(User user) {
        testOneMavenDao.updateFrom(user);

    }

}

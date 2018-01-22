package com.jk.dao;

import com.jk.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
public interface TestOneMavenDao {

   /* @Select(value="select id,name from t_test LIMIT #{start},#{pageSize}")*/
    List<User> selectUser(String string, @Param("start")Integer start, @Param("pageSize")Integer pageSize);


 /*   @Select(value="select COUNT(1) FROM t_test")*/
    int selectUserCount();

/*    @Select(value="select id,name from t_test where id = #{id}")*/
    User selectUpdateJsp(@Param("id")int id);


    /*@Update(value="update t_test set name = #{name} where id = #{id}")*/
    void updateFrom(User user);
}

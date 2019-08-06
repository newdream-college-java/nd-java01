package com.dy.mapper;

import com.dy.entity.User;
import com.dy.entity.UserExample;
import java.util.List;


public interface UserMapper {
  
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    
    int insert(User record);

  
    int insertSelective(User record);

   
    List<User> selectByExample();

    User selectByPrimaryKey(Integer id);
    List<User> UserfindAll();
  
    int updateByExampleSelective( User record,  UserExample example);

    int updateByExample( User record,  UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
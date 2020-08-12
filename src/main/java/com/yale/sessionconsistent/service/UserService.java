package com.yale.sessionconsistent.service;

import com.yale.sessionconsistent.entity.User;
import com.yale.sessionconsistent.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yale
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public User findByUsernameAndPassword(User user){
        return userMapper.findByUsernameAndPassword(user.getUsername(),user.getPassword());
    }
}

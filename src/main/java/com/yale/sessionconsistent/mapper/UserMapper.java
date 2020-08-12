package com.yale.sessionconsistent.mapper;


import com.yale.sessionconsistent.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author yale
 */
@Component
public interface UserMapper extends JpaRepository<User,Long> {

    /**
     * 根据用户名密码查询用户
     * @return
     */
    User findByUsernameAndPassword(String username,String password);

}

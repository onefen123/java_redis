package net.fen.redis.service;

import net.fen.redis.entity.User;
import net.fen.redis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Transactional
    public int add(User user){
        return userMapper.add(user);
    }

    @Transactional
    public List<User> selectUsers(){
        return userMapper.selectUsers();

    }
}

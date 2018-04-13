package Service.impl;

import Service.UserService;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pojo.User;

/**
 * @Author: feitian
 * @Date: 2018-04-02 23:04
 * @description: ${description}
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;
    @Override
    public User getUserById(int id) {
        User user = userMapper.getUserById(id);
        return user;
    }

    @Override
    public User getUserByName(String name) {
        User user = userMapper.getUserByName(name);
        return user;
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
}

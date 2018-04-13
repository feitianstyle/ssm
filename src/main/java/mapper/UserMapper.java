package mapper;

import pojo.User;

/**
 * @Author: feitian
 * @Date: 2018-04-02 22:57
 * @description: feitain
 */
public interface UserMapper {
    User getUserById(int id);
    User getUserByName(String name);
    void insertUser(User user);
    void updateUser(User user);
}

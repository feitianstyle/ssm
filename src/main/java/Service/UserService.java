package Service;

import pojo.User;

/**
 * @Author: feitian
 * @Date: 2018-04-02 23:02
 * @description: ${description}
 */
public interface UserService {
    User getUserById(int id);
    User getUserByName(String name);
    void insertUser(User user);
    void updateUser(User user);
}

package Service.impl;

import Service.UserService;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.User;



/**
 * @Author: feitian
 * @Date: 2018-04-02 23:08
 * @description: ${description}
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class UserServiceImplTest {
    private Logger logger = Logger.getLogger(UserServiceImplTest.class);
    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @org.junit.Test
    public void getUserById() {
        User user = userService.getUserById(1);
        System.out.println(user.getName());
    }
    @org.junit.Test
    public void updateUser(){
        User user = new User();
        user.setId(1);
        user.setName("胡杰文");
        userService.updateUser(user);
    }
    @org.junit.Test
    public void insertUser(){
        User user = new User();
        user.setName("李四");
        user.setPassWord("123456");
        userService.insertUser(user);
        logger.info("finished !!!");
    }
}
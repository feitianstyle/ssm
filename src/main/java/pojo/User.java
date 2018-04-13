package pojo;

import org.springframework.stereotype.Component;

/**
 * @Author: feitian
 * @Date: 2018-04-02 22:55
 * @description: ${description}
 */
@Component
public class User {
    private int id;
    private String name;
    private String passWord;

    public User() {
    }

    public User(int id) {
        this.id = id;
    }

    public User(int id, String name, String passWord) {
        this.id = id;
        this.name = name;
        this.passWord = passWord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}

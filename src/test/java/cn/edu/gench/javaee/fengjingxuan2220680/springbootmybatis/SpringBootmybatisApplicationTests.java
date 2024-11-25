package cn.edu.gench.javaee.fengjingxuan2220680.springbootmybatis;

import cn.edu.gench.javaee.fengjingxuan2220680.springbootmybatis.dao.UserDao;
import cn.edu.gench.javaee.fengjingxuan2220680.springbootmybatis.mapper.UserMapper;
import cn.edu.gench.javaee.fengjingxuan2220680.springbootmybatis.po.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.List;

@SpringBootTest
public class SpringBootmybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindUserById() {
        User user = userMapper.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void testFindAllUsers() {
        List<User> users = userMapper.findAllUsers();
        users.forEach(System.out::println);
    }

    @Test
    public void testFindUsersByUsername() {
        List<User> users = userMapper.findUsersByUsername("fi");
        users.forEach(System.out::println);
    }

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("fissheep");
        user.setSex("F");
        user.setBirthday("2000-01-01");
        user.setAddress("Beijing");
        userMapper.addUser(user);
    }

    @Test
    public void testUpdateUser() {
        User user = new User();
        user.setId(2);
        user.setUsername("sheep");
        user.setSex("F");
        user.setBirthday("1999-01-01");
        user.setAddress("Shanghai");
        userMapper.updateUser(user);
    }

    @Test
    public void testDeleteUserById() {
        userMapper.deleteUserById(1);
    }
}

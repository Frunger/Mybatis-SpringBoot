package cn.edu.gench.javaee.fengjingxuan2220680.springbootmybatis.service.impl;

import cn.edu.gench.javaee.fengjingxuan2220680.springbootmybatis.mapper.UserMapper;
import cn.edu.gench.javaee.fengjingxuan2220680.springbootmybatis.po.User;
import cn.edu.gench.javaee.fengjingxuan2220680.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl extends UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }

    @Override
    public List<User> findAllUsers() {
        return userMapper.findAllUsers();
    }

    @Override
    @Transactional  // 添加事务管理
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    @Transactional  // 添加事务管理
    public boolean updateUser(User user) {
        int rows = userMapper.updateUser(user);
        return rows > 0;
    }

    @Override
    @Transactional  // 添加事务管理
    public boolean deleteUserById(Integer id) {
        int rows = userMapper.deleteUserById(id);
        return rows > 0;
    }

    @Override
    public List<User> findUsersByUsername(String username) {
        return userMapper.findUsersByUsername(username);
    }
}

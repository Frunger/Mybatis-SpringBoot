package cn.edu.gench.javaee.fengjingxuan2220680.springbootmybatis.service;

import cn.edu.gench.javaee.fengjingxuan2220680.springbootmybatis.po.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public abstract class UserService {
    public abstract User findUserById(Integer id);

    public abstract List<User> findAllUsers();

    @Transactional  // 添加事务管理
    public abstract void addUser(User user);

    @Transactional  // 添加事务管理
    public abstract boolean updateUser(User user);

    @Transactional  // 添加事务管理
    public abstract boolean deleteUserById(Integer id);

    public abstract List<User> findUsersByUsername(String username);
}

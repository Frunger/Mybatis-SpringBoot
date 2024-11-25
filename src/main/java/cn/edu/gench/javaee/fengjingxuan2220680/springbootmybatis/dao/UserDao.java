package cn.edu.gench.javaee.fengjingxuan2220680.springbootmybatis.dao;

import cn.edu.gench.javaee.fengjingxuan2220680.springbootmybatis.po.User;

public interface UserDao {
    User findUserById(Integer id) throws Exception;
}

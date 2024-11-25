package cn.edu.gench.javaee.fengjingxuan2220680.springbootmybatis.dao;

import cn.edu.gench.javaee.fengjingxuan2220680.springbootmybatis.dao.UserDao;
import cn.edu.gench.javaee.fengjingxuan2220680.springbootmybatis.po.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    private final SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    public UserDaoImpl(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public User findUserById(Integer id) throws Exception {
        return sqlSessionTemplate.selectOne("UserMapper.findUserById", id);
    }
}

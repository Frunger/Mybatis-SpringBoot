package cn.edu.gench.javaee.fengjingxuan2220680.springbootmybatis.mapper;

import cn.edu.gench.javaee.fengjingxuan2220680.springbootmybatis.po.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM users WHERE id = #{id}")
    User findUserById(Integer id);

    @Select("SELECT * FROM users")
    List<User> findAllUsers();

    @Insert("INSERT INTO users (username, sex, birthday, address) VALUES (#{username}, #{sex}, #{birthday}, #{address})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void addUser(User user);

    @Update("UPDATE users SET username = #{username}, sex = #{sex}, birthday = #{birthday}, address = #{address} WHERE id = #{id}")
    int updateUser(User user);

    @Delete("DELETE FROM users WHERE id = #{id}")
    int deleteUserById(Integer id);

    @Select("SELECT * FROM users WHERE username LIKE CONCAT('%', #{username}, '%')")
    List<User> findUsersByUsername(String username);
}

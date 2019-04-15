package net.fen.redis.mapper;

import net.fen.redis.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    @Insert("insert into user(name,password,age) values(#{name},#{password},#{age})")
    @Options(keyProperty = "id",keyColumn = "id",useGeneratedKeys = true)
    int add(User user);

    @Select("select * from user where 1")
    List<User> selectUsers();
}

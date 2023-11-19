package cn.edu.zjut.dao;

import cn.edu.zjut.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {
    User login(User user);

    void register(User user);
}

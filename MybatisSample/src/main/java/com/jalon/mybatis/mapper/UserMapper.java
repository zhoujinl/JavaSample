package com.jalon.mybatis.mapper;

/**
 * Created by Jalon on 17/04/2018.
 */
import com.jalon.mybatis.entity.User;
import java.util.List;
import java.util.Map;

public interface UserMapper {

    public int insert(User user);

    public User selectById(int id);

    public List<User> selectAll();

    // TODO  测试查询多条记录，并将结果封装到一个Map中，调用sqlSession的selectMap方法
    public Map<Integer, User> selectAllMap();

    public int updateById(User user);

    public int deleteById(int id);

    public int deleteAll();
}

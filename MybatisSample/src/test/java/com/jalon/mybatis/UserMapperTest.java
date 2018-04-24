package com.jalon.mybatis;

import com.jalon.mybatis.entity.User;
import com.jalon.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * Created by Jalon on 17/04/2018.
 * 官网推荐，SqlSession 生命周期仅存在一次请求中。
 *
 */
@Ignore
public class UserMapperTest {

    private static SqlSessionFactory sqlSessionFactory;
    private static UserMapper userMapper;
    private static SqlSession sqlSession;

    //通过SqlSessionFactoryBuilder构造SqlSessionFactory实例
    @BeforeClass
    public static void testBefore() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        sqlSession = sqlSessionFactory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    // 每个单元测试方法(添加@Test注解的方法)在执行前，此方法都会被juint框架回调，创建一个新的SqlSession实例
    @Before
    public void before() {
        /*sqlSession = sqlSessionFactory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);*/
    }

    // 测试添加，调用sqlSession的insert方法
    @Test
    public void testInsert() {
        User user1 = new User();
        user1.setId(1);
        user1.setName("admin");
        user1.setAge(17);
        userMapper.insert(user1);
    }

    // 测试查询单条记录，调用sqlSession的selectOne方法
    @Test
    public void testSelectOne() {
        User user = userMapper.selectById(1);
        assert user != null;
        System.out.println("id:" + user.getId() + ",name:" + user.getName() + ",age:" + user.getAge());
    }

    // 测试查询多条记录，并将结果封装到一个List中，调用sqlSession的selectList方法
    @Test
    public void testSelectList() {
        List<User> userList = userMapper.selectAll();
        System.out.println(userList);
    }

    // 测试查询多条记录，并将结果封装到一个Map中，调用sqlSession的selectMap方法
    @Test
    public void testSelectMap() {
        Map<Integer, User> userMap = sqlSession.selectMap("com.jalon.mybatis.mapper.UserMapper.selectAll", "id");
        for(int id : userMap.keySet()){
            System.out.println(id);
            System.out.println(userMap.get(id).toString());
        }
    }

    // 测试更新，调用sqlSession的update方法
    @Test
    public void testUpdate() {
        // 先反向映射找出来
        User user = userMapper.selectById(1);
        assert user != null;
        // 再修改
        user.setName("user2 plus");
        user.setAge(19);
        // 最后正向映射写入
        int updateCount = userMapper.updateById(user);
        assert updateCount == 1;
    }

    // 测试删除，调用sqlSession的delete方法
    @Test
    public void testDelete() {
        int deleteCount = userMapper.deleteById(1);
        assert deleteCount == 1;
    }

    // 测试删除，调用sqlSession的delete方法
    @Test
    public void testDeleteAll() {
        int deleteCount = userMapper.deleteAll();
        assert deleteCount == 1;
    }

    // 每个单元测试方法(添加@Test注解的方法)在执行后，此方法都会被juint框架回调，关闭SqlSession实例
    @After
    public void after() {
    /*
        sqlSession.close();
    */
    }
}

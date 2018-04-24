package com.jalon.mybatis;

import com.jalon.mybatis.mapper.UserMapper;
import com.jalon.mybatis.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);

        selectOne(sqlSessionFactory);
        useMapper(sqlSessionFactory);
    }


    private static void selectOne(SqlSessionFactory sqlSessionFactory) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            User user = session.selectOne(
                    "com.jalon.mybatis.mapper.UserMapper.selectById", 1);
            System.out.println(user.toString());
        } finally {
            session.close();
        }
    }

    private static void useMapper(SqlSessionFactory sqlSessionFactory) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserMapper mapper = session.getMapper(UserMapper.class);
            User user = mapper.selectById(1);
            System.out.println(user.toString());
        } finally {
            session.close();
        }
    }
}

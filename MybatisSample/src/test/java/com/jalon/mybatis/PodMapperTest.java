package com.jalon.mybatis;

import com.jalon.mybatis.entity.Book;
import com.jalon.mybatis.entity.Params;
import com.jalon.mybatis.entity.Pod;
import com.jalon.mybatis.mapper.BookMapper;
import com.jalon.mybatis.mapper.PodMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Jalon on 17/04/2018.
 */
@Ignore
public class PodMapperTest {

    private static SqlSessionFactory sqlSessionFactory;
    private static SqlSession sqlSession;
    private static PodMapper podMapper;

    @BeforeClass
    public static void testBefore() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        sqlSession = sqlSessionFactory.openSession();
        podMapper = sqlSession.getMapper(PodMapper.class);
    }


    @Test
    public void testGetPodBooksByInUnion() {
        List<Pod> pods = podMapper.getPodBooksByInUnion(1);
        System.out.println(pods);
    }

    @Test
    public void testGetPodBooksByOutUnion() {
        List<Pod> pods = podMapper.getPodBooksByOutUnion(1);
        System.out.println(pods);
    }

    @Test
    public void testGetPodPagesByParams() {
        Params ps = new Params();
        ps.setOffset(0);  // 0 1 2
        ps.setPagesize(2); // 1 2
        List<Pod> pods = podMapper.getPodPagesByParams(ps);
        System.out.println(pods);


    }
}

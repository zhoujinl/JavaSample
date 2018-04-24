package com.jalon.mybatis;

import com.jalon.mybatis.entity.Book;
import com.jalon.mybatis.entity.User;
import com.jalon.mybatis.mapper.BookMapper;
import com.jalon.mybatis.mapper.UserMapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * Created by Jalon on 17/04/2018.
 */
@Ignore
public class BookMapperTest {

    private static SqlSessionFactory sqlSessionFactory;
    private static SqlSession sqlSession;
    private static BookMapper bookMapper;

    @BeforeClass
    public static void testBefore() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        sqlSession = sqlSessionFactory.openSession();
        bookMapper = sqlSession.getMapper(BookMapper.class);
    }


    @Test
    public void testGetAllBooks() {
        List<Book> books = bookMapper.getAllBooks();
        System.out.println(books);
    }

    @Test
    public void testGetBooks() {
        Book books = bookMapper.getBookById(100);
        System.out.println(books);
    }

    @Test
    public void testInsertBook() {
        Book book = new Book();
        book.setId(2);
        book.setName("bo");
        book.setPrice(35);
        bookMapper.insertBook(book);
    }
    @Test
    public void testInsertBookA() {
        Book book = new Book();
        book.setName("boo");
        book.setPrice(350);
        bookMapper.insertAutoId(book);
    }

    @Test
    public void testGetAllBookMap() {
        List<Book>  books = bookMapper.getAllBookMap();
        System.out.println(books);
    }

}

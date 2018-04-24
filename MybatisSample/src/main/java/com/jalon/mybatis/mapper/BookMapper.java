package com.jalon.mybatis.mapper;

import com.jalon.mybatis.entity.Book;
import com.jalon.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import java.util.List;
import javax.management.relation.Role;
import java.util.List;
import java.util.Map;

/**
 * Created by Jalon
 * 增加一些注解的用法
 */
public interface BookMapper {

    @Select("select id, name as roleName, price from book")
    List<Book> getAllBooks();

    @Select("select * from book where id=#{xx}")
    public Book getBookById(@Param("xx")int id);

    public int insertBook(Book book);

    //ID 自增
    public int insertAutoId(Book book);

    List<Book> getAllBookMap();

    int delete(@Param("tableName")String tableName,
               @Param("id")Long id);
}

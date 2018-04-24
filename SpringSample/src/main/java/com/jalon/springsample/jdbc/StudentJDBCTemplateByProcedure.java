package com.jalon.springsample.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * Created by JinQiu on 2018/4/22.
 */
public class StudentJDBCTemplateByProcedure implements StudentDAO {
    private DataSource dataSource;
    private SimpleJdbcCall jdbcCall;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcCall =  new SimpleJdbcCall(dataSource).
                        withProcedureName("getRecord");
    }
    public void create(String name, Integer age) {
        JdbcTemplate jdbcTemplateObject = new JdbcTemplate(dataSource);
        String SQL = "insert into Student (name, age) values (?, ?)";
        jdbcTemplateObject.update( SQL, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
        return;
    }

    //使用存储过程查询结果
    public Student getStudent(Integer id) {
        SqlParameterSource in = new MapSqlParameterSource().
                addValue("in_id", id);
        Map<String, Object> out = jdbcCall.execute(in);
        Student student = new Student();
        student.setId(id);
        student.setName((String) out.get("out_name"));
        student.setAge((Integer) out.get("out_age"));
        return student;
    }

    @Override
    public List<Student> listStudents() {
        return null;
    }

    @Override
    public void delete(Integer id) {
        //TODO
    }

    @Override
    public void update(Integer id, Integer age) {
        //TODO
    }
}
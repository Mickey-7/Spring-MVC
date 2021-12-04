package com.example.boottospringmvccrudjdbch2.repository;

import com.example.boottospringmvccrudjdbch2.model.Teacher;
import com.example.boottospringmvccrudjdbch2.util.TeacherRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class TeacherRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Teacher getTeacher(final int id){
        return jdbcTemplate.queryForObject(
                "select * from teacher where id = ?",
                new TeacherRowMapper(),
                id);
    }

    public List<Teacher> getTeachers(){
        return jdbcTemplate.query(
                "select * from teacher",
                new TeacherRowMapper()
        );
    }

    public void updateTeacher(final Teacher teacher){
        jdbcTemplate.update(
                "update teacher set name=?, expertise=? where id=?",
                teacher.getName(), teacher.getExpertise(), teacher.getId());
    }

    public void addTeacher(final Teacher teacher){
        jdbcTemplate.update(
                "insert into teacher values(?,?,?)",
                teacher.getId(),teacher.getName(), teacher.getExpertise());
    }

    public void deleteTeacher(final int id){
        jdbcTemplate.update(
                "delete from teacher where id=?",
                id);
    }

}

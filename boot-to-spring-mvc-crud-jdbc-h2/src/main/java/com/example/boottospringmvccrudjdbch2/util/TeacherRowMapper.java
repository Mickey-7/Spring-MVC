package com.example.boottospringmvccrudjdbch2.util;

import com.example.boottospringmvccrudjdbch2.model.Teacher;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TeacherRowMapper implements RowMapper<Teacher> {
    @Override
    public Teacher mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        return new Teacher(
                resultSet.getInt("id"),
                resultSet.getString("name"),
                resultSet.getString("expertise")
        );
    }
}

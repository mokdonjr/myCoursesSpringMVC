package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.ac.hansung.model.Course;

public class CourseMapper implements RowMapper<Course> {

	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Course course = new Course();
		
		course.setId(rs.getInt("id"));
		course.setYear(rs.getInt("year"));
		course.setSemester(rs.getInt("semester"));
		course.setCode(rs.getString("code"));
		course.setName(rs.getString("name"));
		course.setType(rs.getString("type"));
		course.setCredit(rs.getInt("credit"));

		return course;
	}

}
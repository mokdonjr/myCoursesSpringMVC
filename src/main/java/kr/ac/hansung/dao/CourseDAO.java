package kr.ac.hansung.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Course;

@Repository // @Component + DAO역할
public class CourseDAO {
	
	// DAO객체는 JdbcTemplate객체를 활용.
	private JdbcTemplate jdbcTemplateObject;

	// JdbcTemplate는 DataSource를 주입받은 객체.
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	/* DB에 쿼리를 전달 - Methods */
	public int getRowCount(){ // 테이블내 레코드 개수를 리턴
		String sqlStatement = "select count(*) from course";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
				//.queryForObject(sqlStatement, Integer.class); // sql문을 수행해 Integer타입의 객체를 반환
	}
	
	public Course getCourse(String name){ // querying and returning a single object
		String sqlStatement = "select * from course where name=?";
		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] {name}, new CourseMapper());
	}
	
	
	public boolean insert(Course course){ // querying and INSERT object
		
		int year = course.getYear();
		int semester = course.getSemester();
		String code = course.getCode();
		String name = course.getName();
		String type = course.getType();
		int credit = course.getCredit();
		
		String sqlStatement = "insert into course (year, semester, code, name, type, credit) values (?, ?, ?, ?, ?, ?)";
		return (this.jdbcTemplateObject.update(sqlStatement, new Object[] {year, semester, code, name, type, credit}) == 1);
		// update()는 update가 수행된 레코드 개수를 리턴
	}
	
	public boolean update(Course course){ // querying and INSERT object
		
		int id = course.getId();
		int year = course.getYear();
		int semester = course.getSemester();
		String code = course.getCode();
		String name = course.getName();
		String type = course.getType();
		int credit = course.getCredit();
		
		String sqlStatement = "update course set year=?, semester=?, code=?, name=?, type=?, credit=? where id=?";
		
		return (this.jdbcTemplateObject.update(sqlStatement, new Object[] {year, semester, code, name, type, credit, id}) == 1);
		// update()는 update가 수행된 레코드 개수를 리턴
	}
	
	public boolean delete(int id){ // querying and DELETE object
		
		String sqlStatement = "delete from course where id=?";
		
		return (this.jdbcTemplateObject.update(sqlStatement, new Object[]{id}) == 1);//id) == 1);
		// update()는 update가 수행된 레코드 개수를 리턴
	}

	public List<Course> getCourses(){ // querying and returning multiple objects
		String sqlStatement = "select * from Course";
		return jdbcTemplateObject.query(sqlStatement, new CourseMapper());
	}
	
	public List<Course> getCoursesJungi() {
		String sqlStatement = "select * from Course where type='전기'";
		return jdbcTemplateObject.query(sqlStatement, new CourseMapper());
	}

	public List<Course> getCoursesJunji() {
		String sqlStatement = "select * from Course where type='전지'";
		return jdbcTemplateObject.query(sqlStatement, new CourseMapper());
	}

	public List<Course> getCoursesJunsun() {
		String sqlStatement = "select * from Course where type='전선'";
		return jdbcTemplateObject.query(sqlStatement, new CourseMapper());
	}

	public List<Course> getCoursesIlgyo() {
		String sqlStatement = "select * from Course where type='일교'";
		return jdbcTemplateObject.query(sqlStatement, new CourseMapper());
	}

	public List<Course> getCoursesHakgyoA() {
		String sqlStatement = "select * from Course where type='핵교A'";
		return jdbcTemplateObject.query(sqlStatement, new CourseMapper());
	}

	public List<Course> getCoursesHakgyoB() {
		String sqlStatement = "select * from Course where type='핵교B'";
		return jdbcTemplateObject.query(sqlStatement, new CourseMapper());
	}

}

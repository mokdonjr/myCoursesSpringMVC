package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.CourseDAO;
import kr.ac.hansung.model.Course;

@Service // @Component + Service역할
public class CoursesService {
	
	/* Fields */
	private CourseDAO courseDAO;
	
	/* getters and setters */
	@Autowired // OfferDAO 타입을 가진 Bean이 DI된다. (DAO를 Service에 주입)
	public void setCourseDAO(CourseDAO courseDAO){
		this.courseDAO = courseDAO;
	}
	public CourseDAO getCourseDAO(){
		return this.courseDAO;
	}
	
	/* Methods */
	public void insert(Course course) {
		courseDAO.insert(course);
	}
	
	public List<Course> getCurrent(){
		return this.courseDAO.getCourses(); 
		// DAO에 getOffers()는 select * from offers 에대한 결과를 리턴한다.
	}
	
	public List<Course> getCurrentJungi() {
		return this.courseDAO.getCoursesJungi(); 
	}
	public List<Course> getCurrentJunji() {
		return this.courseDAO.getCoursesJunji(); 
	}
	public List<Course> getCurrentJunsun() {
		return this.courseDAO.getCoursesJunsun(); 
	}
	public List<Course> getCurrentIlgyo() {
		return this.courseDAO.getCoursesIlgyo(); 
	}
	public List<Course> getCurrentHakgyoA() {
		return this.courseDAO.getCoursesHakgyoA(); 
	}
	public List<Course> getCurrentHakgyoB() {
		return this.courseDAO.getCoursesHakgyoB(); 
	}
}

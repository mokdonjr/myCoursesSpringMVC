package kr.ac.hansung.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Course;
import kr.ac.hansung.service.CoursesService;

/* home.jsp 에서 링크된
 * '/offers' 와 '/createoffer' URL 에 대한 메소드를 정의  */
@Controller
public class CoursesController {
	
	/* Fields - Service를 사용 */
	private CoursesService coursesService;
	
	/* getters and setters */
	@Autowired // OffersService 타입을 가진 Bean이 DI된다. (Service를 Controller에 주입)
	public void setCoursesService(CoursesService coursesService){
		this.coursesService = coursesService;
	}
	public CoursesService getCoursesService(){
		return this.coursesService;
	}
	
	// '/offers' URL로 요청이 들어오면 showOffers메소드가 호출되어 offers.jsp로 이동
	@RequestMapping("/courses")
	public String showCourses(Model model){ // offers 테이블을 조회
		
		// 1. Service객체 호출 DB를 접근해 모든 테이블을 읽어옴
		List<Course> courses = coursesService.getCurrent(); 
		
		// 2. Model에 offers이름을 가진 테이블?(레코드?)을 넣어준다.
		model.addAttribute("courses", courses); 
		
		// 3. Model에 있는 offers를 View에 전달(View name을 리턴)
		return "courses"; 
	}
	@RequestMapping("/courses_jungi")
	public String showCoursesJungi(Model model){ // offers 테이블을 조회
		List<Course> coursesJungi = coursesService.getCurrentJungi(); 
		model.addAttribute("courses", coursesJungi); 
		return "courses_jungi"; 
	}
	@RequestMapping("/courses_junji")
	public String showCoursesJunji(Model model){ // offers 테이블을 조회
		List<Course> coursesJunji = coursesService.getCurrentJunji(); 
		model.addAttribute("courses", coursesJunji); 
		return "courses_junji"; 
	}
	@RequestMapping("/courses_junsun")
	public String showCoursesJunsun(Model model){ // offers 테이블을 조회
		List<Course> coursesJunsun = coursesService.getCurrentJunsun(); 
		model.addAttribute("courses", coursesJunsun); 
		return "courses_junsun"; 
	}
	@RequestMapping("/courses_ilgyo")
	public String showCoursesIlgyo(Model model){ // offers 테이블을 조회
		List<Course> coursesIlgyo = coursesService.getCurrentIlgyo(); 
		model.addAttribute("courses", coursesIlgyo); 
		return "courses_ilgyo"; 
	}
	@RequestMapping("/courses_hakgyoA")
	public String showCoursesHakgyoA(Model model){ // offers 테이블을 조회
		List<Course> coursesHakgyoA = coursesService.getCurrentHakgyoA(); 
		model.addAttribute("courses", coursesHakgyoA); 
		return "courses_hakgyoA"; 
	}
	@RequestMapping("/courses_hakgyoB")
	public String showCoursesHakgyoB(Model model){ // offers 테이블을 조회
		List<Course> coursesHakgyoB = coursesService.getCurrentHakgyoB(); 
		model.addAttribute("courses", coursesHakgyoB); 
		return "courses_hakgyoB"; 
	}
	
	
	// '/createoffer' URL로 요청이 들어오면 createOffer메소드가 호출되어 createoffer.jsp로 이동
	@RequestMapping("/createcourse")
	public String createOffer(Model model){
		
		model.addAttribute(new Course()); // Data-Buffering을 지원
		
		return "createcourse"; // View name을 리턴
	}
	
	/* '/docreate' URL로 request가 들어오면 doCreate메소드가 호출되어
	 * 사용자가 작성한 form data의 request parameter가 offer객체로 'Data Binding'이 이루어진다.
	 * 그리고 @Valid가 달린 Offer모델의 constraint에 의해 validation이 수행되며 
	 * 결과가 BindingResult에 저장된다. */
	@RequestMapping("/docreate")
	public String doCreate(Model model, @Valid Course course, BindingResult result){ // Data binding
		
		if(result.hasErrors()){
			System.out.println("From data does not validate");
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError error : errors)
				System.out.println(error.getDefaultMessage());
			return "createcourse"; // 사용자 다시 입력
		}
		
		coursesService.insert(course);
		return "coursecreated";
	}
}

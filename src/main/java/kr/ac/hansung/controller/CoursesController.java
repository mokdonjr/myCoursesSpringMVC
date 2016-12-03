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

/* home.jsp ���� ��ũ��
 * '/offers' �� '/createoffer' URL �� ���� �޼ҵ带 ����  */
@Controller
public class CoursesController {
	
	/* Fields - Service�� ��� */
	private CoursesService coursesService;
	
	/* getters and setters */
	@Autowired // OffersService Ÿ���� ���� Bean�� DI�ȴ�. (Service�� Controller�� ����)
	public void setCoursesService(CoursesService coursesService){
		this.coursesService = coursesService;
	}
	public CoursesService getCoursesService(){
		return this.coursesService;
	}
	
	// '/offers' URL�� ��û�� ������ showOffers�޼ҵ尡 ȣ��Ǿ� offers.jsp�� �̵�
	@RequestMapping("/courses")
	public String showCourses(Model model){ // offers ���̺��� ��ȸ
		
		// 1. Service��ü ȣ�� DB�� ������ ��� ���̺��� �о��
		List<Course> courses = coursesService.getCurrent(); 
		
		// 2. Model�� offers�̸��� ���� ���̺�?(���ڵ�?)�� �־��ش�.
		model.addAttribute("courses", courses); 
		
		// 3. Model�� �ִ� offers�� View�� ����(View name�� ����)
		return "courses"; 
	}
	@RequestMapping("/courses_jungi")
	public String showCoursesJungi(Model model){ // offers ���̺��� ��ȸ
		List<Course> coursesJungi = coursesService.getCurrentJungi(); 
		model.addAttribute("courses", coursesJungi); 
		return "courses_jungi"; 
	}
	@RequestMapping("/courses_junji")
	public String showCoursesJunji(Model model){ // offers ���̺��� ��ȸ
		List<Course> coursesJunji = coursesService.getCurrentJunji(); 
		model.addAttribute("courses", coursesJunji); 
		return "courses_junji"; 
	}
	@RequestMapping("/courses_junsun")
	public String showCoursesJunsun(Model model){ // offers ���̺��� ��ȸ
		List<Course> coursesJunsun = coursesService.getCurrentJunsun(); 
		model.addAttribute("courses", coursesJunsun); 
		return "courses_junsun"; 
	}
	@RequestMapping("/courses_ilgyo")
	public String showCoursesIlgyo(Model model){ // offers ���̺��� ��ȸ
		List<Course> coursesIlgyo = coursesService.getCurrentIlgyo(); 
		model.addAttribute("courses", coursesIlgyo); 
		return "courses_ilgyo"; 
	}
	@RequestMapping("/courses_hakgyoA")
	public String showCoursesHakgyoA(Model model){ // offers ���̺��� ��ȸ
		List<Course> coursesHakgyoA = coursesService.getCurrentHakgyoA(); 
		model.addAttribute("courses", coursesHakgyoA); 
		return "courses_hakgyoA"; 
	}
	@RequestMapping("/courses_hakgyoB")
	public String showCoursesHakgyoB(Model model){ // offers ���̺��� ��ȸ
		List<Course> coursesHakgyoB = coursesService.getCurrentHakgyoB(); 
		model.addAttribute("courses", coursesHakgyoB); 
		return "courses_hakgyoB"; 
	}
	
	
	// '/createoffer' URL�� ��û�� ������ createOffer�޼ҵ尡 ȣ��Ǿ� createoffer.jsp�� �̵�
	@RequestMapping("/createcourse")
	public String createOffer(Model model){
		
		model.addAttribute(new Course()); // Data-Buffering�� ����
		
		return "createcourse"; // View name�� ����
	}
	
	/* '/docreate' URL�� request�� ������ doCreate�޼ҵ尡 ȣ��Ǿ�
	 * ����ڰ� �ۼ��� form data�� request parameter�� offer��ü�� 'Data Binding'�� �̷������.
	 * �׸��� @Valid�� �޸� Offer���� constraint�� ���� validation�� ����Ǹ� 
	 * ����� BindingResult�� ����ȴ�. */
	@RequestMapping("/docreate")
	public String doCreate(Model model, @Valid Course course, BindingResult result){ // Data binding
		
		if(result.hasErrors()){
			System.out.println("From data does not validate");
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError error : errors)
				System.out.println(error.getDefaultMessage());
			return "createcourse"; // ����� �ٽ� �Է�
		}
		
		coursesService.insert(course);
		return "coursecreated";
	}
}

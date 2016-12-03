package kr.ac.hansung.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller // @Component + 컨트롤러 역할
public class HomeController {
	
	// '/' URL로 요청이 들어오면 showHome메소드가 호출되어 home.jsp로 이동
	@RequestMapping(value = "/", method = RequestMethod.GET) // root에 매핑
	public String showHome() {//Locale locale, Model model) {
	
		return "home"; // View's logical name (InternalResourceViewResolver에 의해 prefix(경로), suffix(.jsp))
	}
	
}

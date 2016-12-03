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
@Controller // @Component + ��Ʈ�ѷ� ����
public class HomeController {
	
	// '/' URL�� ��û�� ������ showHome�޼ҵ尡 ȣ��Ǿ� home.jsp�� �̵�
	@RequestMapping(value = "/", method = RequestMethod.GET) // root�� ����
	public String showHome() {//Locale locale, Model model) {
	
		return "home"; // View's logical name (InternalResourceViewResolver�� ���� prefix(���), suffix(.jsp))
	}
	
}

package kr.ac.hansung.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/*  DB의 레코드을 읽어 객체로 저장하기 위한 클래스 */
public class Course {
	
	/* Fields */
	private int id;
	private int year;
	private int semester;
	@Size(min=5, max=10, message="Course Name must be between 5 and 10 chars")
	private String code;
	@Size(min=5, max=100, message="Course Name must be between 5 and 100 chars")
	private String name;
	private String type;
	private int credit;
	
//	@Size(min=2, max=100, message="Name must be between 2 and 100 chars")
//	private String name;
//	@Email(message="Please provide a valid email address")
//	@NotEmpty(message="The email address cannot be empty")
//	private String email;
//	@Size(min=5, max=100, message="Text must be between 5 and 100 chars")
//	private String text;
	
	/* Constructors */
	public Course(int id, int year, int semester, String code, String name, String type, int credit) {
		this.id = id;
		this.year = year;
		this.semester = semester;
		this.code = code;
		this.name = name;
		this.type = type;
		this.credit = credit;
	}
	
	// id는 auto_increment로 설정이 되어있기 때문에 이 생성자를 이용.
	public Course(int year, int semester, String code, String name, String type, int credit) {
		this.year = year;
		this.semester = semester;
		this.code = code;
		this.name = name;
		this.type = type;
		this.credit = credit;
	}
	
	

	// 빈 객체를 생성할 때 이용.
	public Course(){
		
	}

	/* getters and setters */
	public int getId() { return id; }

	public void setId(int id) { this.id = id; }

	public int getYear() { return year; }

	public void setYear(int year) { this.year = year; }

	public int getSemester() { return semester; }

	public void setSemester(int semester) { this.semester = semester; }

	public String getCode() { return code; }

	public void setCode(String code) { this.code = code; }

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public String getType() { return type; }

	public void setType(String type) { this.type = type; }

	public int getCredit() { return credit; }

	public void setCredit(int credit) { this.credit = credit; }
	
	/* Methods */
	@Override
	public String toString() { // 출력할 때 이용
		return "Course [id=" + id + ", 수강년도=" + year + ", 수강학기=" + semester 
				+ ", 교과목코드=" + code + ", 교과목명=" + name + ", 이수구분=" + type + 
				", 학점=" + credit + "]";
	}
	
}

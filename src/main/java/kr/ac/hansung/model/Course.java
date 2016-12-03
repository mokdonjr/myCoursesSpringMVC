package kr.ac.hansung.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/*  DB�� ���ڵ��� �о� ��ü�� �����ϱ� ���� Ŭ���� */
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
	
	// id�� auto_increment�� ������ �Ǿ��ֱ� ������ �� �����ڸ� �̿�.
	public Course(int year, int semester, String code, String name, String type, int credit) {
		this.year = year;
		this.semester = semester;
		this.code = code;
		this.name = name;
		this.type = type;
		this.credit = credit;
	}
	
	

	// �� ��ü�� ������ �� �̿�.
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
	public String toString() { // ����� �� �̿�
		return "Course [id=" + id + ", �����⵵=" + year + ", �����б�=" + semester 
				+ ", �������ڵ�=" + code + ", �������=" + name + ", �̼�����=" + type + 
				", ����=" + credit + "]";
	}
	
}

package b10_클래스;

public class Student {

	private String name;
	private String schoolName;
	private int year; //학년
	
	
	//오버로딩 했을때는 기본생성자가 꼭 있어야 한다.
	
	//기본 생성자
	public Student() {
		
	}
	
	
	public Student(String name, int year) {
		super(); //상속 관계
		
		this.name = name + " 학생";  //this. = 내 클래스 자신에서 찾아라.
		this.year = year;
	}
	
		
	public Student(String name, String schoolName, int year) {
		super(); //상속 관계
		
		this.name = name;  //this. = 내 클래스 자신에서 찾아라.
		this.schoolName = schoolName;
		this.year = year;
	}
	
	public void setName(String name) {
		this.name = name + " 학생";
	}

	public String getName(){
		return name;
	}

	
	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}

	public void getFreebies() {
		Regular regular = new Regular();
		
		regular.setYearCheck(year, schoolName);
		
		if(regular.isYearCheck()) {
			System.out.println("사은품 대상자");
		} else {
			System.out.println("대상자 제외");
		}
	}
	

	public void showInfo() {
		System.out.println("학생 정보");
		System.out.println("이름 : " + name);
		System.out.println("학교 : " + schoolName);
		System.out.println("학년 : " + year);
	}
	
	
	
}

package class0106_2;

public class Main {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("홍길동");
		s.setTel("010-1234-1234");
		s.setEmail("hong@naver.com");
		s.showStudentInfo();
		
		Student s2 = new Student();
		s.setName("최길동");
		s.setTel("010-1234-1111");
		s.setEmail("choi@naver.com");
		s.showStudentInfo();
	}

}

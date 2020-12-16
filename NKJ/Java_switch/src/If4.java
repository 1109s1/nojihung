import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("연도를 입력하세요.");
		int year = s.nextInt();
		
		if (year %4 == 0 && year % 100 !=0) || 
			(year % 400 == 0) {
			System.out.println("윤년입니다.");
		
		}
		else {
			System.out.println("윤년이 아닙니다.");
			
		}
	}

}

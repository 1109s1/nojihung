import java.util.Scanner;

public class Itest4 {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		int year = 0;

		System.out.println(" -------------------------");
		System.out.println(" 년도별 윤년 구분 프로그램 V1.0");
		System.out.println(" -------------------------");
		System.out.println(" 년도를 입력하세요.");
		year = s.nextInt();
	
		if ((year%4 == 0) && (year%100 != 0) || (year%400 == 0)) {
			System.out.println(year + "년은 윤년입니다.");
			
		}
		else {
			System.out.println(year + "년은 윤년이 아닙니다.");
			
		}
	}

}

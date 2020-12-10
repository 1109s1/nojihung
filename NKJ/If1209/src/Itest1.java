import java.util.Scanner;

public class Itest1 {

	public static void main(String[] args) {
		
		System.out.println("--------------------");
		System.out.println("홀짝 판단 프로그램 V1.0");
		System.out.println("--------------------");
		
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		
		int num = s.nextInt();
		
		if (num %2 != 0) {
			System.out.println("홀수 입니다.");
			
		}
		else {
			System.out.println("짝수 입니다.");
		}
		
		
		
		
		
	}

}

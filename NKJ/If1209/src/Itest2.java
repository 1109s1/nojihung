import java.util.Scanner;

public class Itest2 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("--------------------");
		System.out.println("대소 비교 프로그램 V1.0");
		System.out.println("--------------------");
		
		
		System.out.println("num1 입력 : ");
		
		
		float num1 = s.nextFloat();
		
		System.out.println("num2 입력 : ");
		float num2 = s.nextFloat();
		
		if (num1 > num2) {
			System.out.println("num1이 num2보다 크다.");
			
		}
		
		else if (num1 < num2) {
			System.out.println("num2가 num1보다 크다.");
			
		}
		
		else {
			System.out.println("num1과 num2는 같다.");
		}
		
		
	}

}

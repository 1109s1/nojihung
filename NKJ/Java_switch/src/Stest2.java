import java.util.Scanner;

public class Stest2 {

	public static void main(String[] args) {

		System.out.println("----------------------");
		System.out.println("간단한 계산기 프로그램 V1.0");
		System.out.println("----------------------");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Num1 입력 =>");
		double a1 = s.nextDouble();
		
		System.out.println("Num2 입력 =>");
		double a2 = s.nextDouble();
		
		System.out.println("연산자 입력");
		String ab = s.next();
		double result = 0;
		
		switch(ab) {
		case "+" :
			result = a1 + a2;
			break;
		case "-" :
			result = a1 - a2;
			break;
		case "*" :
			result = a1 * a2;
			break;
		case "/" :
			result = a1 / a2;
		default :
			System.out.println("다시해 틀렸어!");
		}
	System.out.println("결과값 :" + result);
	s.close();}
	

}

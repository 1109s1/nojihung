import java.util.Scanner;

public class Stest2 {

	public static void main(String[] args) {

		System.out.println("----------------------");
		System.out.println("������ ���� ���α׷� V1.0");
		System.out.println("----------------------");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Num1 �Է� =>");
		double a1 = s.nextDouble();
		
		System.out.println("Num2 �Է� =>");
		double a2 = s.nextDouble();
		
		System.out.println("������ �Է�");
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
			System.out.println("�ٽ��� Ʋ�Ⱦ�!");
		}
	System.out.println("����� :" + result);
	s.close();}
	

}

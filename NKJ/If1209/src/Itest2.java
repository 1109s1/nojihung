import java.util.Scanner;

public class Itest2 {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("--------------------");
		System.out.println("��� �� ���α׷� V1.0");
		System.out.println("--------------------");
		
		
		System.out.println("num1 �Է� : ");
		
		
		float num1 = s.nextFloat();
		
		System.out.println("num2 �Է� : ");
		float num2 = s.nextFloat();
		
		if (num1 > num2) {
			System.out.println("num1�� num2���� ũ��.");
			
		}
		
		else if (num1 < num2) {
			System.out.println("num2�� num1���� ũ��.");
			
		}
		
		else {
			System.out.println("num1�� num2�� ����.");
		}
		
		
	}

}

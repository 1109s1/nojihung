import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ư�� �ݾ�");
		
		int money = s.nextInt();
		int a = 0; // 500��
		int b = 0; // 100��
		int c = 0; // 50��
		int d = 0; //10��
		
		
		a= 500; b= 100; c= 50; d=10;
		int num1 = money/a;
		int num2 = (money%a)/b;
		int num3 = (money%a%b)/c;
		int num4 = (money%a%b%c)/d;
		int num5 = money%a%b%c%d;
		
		System.out.println("------------------------");
		System.out.println(" ���� ��ȯ�� ���α׷� 1.0");
		System.out.println("------------------------");
		System.out.println("����� ���� : " + num1);
		System.out.println("��� ���� : " + num2);
		System.out.println("���ʿ� ���� : " + num3);
		System.out.println("�ʿ� ���� : " + num4);
		System.out.println("�ٲ��� ���� �ܵ� : " + num5);
		System.out.println("--------------------------");
				
		s.close();
	

	}

}


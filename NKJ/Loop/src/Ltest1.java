import java.util.Scanner;

public class Ltest1 {

	public static void main(String[] args) {

		System.out.println("------------------------");
		System.out.println(" ¦��, Ȧ�� ���� ���α׷� v1.0");
		System.out.println("------------------------");
		//Scanner Ŭ���� ��ü ���� (s���� ����)
		Scanner s = new Scanner(System.in);
		for (int i=1; i<10; i++) {
		System.out.print((i)+".Num" + (i) + "=>");
		int num = s.nextInt();
		if (num%2 == 0) {
			System.out.println("¦���Դϴ�.");
			
		}
		else {
			System.out.println("Ȧ���Դϴ�.");
		}
		
	}

	}
}

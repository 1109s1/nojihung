import java.util.Scanner;

public class Itest1 {

	public static void main(String[] args) {
		
		System.out.println("--------------------");
		System.out.println("Ȧ¦ �Ǵ� ���α׷� V1.0");
		System.out.println("--------------------");
		
		Scanner s = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		
		int num = s.nextInt();
		
		if (num %2 != 0) {
			System.out.println("Ȧ�� �Դϴ�.");
			
		}
		else {
			System.out.println("¦�� �Դϴ�.");
		}
		
		
		
		
		
	}

}

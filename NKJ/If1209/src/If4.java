import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է� : ");
		int num = s.nextInt();
		
				
		if(100 >= num && num >= 90) {
			System.out.println("A����");
		}
		else if (89 >= num && 80 <= num) {
			System.out.println("B����");
		}
		else {
			System.out.println("A, B���� ����");
			
		}
	}

}

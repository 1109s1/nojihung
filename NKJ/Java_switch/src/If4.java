import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int year = s.nextInt();
		
		if (year %4 == 0 && year % 100 !=0) || 
			(year % 400 == 0) {
			System.out.println("�����Դϴ�.");
		
		}
		else {
			System.out.println("������ �ƴմϴ�.");
			
		}
	}

}

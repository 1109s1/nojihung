import java.util.Scanner;

public class Itest4 {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		int year = 0;

		System.out.println(" -------------------------");
		System.out.println(" �⵵�� ���� ���� ���α׷� V1.0");
		System.out.println(" -------------------------");
		System.out.println(" �⵵�� �Է��ϼ���.");
		year = s.nextInt();
	
		if ((year%4 == 0) && (year%100 != 0) || (year%400 == 0)) {
			System.out.println(year + "���� �����Դϴ�.");
			
		}
		else {
			System.out.println(year + "���� ������ �ƴմϴ�.");
			
		}
	}

}

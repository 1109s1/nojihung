import java.util.Scanner;

public class Test5_1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("�������� : " );
		int kor = s.nextInt();
		
		System.out.println("�������� : ");
		int eng = s.nextInt();
		
		System.out.println("�������� : ");
		int mat = s.nextInt();
		;
		System.out.println("�������� : ");
		int sci = s.nextInt();
		
		
		
		int sum = kor + eng + sci + mat;
		int ave = sum/4;
		System.out.println("��հ� " + ave);
		System.out.println("���� : " + sum);
		s.close();
		

	}

}

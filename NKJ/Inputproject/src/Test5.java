import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		float pi = 3.14f;
		System.out.println("������ ���ϱ� : ");
		float ban = s.nextFloat();
		System.out.println(pi * ban * ban);
		
		int kor = s.nextInt();
		System.out.println("�������� : " );
		int eng = s.nextInt();
		System.out.println("�������� : ");
		int mat = s.nextInt();
		System.out.println("�������� : ");
		int sci = s.nextInt();
		System.out.println("�������� : ");
		
		int sum = kor + eng + sci + mat;
		int ave = sum/4;
		System.out.println("��հ� " + ave);
		System.out.println("���� : " + sum);
		s.close();
		
	}

}

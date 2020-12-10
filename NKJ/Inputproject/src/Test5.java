import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		float pi = 3.14f;
		System.out.println("반지름 구하기 : ");
		float ban = s.nextFloat();
		System.out.println(pi * ban * ban);
		
		int kor = s.nextInt();
		System.out.println("국어점수 : " );
		int eng = s.nextInt();
		System.out.println("영어점수 : ");
		int mat = s.nextInt();
		System.out.println("수학점수 : ");
		int sci = s.nextInt();
		System.out.println("과학점수 : ");
		
		int sum = kor + eng + sci + mat;
		int ave = sum/4;
		System.out.println("평균값 " + ave);
		System.out.println("총점 : " + sum);
		s.close();
		
	}

}

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("특정 금액");
		
		int money = s.nextInt();
		int a = 0; // 500원
		int b = 0; // 100원
		int c = 0; // 50원
		int d = 0; //10원
		
		
		a= 500; b= 100; c= 50; d=10;
		int num1 = money/a;
		int num2 = (money%a)/b;
		int num3 = (money%a%b)/c;
		int num4 = (money%a%b%c)/d;
		int num5 = money%a%b%c%d;
		
		System.out.println("------------------------");
		System.out.println(" 동전 교환기 프로그램 1.0");
		System.out.println("------------------------");
		System.out.println("오백원 갯수 : " + num1);
		System.out.println("백원 갯수 : " + num2);
		System.out.println("오십원 갯수 : " + num3);
		System.out.println("십원 갯수 : " + num4);
		System.out.println("바꾸지 못한 잔돈 : " + num5);
		System.out.println("--------------------------");
				
		s.close();
	

	}

}


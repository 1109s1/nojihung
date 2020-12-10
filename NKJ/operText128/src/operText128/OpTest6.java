package operText128;

import java.util.Scanner;

public class OpTest6 {

	public static void main(String[] args) {

		int coin500 = 0;
		int coin100 = 0;
		int coin50 = 0;
		int coin10 = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("금액을 입력하세요 : ");
		int input = s.nextInt();
		coin500 = input / 500;
		int namg = input % 500;
		System.out.println("500원 나머지 : " + namg);
				
		coin100 = namg / 100;
		namg = namg%100;    // namg %= 100;
		System.out.println("100원 나머지" + namg);
		coin50 = namg / 50;
		namg = namg%50;
		System.out.println("50원 나머지" + namg);
		coin10 = namg / 10;
		namg = namg%10;
		System.out.println("10원 나머지:" + namg);
		
		
		System.out.println("--------------------------");
		System.out.println("동전 교환기 프로그램 1.0");
		System.out.println("--------------------------");
		System.out.println("오백원 갯수           : " + coin500 +"개");
		System.out.println("백원 갯수             : " + coin100 + "개");
		System.out.println("오십원 갯수           : " + coin50 + "개");
		System.out.println("십원 갯수             : " + coin10 + "개");
		System.out.println("나머지 잔돈 갯수        : 개");
		System.out.println("--------------------------");
		s.close();
	}

}

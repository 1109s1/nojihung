import java.io.IOException;
import java.util.Scanner;

public class Stset1 {

	public static void main(String[] args) throws IOException {
	
		System.out.println("----------------------------");
		System.out.println(" 식당 메뉴 자동 주문 프로그램 V1.0");
		System.out.println("----------------------------");
		System.out.println("원하는 식사를 선택하세요.");
		System.out.println("1. 김치찌개 : 5,000원");
		System.out.println("2. 된장찌개 : 5,000원");
		System.out.println("3. 칼국수 : 4,500원");
		System.out.println("4. 잔치국수 : 4,000원");
		System.out.println("5. 비빔밥 : 5,000원");
		Scanner s = new Scanner(System.in);
		System.out.print("메뉴를 선택하세요 : ");
		char str = (char)System.in.read();
		
		switch(str) {
		case 'a' :
			System.out.println("김치찌개를 주문했습니다.");
			break;
			
		case 'b' :
			System.out.println("된장찌개를 주문했습니다.");
			break;
			
		case 'c' :
			System.out.println("비빔밥을 주문했습니다.");
			break;
			
		case 'd' :
			System.out.println("잔치국수를 주문했습니다.");
			break;
			
		case 'e' :
			System.out.println("비빔밥을 주문했습니다.");
			break;
			default :
				System.out.println("없는 메뉴입니다.");
			
	}
		s.close();
}
}

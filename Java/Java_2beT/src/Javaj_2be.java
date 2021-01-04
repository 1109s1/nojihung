import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Javaj_2be {

	public static void main(String[] args) {


		//7번 문제
		Scanner s = new Scanner(System.in);
		String last[] = {"김", "박", "이", "최", "장"};
		String first[] = { "바", "사", "아", "자", "차"};
		String mid [] = {"가", "나", "다", "라", "마"};
		String [] fullName = new String[50];
		
		while (true) {
		System.out.println("-----------------------------");
		System.out.println("파일 제어 프로그램 v1.0");
		System.out.println("----------------------------");
		System.out.println("1.이름 생성하여 파일에 저장하기");
		System.out.println("2.파일에서 이름 읽어오기");
		System.out.println("3.프로그램 종료");
		System.out.println("-----------------------------");
		System.out.println("메뉴를 선택하세요:");
		int menu = s.nextInt();
		switch (menu) {
		case 1 :
			BufferedOutputStream bs = null;
			String fileName;
			bs = new BufferedOutputStream(new 
					FileOutputStream(fileName));
			for ( int i=0;i<fullName.length;i++) {
				int rand = (int)(Math.random()*5);
				fullName[i] = last[(int)(Math.random()*5)];
				mid [(int)(Math.random()*5)];
				first[(int)(Math.random()*5)];
				bs.write(fullName[i].getBytes());
				//System.out.println(fullName[i]);
				//fullName[i] = last[rand] +mid[rand] +first[rand];
			}
			break;
		case 2 :
			break;
		case 3 :
			System.exit(0);
			break;
		default:
			System.out.println("잘못된 메뉴 선택!");
			break;
		}
		}
	}

}

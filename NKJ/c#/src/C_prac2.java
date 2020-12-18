import java.util.Scanner;

public class C_prac2 {

	public static void main(String[] args) {
		
		int sec;
		int min;
		System.out.println("초를 입력하세용.");
		
		Scanner s = new Scanner(System.in);
		sec = s.nextInt();
		min = sec/60;
		sec = sec%60;
		System.out.println(min + "분" + sec + "초");
		
	}

}

import java.util.Scanner;

public class C_prac2 {

	public static void main(String[] args) {
		
		int sec;
		int min;
		System.out.println("�ʸ� �Է��ϼ���.");
		
		Scanner s = new Scanner(System.in);
		sec = s.nextInt();
		min = sec/60;
		sec = sec%60;
		System.out.println(min + "��" + sec + "��");
		
	}

}

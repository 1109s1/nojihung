import java.io.IOException;
import java.util.Scanner;

public class Stset1 {

	public static void main(String[] args) throws IOException {
	
		System.out.println("----------------------------");
		System.out.println(" �Ĵ� �޴� �ڵ� �ֹ� ���α׷� V1.0");
		System.out.println("----------------------------");
		System.out.println("���ϴ� �Ļ縦 �����ϼ���.");
		System.out.println("1. ��ġ� : 5,000��");
		System.out.println("2. ����� : 5,000��");
		System.out.println("3. Į���� : 4,500��");
		System.out.println("4. ��ġ���� : 4,000��");
		System.out.println("5. ����� : 5,000��");
		Scanner s = new Scanner(System.in);
		System.out.print("�޴��� �����ϼ��� : ");
		char str = (char)System.in.read();
		
		switch(str) {
		case 'a' :
			System.out.println("��ġ��� �ֹ��߽��ϴ�.");
			break;
			
		case 'b' :
			System.out.println("������� �ֹ��߽��ϴ�.");
			break;
			
		case 'c' :
			System.out.println("������� �ֹ��߽��ϴ�.");
			break;
			
		case 'd' :
			System.out.println("��ġ������ �ֹ��߽��ϴ�.");
			break;
			
		case 'e' :
			System.out.println("������� �ֹ��߽��ϴ�.");
			break;
			default :
				System.out.println("���� �޴��Դϴ�.");
			
	}
		s.close();
}
}

import java.util.Scanner;

public class If5 {

	public static void main(String[] args) {

		Scanner s = s.next();
		System.out.println("-------------------");
		System.out.println("����, ����, �� �Է� : ");
		System.out.println("-------------------");
		System.out.println("ȫ�浿 �Է� : ");
		String hong = s.next();
		System.out.println("��浿 �Է� : ");
		String kim = s.next();
		
		//String ���ڿ� ��
		if (hong.equals("����")) 
			if(kim.equals("����")) {
				System.out.println("�����ϴ�.");
		}
			else if (kim.equals("����")) {
				System.out.println("��浿�� �̰���ϴ�.");
		}
			
			else (kim.equals("��")) {
				System.out.println("ȫ�浿�� �̰���ϴ�.");
			}
			else if (kim.equals("����")) {
				System.out.println("��浿�� �̰���ϴ�.");
			}
	
			
			else if (kim.equals("����")){
				System.out.println("ȫ�浿�� �̰���ϴ�.");
			}
			else if (kim.equals("��")) {
				System.out.println("�����ϴ�.");
			}
	}
}

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Javaj_2be {

	public static void main(String[] args) {


		//7�� ����
		Scanner s = new Scanner(System.in);
		String last[] = {"��", "��", "��", "��", "��"};
		String first[] = { "��", "��", "��", "��", "��"};
		String mid [] = {"��", "��", "��", "��", "��"};
		String [] fullName = new String[50];
		
		while (true) {
		System.out.println("-----------------------------");
		System.out.println("���� ���� ���α׷� v1.0");
		System.out.println("----------------------------");
		System.out.println("1.�̸� �����Ͽ� ���Ͽ� �����ϱ�");
		System.out.println("2.���Ͽ��� �̸� �о����");
		System.out.println("3.���α׷� ����");
		System.out.println("-----------------------------");
		System.out.println("�޴��� �����ϼ���:");
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
			System.out.println("�߸��� �޴� ����!");
			break;
		}
		}
	}

}

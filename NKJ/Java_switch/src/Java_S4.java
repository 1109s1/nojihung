
public class Java_S4 {

	public static void main(String[] args) {

		//Mathe ���� Ŭ����
		//0~3
		int time = (int)(Math.random()*4)+3;
		System.out.println("���� �ð� : " + time);
		switch (time) {
		case 8:
			System.out.println("���");
		case 9:
			System.out.println("ȸ��");
		case 10:
			System.out.println("����");
		default:
			System.out.println("����");
			
		}
		
	}

}

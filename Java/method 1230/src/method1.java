
public class method1 {

	public static void main(String[] args) {
		System.out.println("func() ȣ����");
		func(); // �޽�� ���(ȣ��)
		System.out.println("func() ȣ����");
		
		System.out.println("�ݺ��� �޽�� ȣ��");
		for (int i=0; i<5; i++) {
			func();
		}
	}
	
	//�޽�� ����
	public static void func() {
		System.out.println("�޽�� ���");
	}

}

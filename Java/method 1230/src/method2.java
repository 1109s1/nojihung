
public class method2 {
	

	

	{	
	}
	public static void func() {
		System.out.println("func() ���");
		// �޼ҵ� ������ �ٸ� �޽�带 ȣ�� ����
		func1();
	}
	public static void func1() {
		System.out.println("func() ���");
		func2();
	}
	public static void func2() {
		System.out.println("func() ���");
		
		
	}
	
	public static void main(String[] args) {
		func();
		System.out.println("��� �޽�� ����");
}
}
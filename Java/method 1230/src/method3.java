
public class method3 {
	static int num = 200; // 전역변수
	public static void func() {
		
		int num = 100; // 지역변수
		System.out.println("num: " + num1);
	}

	public static void main(String[] args) {
		System.out.println("num: " + num);
		func();

		
	}

}

package operText128;

public class OpTest2 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 0;
		
		// ++, -- ���������� ( �տ� ������ �ٷ� �ڿ������� �����Ϳ� ++,--)
		// 1����, 1����
		num2 = num1++;
		System.out.println("num2 :" + num2);
		
		num2 = ++num1;
		System.out.println("num2 :" + num2);
		
		num2 = num1--;
		System.out.println("num2 : " + num2);
		

	}

}

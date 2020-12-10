package operText128;

public class OpTest2 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 0;
		
		// ++, -- 증감연산자 ( 앞에 붙으면 바로 뒤에붙으면 다음것에 ++,--)
		// 1증가, 1감소
		num2 = num1++;
		System.out.println("num2 :" + num2);
		
		num2 = ++num1;
		System.out.println("num2 :" + num2);
		
		num2 = num1--;
		System.out.println("num2 : " + num2);
		

	}

}

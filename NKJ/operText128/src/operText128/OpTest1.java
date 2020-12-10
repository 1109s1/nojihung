package operText128;

public class OpTest1 {

	public static void main(String[] args) {
		int num1 =  2, num2 =3, num3 =4;
		
		// 연산자 우선순위
		// *,/ > +.-
		int result = num1 + num2 - num3;
		System.out.println("result: " + result);
		
		int result2 = num1 + (num2 - num3);
		System.out.println("result2 :" +result2);
		
		// * > +
		result = num1 + num2 * num3;
		System.out.println("result : " + result);
		
		// (+) > *
		result = (num1 + num2) * num3;
		System.out.println("result: " + result);
		
		result = num1 * num2 / num3;
		System.out.println("result : " + result);
		
		// %나머지 연산자 4 $ 3 (뒷숫자 -1까지의 값이 나옴 항상)
		// x % 2 --> 0, 1
		// x % 3 --> 0, 1, 2
		// x % 4 --> 0, 1, 2, 3
		result = num3 % num2;
		System.out.println("result: " + result);

	}

}

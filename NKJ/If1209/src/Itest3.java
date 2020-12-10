import java.util.Scanner;

public class Itest3 {

	public static void main(String[] args) {

		System.out.println("----------------------");
		System.out.println("간단한 계산기 프로그램 V1.0");
		System.out.println("----------------------");

		System.out.println("숫자 두개를 입력하세요.");

		Scanner s = new Scanner(System.in);

		double num1 = s.nextDouble();

		double num2 = s.nextDouble();

		System.out.println("연산을 입력하세요.");
		String operator = s.next();

		if (operator.equals("+")) {

			System.out.println("결과는 " + num1 + " + " + num2 + " = " + (num1 + num2) + " 입니다.");

		} else if (operator.equals("-")) {

			System.out.println("결과는 " + num1 + " - " + num2 + " = " + (num1 - num2) + " 입니다.");

		} else if (operator.equals("*")) {

			System.out.println("결과는 " + num1 + " * " + num2 + " = " + (num1 * num2) + " 입니다.");

		} else if (operator.equals("/")) {

			System.out.println("결과는 " + num1 + " / " + num2 + " = " + (num1 / num2) + " 입니다.");

		}

	}

}

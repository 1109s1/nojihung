import java.util.Scanner;

public class Itest3 {

	public static void main(String[] args) {

		System.out.println("----------------------");
		System.out.println("������ ���� ���α׷� V1.0");
		System.out.println("----------------------");

		System.out.println("���� �ΰ��� �Է��ϼ���.");

		Scanner s = new Scanner(System.in);

		double num1 = s.nextDouble();

		double num2 = s.nextDouble();

		System.out.println("������ �Է��ϼ���.");
		String operator = s.next();

		if (operator.equals("+")) {

			System.out.println("����� " + num1 + " + " + num2 + " = " + (num1 + num2) + " �Դϴ�.");

		} else if (operator.equals("-")) {

			System.out.println("����� " + num1 + " - " + num2 + " = " + (num1 - num2) + " �Դϴ�.");

		} else if (operator.equals("*")) {

			System.out.println("����� " + num1 + " * " + num2 + " = " + (num1 * num2) + " �Դϴ�.");

		} else if (operator.equals("/")) {

			System.out.println("����� " + num1 + " / " + num2 + " = " + (num1 / num2) + " �Դϴ�.");

		}

	}

}

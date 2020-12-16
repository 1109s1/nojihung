import java.util.Random;
import java.util.Scanner;

public class Ltest3 {

	public static void main(String[] args) {

		System.out.println("---------------------");
		System.out.println(" 간단한 로또 프로그램 v1.0");
		System.out.println("---------------------");
	
		
		int num[]= new int[6];
		for(int i=0; i<6; i++) {
			num[i]=(int)(Math.random()*45)+1;
			
		
		for(int j=0; j<i; j++) {
			if(num[i] == num[j]) {
				i--;
				break;
			}
		}
		}
		System.out.println("로또 번호 : ");
		
		for(int i=0; i<6; i++) {
			System.out.println(num[i]+"");
		}
		
	
	}

}

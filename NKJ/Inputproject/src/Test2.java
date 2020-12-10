
public class Test2 {

	
	public static void main(String[] args) {
		
		int kor = 0;
		kor = 90;
		System.out.println("국어: " + kor);
		
		int eng = 0;
		eng = 80;
		System.out.println("영어 : " + eng);
		
		int mat = 0;
		mat = 70;
		System.out.println("수학 : " + mat);
		
		int sci = 0;
		sci = 60;
		System.out.println("과학 : " + sci);
		
		int hap = kor + eng + mat + sci;
		int ave = hap / 4;
		System.out.println("총점: " + hap);
		System.out.println("평균값 " + ave);
		

	}

}

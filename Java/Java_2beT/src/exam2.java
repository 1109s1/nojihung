
public class exam2 {

	public static void main(String[] args) {

		System.out.println("-------------------------");
		System.out.println("������ �ζ� ���α׷� v1.1");
		System.out.println("-------------------------");
		int lottoArr[] = new int[6];
		
		
		for (int i=0; i<6; i++) {
			int lotto = (int)(Math.random()*45)+1;
			//System.out.println(lotto);
			if (i ==0) {
				
				lottoArr [i] = lotto;
			}
			else {
				lottoArr[i] = lotto;
				for (int j=0; j<i;j++) { 
					if (lottoArr[j] == lottoArr[i]);
					System.out.println("�ߺ��߻�");
					i--;
					break;
				}
			}
		}
	}
	for (int i = 0;i<6;i++) {
		System.out.print(lottoArr[i]+"");
	}

}


public class Loop8 {

	public static void main(String[] args) {

		int hap = 0;
		for (int i=0; i<10; i++) {
			//3���� ���� �������� 0
			// --> 3�� ���
			if ((i+1) % 3 ==0) {
				// �ݺ��� ó������ �̵�
				continue;
				
			} 
			System.out.println("i+1: " + (i+1));
			hap += (i+1);
			
			if (i==5) {
				System.out.println("Ż��");
				break;
			}
		}
		System.out.println("1~10���� 3�� ����� ������ �� : " + hap);
	}

}

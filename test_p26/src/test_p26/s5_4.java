package test_p26;

public class s5_4 {
	public static void main(String[] args) {
		try {
		int[] test;
		test = new int[5];
		System.out.println("�N�ȫ��w��test[10]");
		test[10] = 80;
		System.out.println("�N80���w��test[10]");
		
		}
	
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("�W�L�}�C�d��F");
		System.out.println("�o�ͤF"+e+"�o�ӷN�~");
		}
			
	finally {
		System.out.println("�̫�@�w�|����o�ӳB�z");
		}
		System.out.println("���Q���槹��");
	}
}

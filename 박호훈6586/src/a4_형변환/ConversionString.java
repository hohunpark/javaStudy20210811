package a4_����ȯ;

public class ConversionString {

	public static void main(String[] args) {
		
		// ���ڿ�(String)�� ����ȯ
		int num = 10;
		String sNum = "10";
		System.out.println(num + sNum);

		// ���ڿ� -> �ٸ� �ڷ���(boolean, int, double)
		// int(����) : Integer.parseInt(���ڿ�);
		int i = Integer.parseInt("10");
		double d = Double.parseDouble("10.1");
		boolean b = Boolean.parseBoolean("true");
		
		// �ٸ� �ڷ��� -> ���ڿ�
		// int(����) : Integer.toString(����);
		Integer.toString(10);
		Double.toString(10.2);
		Boolean.toString(false);
		
		// ����� �ȳ����� ���ۿ� 'java ���ڿ� ����ȯ'�̶�� �˻��ϸ� ����� ���´�.
		
	}

}

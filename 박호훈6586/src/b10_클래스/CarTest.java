package b10_Ŭ����;

public class CarTest {

	public static void main(String[] args) {
		// ������ sonata
		// ������ : �����ڵ���
		// �� : �ҳ�Ÿ
		// ���� : ��
		// ���� : 2019
		
		// ������ k7
		// KIA�ڵ���
		// �� : k7
		// ���� : ȭ��Ʈ
		// ���� : 2020
		
		// ������ tesla_model3
		// tesla
		// �� : model3
		// ���� : ȭ��Ʈ
		// ���� : 2021
		
		Car sonata = new Car();
		sonata.setCompany("�����ڵ���");
		sonata.setModel("�ҳ�Ÿ");
		sonata.setColor("��");
		sonata.setYear(2019);
		
		Car K7 = new Car();
		K7.setCompany("Kia�ڵ���");
		K7.setModel("K7");
		K7.setColor("ȭ��Ʈ");
		K7.setYear(2020);
		
		Car Tesla_model3 = new Car();
		Tesla_model3.setCompany("Tesla");
		Tesla_model3.setModel("model3");
		Tesla_model3.setColor("ȭ��Ʈ");
		Tesla_model3.setYear(2021);
		
		sonata.CarInfo();
		K7.CarInfo();
		Tesla_model3.CarInfo();
		
		
		
		
		
		
	}

}

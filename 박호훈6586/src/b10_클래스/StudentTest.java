package b10_Ŭ����;

public class StudentTest {

	public static void main(String[] args) {

		Student kim = new Student("������", "USA����Ƽ", 4); //null : �ּ�(�ƹ��� ��)�� ����.
		Student lee = new Student("������", 2); 
		Student park = new Student("��ȣ��", "�ڸ��ƾ���Ƽ", 3); 
		
		
		//kim.name = "������"; //   .�� �ش� �޸� �ּҰ��� �����Ѵٶ�� �Ѵ�.
		
		
		
		kim.showInfo();
		
		Integer i = new Integer(100);
		
		
		System.out.println(kim.hashCode());
		System.out.println(i.hashCode());
		
		kim.getFreebies();
		lee.getFreebies();
		park.getFreebies();
	}
	
}

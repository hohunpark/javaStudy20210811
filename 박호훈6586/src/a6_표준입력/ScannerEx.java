package a6_ǥ���Է�;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		// String�� �⺻���� Ŭ����
		// Scanner �ܺ� Ŭ����
		Scanner input = new Scanner(System.in);
		
		//System.out.println(input.nextLine());
		//(input �ȿ� �ִ� �����͸�)����϶�.
		// �׷��� �̷��� ��� ���°� �����ϴ�.
		
		System.out.println("���� 2���� �Է����ּ���.");
		System.out.print("ù��° �� : ");
		String str = input.nextLine();
		System.out.print("�ι�° �� : ");
		String str2 = input.nextLine();
		System.out.print("��� : ");
		
		System.out.println(Integer.parseInt(str) + Integer.parseInt(str2));
		
		
		// nextline : ��ü �� ���(����������)
		// next : �����̽�(����) ������ ���
		
	}

}

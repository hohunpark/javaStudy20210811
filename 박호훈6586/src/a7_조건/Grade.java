package a7_����;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// Scanner�� ���� ǥ�� �Է�
		// ���� : grade, ���ڿ��� ����
		// ������ �Է��� �ּ���(A ~ F) : ���ڿ� �Է�
		// if(A��� true) {�л��� ������ 90 ~ 100�� �Դϴ�.}
		// else if(B��� true) {�л��� ������ 80 ~ 89�� �Դϴ�.}
		// ......F����
		// 
		// else { A ~ F������ �Է��� �� �ֽ��ϴ�.}
		//���ڿ��� eqauls�� ����Ѵ�.
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��� �ּ��� : ");
		
	
		String grade = input.nextLine();
		
		if(grade.equals("A")) 
			{System.out.println("�л��� ������ 90 ~ 100�� �Դϴ�.");} 
		else if (grade.equals("B")) 
			{System.out.println("�л��� ������ 80 ~ 89�� �Դϴ�.");}
		else if (grade.equals("C")) 
			{System.out.println("�л��� ������ 70 ~ 79�� �Դϴ�.");}
		else if (grade.equals("D")) 
			{System.out.println("�л��� ������ 60 ~ 69�� �Դϴ�.");}
		else if (grade.equals("F")) 
			{System.out.println("�л��� ������ 50 ~ 59�� �Դϴ�.");}
		else {System.out.println("A ~ F������ �Է��� �� �ֽ��ϴ�.");		
		
	}

	}
}

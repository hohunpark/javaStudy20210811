package a8_�ݺ�;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�ܼ��� �Է��� �ּ��� : ");
		int num = input.nextInt();
		
		System.out.println(num + "��");
		for(int i = 0; i < 9; i++) {
			int i2 = i + 1;
			System.out.println(num + " X " + i2 + " = " + num*i2);
		}

		System.out.println();
		
		
		
		
		/**
		 * 
		int i3 = 0;
		int i4 = i3 + 1;
		while(i4 <= 9) {
			System.out.println("2 X " + i4 + " = " + 2*i4);
			i4++;
		}
		*/
		
	}

}

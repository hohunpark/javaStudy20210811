package a8_¹Ýº¹;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class GugudanAll {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int num2 = input.nextInt();
		
		
		
		for(int i = num; i < num2+1; i++) {
			System.out.println(i + "´Ü");
			
			for(int j = 0; j < 9; j++) {
				int j2 = j + 1;
						System.out.println(i + " X " + j2 + " = " + i*j2);
				
			}
		}

	}

}

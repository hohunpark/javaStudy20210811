package a7_조건;

import java.util.Scanner;

public class Quiz2753 {

	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		//해당년도가 4의 배수이고, 100의 배수는 아니거나 400의 배수이다.
		int year = in.nextInt();

		int result;

		if(year%4 == 0 && year%100 != 0 || year%400 == 0) {
			System.out.println("윤년입니다.!!");
		}else {
			System.out.println("윤년이 아닙니다.!!");
		}
		
	}

}

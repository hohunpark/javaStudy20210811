package a6_표준입력;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		// String은 기본제공 클래스
		// Scanner 외부 클래스
		Scanner input = new Scanner(System.in);
		
		//System.out.println(input.nextLine());
		//(input 안에 있는 데이터를)출력하라.
		// 그런데 이렇게 계속 쓰는건 불편하다.
		
		System.out.println("숫자 2개를 입력해주세요.");
		System.out.print("첫번째 수 : ");
		String str = input.nextLine();
		System.out.print("두번째 수 : ");
		String str2 = input.nextLine();
		System.out.print("결과 : ");
		
		System.out.println(Integer.parseInt(str) + Integer.parseInt(str2));
		
		
		// nextline : 전체 다 출력(엔터전까지)
		// next : 스페이스(엔터) 전까지 출력
		
	}

}

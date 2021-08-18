package a7_조건;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// Scanner를 통한 표준 입력
		// 변수 : grade, 문자열로 선언
		// 성적을 입력해 주세요(A ~ F) : 문자열 입력
		// if(A등급 true) {학생의 성적은 90 ~ 100점 입니다.}
		// else if(B등급 true) {학생의 성적은 80 ~ 89점 입니다.}
		// ......F까지
		// 
		// else { A ~ F까지만 입력할 수 있습니다.}
		//문자열은 eqauls를 써야한다.
		
		Scanner input = new Scanner(System.in);
		System.out.print("성적을 입력해 주세요 : ");
		
	
		String grade = input.nextLine();
		
		if(grade.equals("A")) 
			{System.out.println("학생의 성적은 90 ~ 100점 입니다.");} 
		else if (grade.equals("B")) 
			{System.out.println("학생의 성적은 80 ~ 89점 입니다.");}
		else if (grade.equals("C")) 
			{System.out.println("학생의 성적은 70 ~ 79점 입니다.");}
		else if (grade.equals("D")) 
			{System.out.println("학생의 성적은 60 ~ 69점 입니다.");}
		else if (grade.equals("F")) 
			{System.out.println("학생의 성적은 50 ~ 59점 입니다.");}
		else {System.out.println("A ~ F까지만 입력할 수 있습니다.");		
		
	}

	}
}

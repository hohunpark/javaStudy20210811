package a9_메소드;

import java.util.Scanner;

public class Quiz {
	
	public void quiz1(int starCount) {
		
	}
	
	public void procStar(String selector, int starCount) {
		if(selector.equals("1") {
			
		} else if(selector.equals("2")) {
			
		} else if(selector.equals("3")) {
			
		} else if(selector.equals("4")) {
			
		} else {
			
		}
					
	}	
		
	public void mainMenuPrint() {
		System.out.println("[별찍기 프로그램]");
		System.out.println("1. 문제1");
		System.out.println("2. 문제2");
		System.out.println("3. 문제3");
		System.out.println("4. 문제4");
		System.out.println("5. 문제5");
		System.out.println("q. 프로그램 종료");
	}
	
	public static void main(String[] args) {
		Quiz m = new Quiz();
		Scanner in = new Scanner(System.in); 
		boolean loofFlag = true;

		
		while(loofFlag) {
			m.mainMenuPrint();
			System.out.print("명령을 입력하세요 : ");
			String selector = in.nextLine();
			
			
			
			if(selector.equals("1") || selector.equals("2")||selector.equals("3")|| selector.equals("4")|| selector.equals("5")) {

				System.out.print("출력할 별의 개수를 입력하세요 : ");
				int starCount = in.nextInt();
				in.nextLine(); //윗줄에서 엔터를 치면 그값이 입력되기때문에 그것을 상쇄시키기위해 in.nextLine을 추가기입한다.
								// 다른 넥스트도 마찮가지(nextLine 제외). 꼭 nextLine을 추가기입하자.
			} else if(selector.equals("q")) {
				System.out.println("프로그램 종료중...");
				loofFlag = false;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
			System.out.println();
		}
		
		System.out.println("프로그램이 종료되었습니다.");
		
		
	
		
		
		
		
		
		
		
		
		
		/*
		 * [별찍기 프로그램]
		 * 1. 문제1
		 * 2. 문제2
		 * 3. 문제3
		 * 4. 문제4
		 * 5. 문제5
		 * q. 프로그램 종료
		 * 명령을 입력하세요 : 1
		 *  
		 * 출력할 별의 개수를 입력하세요 : 10
		 * 
		 * void procStar(명령 번호, 10) {
		 * 		if(1번이면) {
		 *  		void quiz1(별의 개수) {
		 *  			for()
		 *  		}
		 *  	} else if(2번이면) {
		 *  	
		 *  	}
		 * }
		 * 
		 */
		
		// 메소드 5개, 매개변수 2개 
		
		// 첫번째 입력 : 

	}

}

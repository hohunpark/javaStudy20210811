package a8_반복;

public class WhileEx {

	public static void main(String[] args) {
		
		int num = 1;
		int result = 0;
		
		while(num <= 100) {
			result += num;
			num++;
		}
		
		System.out.println(result);
		

		/** 정리
		for(;true;) {
			System.out.println("for문");
		}

		while(true) {
			System.out.println("while문");
		}
		
		*/
		
		
		
	}
	

}

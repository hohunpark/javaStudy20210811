package a3_상수;

public class Constant {

	public static void main(String[] args) {
		/**
		 * << 상수 >> (=변하지않는값)
		 * 1. final 예약어를 자료형 앞에 사용하여야 한다.
		 * 2. 이름은 모두 대문자여야 한다.
		 *
		 * << 리터럴 >> 
		 * =본래의값(정의)이라고 생각하면된다, 컴퓨터와 운영체제간의 정해놓은것, 키보드에서 1이라고쳤을때 1이 나오는것
		 *
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 *  
		 */
		
	int maxNum = 100;
	final int MAX_NUM = 100;

	System.out.println("일반변수 : " + maxNum);
	
	maxNum = 200;
	
	System.out.println("일반변수 : " + maxNum);
	System.out.println("상수 : " + MAX_NUM);
	
	

	
	
	}

}

package b11_배열;


/**
 * 
 * Array(배열)
 * 같은 자료형끼리의 묶음.
 * index(인덱스)
 * index 연산자 기호 = [] 대괄호
 * 
 *
 */


public class ArrayEx1 {
	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		System.out.println();
		
		// 배열 선언 및 대입 방법
		// 1. (수동적으로 만들어야하나 방을 미리 확보할수있다)
			int[] num = new int[100];
		
			for(int i = 0; i < 100; i++) {
				num[i] = i*10;
			}
			for(int i = 0; i < 100; i++) {
				System.out.println(num[i]);
			}
			
			
		// 2. (자동으로 방을 생성할수있으나 추가로 방을 확보할수없다)
			int[] arr_i = new int[] {10, 20, 30, 40, 50, 0, 0, 0, 0};
		//   =
			int[] arr_i2 = {10, 20, 30, 40, 50};
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println(num[i]);
		}
		
	}
	
	
	
	
}

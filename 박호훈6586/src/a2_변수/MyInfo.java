package a2_변수;

public class MyInfo {

	public static void main(String[] args) {
		/** <<자료형>>
		* 논리형(boolean) = true, false
		* boolean 변수명 = true;
		* boolean 변수명 = false;
		* 
		* 
		* 문자형(char) 캐릭터 = a~z, 한글(1글자만) 
		* char 변수명 = 'a';
		* char 변수명 = '가';
		* char 변수명 = '1';
		* char 변수명 = '$';
		*
		* 
		* 문자열 자료형(String) = "문자열을 저장할 수 있습니다"
		* String 변수명 = "안녕하세요. 김준일입니다."; 
		* 
		* 
		* 정수형(int) = Integer = 0 ~ 10(십진수)
		* int 변수명 = 100;
		* 
		* 
		* 실수형(double) = 0.0 ~ 0.9999 실수단위(소수점) 표현
		* double 변수명 = 100.08776; 
		*
		*
		*/
		
		int year = 1987;
		int month = 05;
		int day = 12;
		char f = '박';
		char s = '호';
		char th = '훈';
		String name = "박호훈";
		double left = 1.5;
		double right = 1.5;
		boolean malefemale = true;

		
		System.out.print("생년월일 : ");
		System.out.print(year);
		System.out.print("년 ");
		System.out.print(month);
		System.out.print("월 ");
		System.out.print(day);
		System.out.println("일");
		
		System.out.print("이름 : ");
		System.out.println(name);
			
		System.out.print("시력(L) : ");
		System.out.println(left);
		System.out.print("시력(R) : ");
		System.out.println(right);

		System.out.print("성별 : ");
		System.out.print(malefemale);

		
		
		
	}

}

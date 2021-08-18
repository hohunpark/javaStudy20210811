package a4_형변환;

public class ConversionString {

	public static void main(String[] args) {
		
		// 문자열(String)의 형변환
		int num = 10;
		String sNum = "10";
		System.out.println(num + sNum);

		// 문자열 -> 다른 자료형(boolean, int, double)
		// int(정수) : Integer.parseInt(문자열);
		int i = Integer.parseInt("10");
		double d = Double.parseDouble("10.1");
		boolean b = Boolean.parseBoolean("true");
		
		// 다른 자료형 -> 문자열
		// int(정수) : Integer.toString(정수);
		Integer.toString(10);
		Double.toString(10.2);
		Boolean.toString(false);
		
		// 기억이 안날때는 구글에 'java 문자열 형변환'이라고 검색하면 방법이 나온다.
		
	}

}

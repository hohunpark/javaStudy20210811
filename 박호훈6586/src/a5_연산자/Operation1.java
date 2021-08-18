package a5_연산자;

public class Operation1 {

	public static void main(String[] args) {
		/** <<증감연산자>>
		 * ++앞 : 즉시 증가
		 * ++뒤 : 나중에 증가
		 * 
		 */
		 		
		int score = 85;
		
		System.out.println(score);

		//선증가 연산자
		System.out.println(++score);
		
		//후증가 연산자
		System.out.println(score++);
		System.out.println(score);
		System.out.println(++score);
		
		System.out.println("구분");
		
		//선감소 연산자
		System.out.println(--score);
		//후감소 연산자
		System.out.println(score--);

	}

}

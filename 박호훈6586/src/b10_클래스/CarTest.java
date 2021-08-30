package b10_클래스;

public class CarTest {

	public static void main(String[] args) {
		// 변수명 sonata
		// 제조사 : 현대자동차
		// 모델 : 소나타
		// 색상 : 블랙
		// 연식 : 2019
		
		// 변수명 k7
		// KIA자동차
		// 모델 : k7
		// 색상 : 화이트
		// 연식 : 2020
		
		// 변수명 tesla_model3
		// tesla
		// 모델 : model3
		// 색상 : 화이트
		// 연식 : 2021
		
		Car sonata = new Car();
		sonata.setCompany("현대자동차");
		sonata.setModel("소나타");
		sonata.setColor("블랙");
		sonata.setYear(2019);
		
		Car K7 = new Car();
		K7.setCompany("Kia자동차");
		K7.setModel("K7");
		K7.setColor("화이트");
		K7.setYear(2020);
		
		Car Tesla_model3 = new Car();
		Tesla_model3.setCompany("Tesla");
		Tesla_model3.setModel("model3");
		Tesla_model3.setColor("화이트");
		Tesla_model3.setYear(2021);
		
		sonata.CarInfo();
		K7.CarInfo();
		Tesla_model3.CarInfo();
		
		
		
		
		
		
	}

}

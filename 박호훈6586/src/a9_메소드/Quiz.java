package a9_�޼ҵ�;

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
		System.out.println("[����� ���α׷�]");
		System.out.println("1. ����1");
		System.out.println("2. ����2");
		System.out.println("3. ����3");
		System.out.println("4. ����4");
		System.out.println("5. ����5");
		System.out.println("q. ���α׷� ����");
	}
	
	public static void main(String[] args) {
		Quiz m = new Quiz();
		Scanner in = new Scanner(System.in); 
		boolean loofFlag = true;

		
		while(loofFlag) {
			m.mainMenuPrint();
			System.out.print("����� �Է��ϼ��� : ");
			String selector = in.nextLine();
			
			
			
			if(selector.equals("1") || selector.equals("2")||selector.equals("3")|| selector.equals("4")|| selector.equals("5")) {

				System.out.print("����� ���� ������ �Է��ϼ��� : ");
				int starCount = in.nextInt();
				in.nextLine(); //���ٿ��� ���͸� ġ�� �װ��� �ԷµǱ⶧���� �װ��� ����Ű������ in.nextLine�� �߰������Ѵ�.
								// �ٸ� �ؽ�Ʈ�� ��������(nextLine ����). �� nextLine�� �߰���������.
			} else if(selector.equals("q")) {
				System.out.println("���α׷� ������...");
				loofFlag = false;
			} else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			System.out.println();
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
		
	
		
		
		
		
		
		
		
		
		
		/*
		 * [����� ���α׷�]
		 * 1. ����1
		 * 2. ����2
		 * 3. ����3
		 * 4. ����4
		 * 5. ����5
		 * q. ���α׷� ����
		 * ����� �Է��ϼ��� : 1
		 *  
		 * ����� ���� ������ �Է��ϼ��� : 10
		 * 
		 * void procStar(��� ��ȣ, 10) {
		 * 		if(1���̸�) {
		 *  		void quiz1(���� ����) {
		 *  			for()
		 *  		}
		 *  	} else if(2���̸�) {
		 *  	
		 *  	}
		 * }
		 * 
		 */
		
		// �޼ҵ� 5��, �Ű����� 2�� 
		
		// ù��° �Է� : 

	}

}

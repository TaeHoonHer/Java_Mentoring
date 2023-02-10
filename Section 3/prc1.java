import java.util.Scanner;

public class prc1 {
	public static void main(String[] args) {
		
		//if = 만약에 ~~이 일어난다면
		
		//제어문
		//a라는 변수 안에 들어있는 값이 3보다 작을 경우 특정 문구를 출력을 하고 싶어요
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("정수를 입력하세요");
//		int a = sc.nextInt();
//		
//		if(a < 3) {
//			System.out.println("a는 3보다 작다");
//		}else if (a > 100) {
//		System.out.println("a는 너무 큽니다");
//	}else {
//		System.out.println("a는 딱 중간값입니다");
//	}
		//숫자 맞추기 게임
		
		//if, else if, else 제어문을 사용하면 코드를 조금 더 자유롭게 작성할 수 있습니다
		//if문의 값이 true라면 if문 아래에 있는 명령문을 실행합니다
		//if가 false라면 else에 있는 명령문을 실행합니다
		//else if 1개든 100개든 1000개든 상관이 없어요
		//배가 고파서 밥을 먹는다, 안먹는다 + 밥을 주문한다
		
//		System.out.println("너의 점수는?");
//		int a = 45;
//		char grade;
//		//문자열이 아니라 문자
//		//char로 선언한 변수에 값을 넣을 때는 반드시 '를 써야합니다
//		
//		if(a >= 90) {
//			grade = 'A';
//		}else if(a >= 80) {
//			grade = 'B';
//		}else if(a >= 70) {
//			grade = 'C';
//		}else {
//			grade = 'F';
//		}
//		System.out.println("너의 점수는 " + a);
//		System.out.println("너의 학점은 " + grade + "이다");
		
		//조건문에 과연 if만 있을까요?
		//if가 제일 많이 범용적으로 사용이 되지만, switch
		
		/*
		 * switch(입력변수) {
		 * 		case 입력값1:
		 * 			break
		 * 		case 입력값2:
		 * 			break
		 */
		
		System.out.println("너의 점수는");
		int k = 90; // 0 ~ 100 101, -90
		if(k < 0 && k > 100) { //0 = False 1 = True
			System.out.println("점수를 잘못 입력했습니다");
		}
		else {
			switch(k / 10) {
			case 10:
				System.out.println('A');
				break;
			case 9:
				System.out.println('B');
				break;
			case 8:
				System.out.println('C');
				break;
			default:
				System.out.println('F');
				break;
			}
		}
	}
}

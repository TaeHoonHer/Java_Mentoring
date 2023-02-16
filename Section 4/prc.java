
public class prc {

	public static void main(String[] args) {
		
		/*
		 * 상수, 정수, 실수, 문자, 문자열
		 * 합치기도하고, 빼기도하고, 숫자, 문자를 같이 출력하기도했습니다
		 * 
		 */
		
		/*
		 * 제어문
		 * 
		 * 조건문, 반복문, 분기문
		 * 
		 * 
		 * 조건문
		 * 조건을 지정하는 것, 조건을 걸고 만족하거나 만족하지 않을 시, 실행하는 프로그램을 변경하는 것
		 * if, else, switch-case
		 * 
		 * if(조건문) {
		 * 	<수행할 문장>
		 * 	<수행할 문장>
		 * }else{
		 * 	<수행할 문장>
		 * 	<수행할 문장>
		 * }
		 * 
		 * int a = 10;
		if(a < 3) {
			System.out.println("a는 3보다 작다");
		}else {
			System.out.println("a는 3보다 크다");
		}
		
		int score = 101;
		String grade;
		//문자를 저장하는 데이터 타입입니다
		
		if(score >= 100) {
			grade = "잘못 입력하셨습니다";
		}else if(score >= 90){
			grade = "A";
		}else if(score >= 80) {
			grade = "B";
		}else if(score >= 70) {
			grade = "C";
		}else {
			grade = "F";
		}
		
		System.out.println(grade);
		
		
		 * 
		 * 조건문안에 들어가는 조건식의 규칙으로는
		 * 결과가 반드시 True 혹은 False로 결정이 되야했습니다
		 * 
		 * i = 10
		 * 
		 * i < 6
		 * 
		 * 반복문
		 * 같은 코드를 여러번 반복하는 것
		 * 
		 * 분기문
		 * 여러번의 반복문 사이에서 반복문을 끝낼지, 진행할지, 돌아갈지를 정하는 것(결정)
		 * 
		 * 
		 */
		
		//학점
		/*
		 * 90이상이면 A
		 * 90미만이면 F
		 * 
		 * else if
		 */
		
		/*
		 * switch(변수명){
		 * 	case 상수 :
		 * 		수행문장 
		 * 		break;
		 * case 상수 :
		 * 		수행문장 
		 * 		break;
		 * case 상수 :
		 * 		수행문장 
		 * 		break;
		 * case 상수 :
		 * 		수행문장 
		 * 		break;
		 * }
		 */
		
//		int month = 1;
//		String monthString = "";
//		switch(month) {
//		case 1:
//			monthString = "January";
//			break;
//		case 2:
//			monthString = "Febuary";
//			break;
//		case 3:
//			monthString = "March";
//			break;
//		case 4:
//			monthString = "April";
//			break;
//		case 5:
//			monthString = "May";
//			break;
//		case 6:
//			monthString = "June";
//			break;
//		case 7:
//			monthString = "July";
//			break;
//		case 8:
//			monthString = "August";
//			break;
//		default:
//			monthString = "wrong month";
//			break;
//		}
//		
//		System.out.println(monthString);
		
		//for
		/*
		 * for(초기화; 종료조건; 반복실행;){
		 * 		명령문;
		 * }
		 */
	
//		for(int i = 1; i < 9; i++) {
//			System.out.println("Hello" + i);
//		}
		
		/*
		 * while(조건식){
		 * 	반복 실행
		 * }
		 */
		
//		int i = 9;
//		while(i < 11) {
//			System.out.println("Hello");
//			i++;
//		}
		
		//for문의 중첩
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 4; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}

}

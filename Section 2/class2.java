
public class class2 {
	public static void main(String[] args) {
		
		int a;
		//Integer == 정수
		//나는 int라는 타입을 저장할 수 있는 컨테이너를 만들거다
		
		String d;
		//String, int == Type(자료형)
		
		//자바의 타입 : 정수, 실수, 문자, 논리
		
		//정수  : 1,2,3,4
		//실수 : 1.2 , 3.4
		
		double h = 3.4;
		//실수를 저장하는 자료형
		
		System.out.println(h + 3.4);
		
		//변수 : 값을 저장하는 저장소
		//Type : 저장소 안에 고기가들어갈지, 생선이 들어갈지 정해주는 역할
		
		int v;
		
		
		System.out.println(1);
		System.out.println("hello java");
		
		//변수를 만드는 이유
		int z = 100;
		System.out.println(z+10);
		System.out.println(z+10 + 200);
		System.out.println(z+10 + 200 + 300);
		System.out.println(z+10 + 200 + 300 + 400);
		//변수의 목적 : 코드의 재활용성 증가
		
		//변수 생성의 규칙
		//1. 변수명은 숫자로 시작할 수 없다
		//2. 변수명에는 _ 과 $ 이외의 특수문자는 넣을 수 없다
		//3. int, class, static
		
		//키워드 종류
		
		//변수 안좋은 예시
//		int 1st;
//		int a#;
//		int class;
		
		//class명을 생성하는데도 규칙이 있습니다
		
		//class CooKie
		//class helloJava
		//class kdfhudg
		
		// : 주석이라고 불러요
		//
		
		/*
		 * ㅇㄹㅇㄹㅇㄹ
		 * ㅇㄹㅇㄹㅇㄹ
		 * ㅇㄹㅇㄹㅇㄹ
		 * ㅇㄹㅇㄹㅇㄹ
		 * 
		 */
		
		//세미콜론(;)
		
		
		//data 타입
		//bit, byte
		//8bit = 1byte
		
		
		//정수에는 어떤 Type이 있을까?
		int x;
		byte c;
		short l;
		long b;
		
		/*
		 * byte : ~128 ~ 127	1byte
		 * short 				2byte
		 * int : -2,147,483,648 ~ 2,147,483,647	4byte
		 * long : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807	8byte
		 */
		
		//메모리가 되게 넘쳐나는 시대에요
		//과거에는 코딩을 할 때 메모리 용량을 전부 일일이 계산했어요
		
		byte district = 1;
		long district1 = 1;
		
		
		//실수
		//double, float
		
		//float : -3.4 * 10^38 ~ 3.4 * 10^38
		//double : -1.7 * 10^308 ~ 1.7 * 10^308
		
		//실수를 선언할 때는 double이 기본값으로 설정이 되어있어요
		
		float k = 3.14F;
		
	}
}

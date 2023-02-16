
public class prc1 {

	public static void main(String[] args) {
		//배열
		//감, 대추, 모과, 배, 사과, 귤, 유자 == 과일

		//변수 : 하나의 데이터를 저장하는 저장공간
		//배열 : 여러개의 데이터를 저장하기 위해서 만들어진 것
		
		//배열을 생성하는 법
		String[] classGrp = {"허태훈", "손민욱", "김혜원", "천세민"};
		
		//index
		//배열에 순서
		
		//배열의 사용
		//System.out.println(classGrp[0]);

		//배열의 크기
		//.length
		//System.out.println(classGrp.length);
		
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		for(int i = 0; i < week.length; i++) {
			System.out.println(week[i]);
			
			//배열 끝
		}
	}

}

package run;

public class ArrayController {
	
	public void basicArray() {
		//기본 배열 활용하기
		//배열은 기본으로 제공된는 저장공간으로 생성해서 사용을 함.
		//배열은 엄연히 따지자면 자료형은 아니지만 그냥 자료형이라고 생각해서 쓰시라.
		//배열의 저장구조(자료구조)는 선형구조(순차적으로 서 있는 것)
		//저장에 순서가 있고, 저장소를 지칭하는 번호를 가진다(이 번호를 인덱스index라고 함)
		//지칭하는 번호는 0부터 시작을 함

		//배열 사용해보기
		//배열 변수를 선언
		//자료형[] 변수명;
		char[] alpha; //배열 저장소의 주소가 들어감 *참조형자료형 
		//변수를 선언했으면, 반드시 선언된 생성된 변수에 배열을 할당 해서 사용한다.
		// new 자료형[길이]; 
		//한번 할당된 배열은 길이를 변경할 수 없다. 
		alpha=new char[3];
		int[] intArr=new int[5];
		
		//할당된 배열 저장소 이용하기
//		System.err.println(alpha);
//		System.out.println("intArr"+intArr);
		//배열저장소에 접근하려면 변수명과 인덱스번호를 같이 사용
		// 배열 저장소 중 첫번째 인덱스에 접근 alpha[0]
		System.out.println(alpha[0]);
		System.out.println(intArr[1]);
		
		intArr[0]=35;
		intArr[1]=24;
		intArr[2]=33;
		intArr[3]=12;
		intArr[4]=23;
		
		//System.out.println(intArr[1]);
		
		//for 문과 같이 반복문 이용하기
		//배열에 저장된 데이터 출력하기
		for(int i=0; i<5; i++) {
			System.out.println(intArr[i]);
		}
		
//		intArr변수에 1~5까지 값을 저장
		for(int i=0; i<5; i++) {
			intArr[i]=i+1;
		}
		//출력
		for(int i=0; i<5; i++) {
			System.out.println(intArr[i]);
		}
		
		//배열의 저장소의 갯수(길이) 알렺는 변수
		//배열명.length
		System.out.println("길이"+intArr.length);
		System.out.println("길이"+alpha.length);
		//문자열 길이
		String name="유병승";
		name.length();
		System.out.println(name.length());
		
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
//		int형 배열 10개를 할당하고,
//		각 저장소에 10~19까지 저장하기
		System.out.println("문제1");
		int[] intBrr=new int[10];
		for(int i=0; i<intBrr.length; i++) {
			intBrr[i]=i+10;
			System.out.println(intBrr[i]);
		}
		
		
		
		
		
		
	}

}

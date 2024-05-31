package lambdaTest1;


//함수형인터페이스는 추상메서드 하나만 가져야 한다 

@FunctionalInterface
interface MyCalculator{
	int calc(int x1, int x2); 
	//이 인터페이스는 정수를 두개 인자로 받아 정수결과를 반환하는 함수형태만 전달받을 수 있다
}


public class 함수형인터페이스 {
	public static void main(String[] args) {
		
		//1. 람다를 전달해서 객체를 만들기 return 생략, {} 도 생략
		MyCalculator m1 = (x1, x2)->x1+x2; 
		//m1변수는 람다 함수의 주소를 저장하고 있다 
		System.out.println( m1.calc( 10,  20) );
		
		
		m1 = (x1, x2)->x1-x2; 
		System.out.println( m1.calc( 10,  20) );
		
		
		m1 = (x1, x2)->x1*x2; 
		System.out.println( m1.calc( 10,  20) );
		
		m1 = (x1, x2)->x1/x2; 
		System.out.println( m1.calc( 10,  20) );
		
	}
}





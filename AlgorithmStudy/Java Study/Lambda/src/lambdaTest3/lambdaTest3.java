package lambdaTest3;


@FunctionalInterface
interface MyFunc{
	void display(int x1, int x2);
}

@FunctionalInterface
interface MyString{
	int getLength(String s);
}

//두개의 변수값을 비교하는 인터페이스를 구축한다 
@FunctionalInterface
interface Compare{
	int compareTo(int x1, int x2);
}



public class lambdaTest3 {
	public static void main(String[] args) {
		
		MyFunc f1; //함수형 인터페이스 변수 선언 
		
		//변수 타입을 생략하는 이유는 인터페이스를 통해서 변수의 타입을 알 수 있다 
		f1 = (x1, x2)->{
			System.out.println(x1);
			System.out.println(x2);
			System.out.println(x1+x2);
			System.out.println(x1-x2);
		};
		
		
		//람다로 전달한 함수의 호출은 
		f1.display(5, 7);
		
		MyString s1 = (s)-> s.length();  //한줄일때 return 문을 생략할 수 있다 
		System.out.println(s1.getLength("This is test"));
		
		Compare comp = (x1, x2)-> x1-x2;
		
		System.out.println(comp.compareTo(5, 9));
	}
}









package lambdaTest1;

import java.util.Arrays;
import java.util.List;

public class LambdaTest1 {
	public static void fun1(Integer n)
	{
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		//List<Integer> numbers = new Array<Integer>();
		//numbers.add(1); ....................
		
		List<Integer> numbers = Arrays.asList(5,4,7,8,2,1,10,9,11,13);
		for(int i=0; i<numbers.size(); i++)
			System.out.println(numbers.get(i));
		
		//forEach함수는 함수의 주소를 매개변수로 받아간다. 
		//매개변수로 전달될 함수의 모습은 인자하나 출력연산일때 사용한다 
		//forEach에 전달된 함수는 numbers 배열의 각 인자마다 한번씩 호출된다. 
		// 
		numbers.forEach( (n)->{
			System.out.println(n);
		});
		
		//짝수만 출력하자 
		System.out.println("짝수만 출력");
		numbers.forEach( (n)->{
			if(n%2==0)
				System.out.print(n + "\t");
		});
		System.out.println();
		
		System.out.println("짝수만 출력");
		numbers.stream()
		       .filter((n)-> n%2==0)  //조건식 결과가 true인 것만 반환한다 
		       .forEach((n)->{ System.out.println(n); });
		
		
		
		
		
	}
}

package Predicate인터페이스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate인터페이스 {
	public static void main(String[] args) {
		//매개변수를 받아가서 boolean 형태를 반환하는 함수를 저장할 수 있다.
		Predicate<Integer> p1;
		
		p1 = (n) -> n%2 == 0;
		
		if(p1.test(3)) {
			System.out.println("짝수이다.");
		}else {
			System.out.println("홀수이다.");
		}
		
		Predicate<Integer> p2 = (n) -> n%5 == 0;
		System.out.println(p2.test(10));
		
		Predicate<Integer> p3 = p1.and(p2);
		System.out.println(p3.test(10));
		System.out.println(p3.test(15));
		
		//List -> 람다 적용 Stream list -> Stream
		List<Integer> nList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//중간연산 -- 반환값이 다시 Stream 형태이다.
		nList.stream().filter(p1).forEach((n) -> {
			System.out.println(n); //forEach - 최종 연산
		});
		
		//8.0 표현 방식
		List<Integer> evenList = nList.stream().filter(p1).collect(Collectors.toList());
		evenList.forEach( (n) -> {
			System.out.println(n);
		});
		
		//1~100까지 넣어놓고 3과 5의 최소공배수 출력하기
		evenList = new ArrayList<Integer>();
		for(int i=1; i<=100; i++) {
			evenList.add(i);
		}
		
		evenList = evenList.stream().filter((n) -> n%3 == 0 && n%5 == 0).collect(Collectors.toList());
		evenList.forEach((n) -> {
			System.out.println(n);
		});
	}
}


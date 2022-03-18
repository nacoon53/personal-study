package 맵핑;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 맵핑 {
	 public static void main(String[] args) {
		 List<String> wordsList = Arrays.asList("school", "rain", "desk", "survey", "house");
		 
		 List<Integer> resultList = wordsList.stream()
				 							.map(String::length)
				 							.collect(Collectors.toList());
		 System.out.println(resultList);
		 
		 //문자열을 대문자로 바꿔서 출력하기		 
		 List<String> capList = wordsList.stream()
										.map(String::toUpperCase)
										.collect(Collectors.toList());
		System.out.println(capList);
		
		capList = wordsList.stream()
				.map(w->w.split("")) //map은 input 1개, return 1개 구조. 이 문장에서는 배열을 리턴
				.flatMap(Arrays::stream) //배열을 받아서 스트림으로 전환시키는 역할
				.collect(Collectors.toList()); // 다시 모으는 역할		
		System.out.println(capList);
		
		//Arrays.stream(): 배열을 스트림으로 전환해주는 함수
		
		String[] colors = new String[] {"red", "green", "blue", "magenta", "cyan"};
		System.out.println("데이터 개수 : " + Arrays.stream(colors).count());
		
		Stream<String> str = Arrays.stream(colors);
		str.forEach(System.out::println);
		
		
								 
	}
}

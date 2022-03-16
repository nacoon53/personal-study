package 연산1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Popular {
	String cityName = "";
	int man;
	int woman;
	int popular;
	
	public Popular() {}
	public Popular(String cityName, int man, int woman) {
		super();
		this.cityName = cityName;
		this.man = man;
		this.woman = woman;
		this.popular = this.man + this.woman;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getMan() {
		return man;
	}
	public void setMan(int man) {
		this.man = man;
	}
	public int getWoman() {
		return woman;
	}
	public void setWoman(int woman) {
		this.woman = woman;
	}
	public int getPopular() {
		return popular;
	}
	public void setPopular(int popular) {
		this.popular = popular;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d %d %d", cityName, man, woman, popular);
	}
}

public class 연산1 {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1,5,4,9,8,11,17,5,-9,-4,-7, 10, 23);
		
		//1. 음수의 개수 구하기
		System.out.println("음수의 개수 : " + numList.stream().filter( (n) -> n<0 ).count());
		
		//2. 짝수의 개수 구하기
		System.out.println("짝수의 개수 : " + numList.stream().filter( (n) -> n%2==0).count());
		
		//3. max 값 구하기
		System.out.println("max 값 : " + numList.stream().max(Integer::compare));
		
		//4. min 값 구하기
		System.out.println("max 값 : " + numList.stream().min(Integer::compare));
		
		//5. 다음 리스트에 없는 데이터만 추출하기
		List<Integer> exceptList = Arrays.asList(9,8,5,23);
		List<Integer> resultList = numList.stream().filter( (n) -> exceptList.indexOf(n) == -1).collect(Collectors.toList());
	
		//6. 양수, 음수 구분해서 출력하기
		List<Integer> negList = numList.stream().filter( (n) -> n<0).collect(Collectors.toList());
		List<Integer> posList = numList.stream().filter( (n) -> n>0).collect(Collectors.toList());
		
		System.out.println(negList);
		System.out.println(posList);
	
		//7. 다섯 글자 이상만 출력하기
		List<String> wordList = Arrays.asList("rabbit", "dog", "rain", "cloud", "flower", "rose",
				"sky", "hospital", "company", "family");
		List<String> wList = wordList.stream().filter((w) -> w.length() >= 5).collect(Collectors.toList());
		System.out.println(wList);
		
		//8. c를 포함하는 문자열 출력하기
		wList = wordList.stream().filter((w) -> w.contains("c")).collect(Collectors.toList());
		System.out.println(wList);
		
		//9. o를 포함하는 문자열 중 3개만 출력하기
		wList = wordList.stream()
				.filter((w) -> w.contains("o"))
				.limit(3)
				.collect(Collectors.toList());
		System.out.println(wList);
		
		//10. 인구가 가장 많은 지역 3곳 출력하기
		List<Popular> popList = new ArrayList<Popular>();
		popList.add( new Popular("관악구", 25000, 32000) );
		popList.add( new Popular("서초구", 52000, 63000) );
		popList.add( new Popular("강서구", 55000, 34000) );
		popList.add( new Popular("양천구", 25000, 12000) );
		popList.add( new Popular("은평구", 9000, 2000) );
		popList.add( new Popular("동작구", 45000, 19000) );
		popList.add( new Popular("서대문구", 85000, 79000) );
		
		List<String> three = popList.stream()
			.sorted((x1, x2) -> x2.getPopular() - x1.getPopular())
			.limit(3)
			.map(Popular::getCityName) //".map( (n) -> n.getCityName())" 와 동일함.
			.collect(Collectors.toList());		
		System.out.println(three);
		
		//11. 남녀 인구 편차가 제일 큰 지역 3곳 출력하기
		three = popList.stream()
				.sorted(
						(x1, x2) -> {
							//편차이므로 절대값을 구한다.
							int var1 = Math.abs(x1.man - x1.woman);
							int var2 = Math.abs(x2.man - x2.woman);
							
							return var2 - var1;
						}
				)
				.limit(3)
				.map(Popular::getCityName) 
				.collect(Collectors.toList());
		System.out.println(three);
	}
}


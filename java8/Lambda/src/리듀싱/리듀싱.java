package 리듀싱;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Dish{
	String foodName = "";
	int calory = 0;
	
	public Dish() {}
	public Dish(String foodName, int calory) {
		this.foodName = foodName;
		this.calory = calory;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d", foodName, calory);
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getCalory() {
		return calory;
	}
	public void setCalory(int calory) {
		this.calory = calory;
	}	
}

public class 리듀싱 {
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		//정수 배열에 특화된 스트림이 별도로 존재함.
		IntStream nis = Arrays.stream(nums);
		System.out.println("합계 : " + nis.sum()); //Stream은 일회성 사용만 가능
		
		nis = Arrays.stream(nums);
		int sum = nis.reduce(0, (a,b)->a+b);
		System.out.println(sum);
		
		//String의 경우
		String[] arr = new String[] {"red", "green", "blue", "white"};
		Stream<String> wordsStream = Arrays.stream(arr);
		String str = wordsStream.reduce("", (prev, next)->{
			if(prev.equals("")) {
				return next;
			} else {
				return prev + " " + next;
			}
		});
		System.out.println(str);
		
		wordsStream = Arrays.stream(arr);
		Optional<String> str2 = wordsStream.reduce((prev, next)->{
			if(prev.equals("")) {
				return next;
			} else {
				return prev + " " + next;
			}
		});
		System.out.println(str2);
		
		
		List<Dish> dishList = new ArrayList<Dish>();		
		dishList.add(new Dish("짜장면", 780));
		dishList.add(new Dish("두부", 280));
		dishList.add(new Dish("탕수육", 980));
		dishList.add(new Dish("치킨", 900));
		dishList.add(new Dish("라면", 580));
		dishList.add(new Dish("공깃밥", 240));
		dishList.add(new Dish("소면", 430));
		dishList.add(new Dish("오이무침", 80));
		dishList.add(new Dish("가지볶음", 120));
		
		int sum2 = dishList.stream().mapToInt(Dish::getCalory).sum();
		System.out.println(sum2);
		
		IntStream nis2 = dishList.stream().mapToInt(Dish::getCalory);
		Stream<Integer> si = nis2.boxed();
		
		System.out.println(dishList.stream().mapToInt(Dish::getCalory).max());
		System.out.println(dishList.stream().mapToInt(Dish::getCalory).min());
	}
}

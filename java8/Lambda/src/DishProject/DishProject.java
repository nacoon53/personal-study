package DishProject;

//*********************************************************
// 자동 import 가 안 되므로, 직접 적어주어야 함.
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
//*********************************************************

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
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

public class DishProject {
	public static void main(String[] args) {
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
		
		//이전방식
		List<Dish> lowList = new ArrayList<Dish>();
		for(Dish d : dishList) {
			if(d.getCalory() < 400) {
				lowList.add(d);
			}
		}
		
		//원본데이터 바뀐다.
		Collections.sort(lowList, new Comparator<Dish>() {
			@Override
			public int compare(Dish arg0, Dish arg1) {
				return arg0.getCalory() - arg1.getCalory();
			}
		});
		
		lowList.stream().forEach(System.out::println);
		
		List<String> nameList = new ArrayList<String>();
		for(Dish d : lowList) {
			nameList.add(d.foodName);
		}
		
		System.out.println(nameList);
		
		
		//스트림 방식
		List<String> resultList = dishList.stream()
				.filter(d->d.getCalory() < 400) //filter가 반환하는 값은 Stream 이다.
				.sorted( comparing(Dish::getCalory)) //Stream으로 반환
				.map(d -> d.getFoodName())
				.collect(Collectors.toList()); //최종연산
		
		System.out.println(resultList);
		
		
		//parallel 방식
		resultList = dishList.parallelStream()
				.filter(d->d.getCalory() < 400) //filter가 반환하는 값은 Stream 이다.
				.sorted( comparing(Dish::getCalory)) //Stream으로 반환
				.map(d -> d.getFoodName())
				.collect(Collectors.toList()); //최종연산
		
		System.out.println(resultList);
		
		
		//데이터 카운트
		System.out.println("저칼로리 데이터 개수 : " + dishList.stream().filter(d->d.getCalory()<400).count());
		System.out.println("전체 데이터 개수 : " + dishList.parallelStream().count());
		System.out.println("고칼로리 데이터 개수 : " + dishList.stream().filter(d->d.getCalory()>400).count());
	}

}


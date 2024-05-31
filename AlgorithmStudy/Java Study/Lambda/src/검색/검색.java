package 검색;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Person {
	String name = "";
	int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d",  name, age);
	}
	
}

public class 검색 {
	 public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1,3,5,7,9);
		
		//모든 수가 10보다 작은지 확인하기
		if(numList.stream().allMatch((n)->n<10)) { // allMatch
			System.out.println("모두 10보다 작다.");
		} else {
			System.out.println("10보다 큰 수가 있다.");
		}
		
		//10보다 작은 수가 있는지 확인하기
		if(numList.stream().anyMatch((n)->n<10 )) { // anyMatch
			System.out.println("10보다 작은 수가 있다.");
		} else {
			System.out.println("10보다 작은 수가 없다.");
		}
		
		List<String> colorList = Arrays.asList("red", "green", "blue", "black", "white", "cyan");
		
		//r을 포함하는 문자열이 있는지 확인하기
		if(colorList.stream().anyMatch(w->w.contains("r"))) {
			colorList.stream().filter(w->w.contains("r")).forEach(System.out::println);
		} else {
			System.out.println("없습니다.");
		}

		//Optional은 null 처리가 되는 특별한 형태의 데이터 타입
		//findFirst 함수는 결과로 null을 리턴할 수 있음
		//Optional에 null이 들어가면 Optional.empty가 출력된다.
		Optional<Integer> num = numList.stream().filter(n->n>500).findFirst(); // findFirst
		//System.out.println(num);
		
		if(num.isEmpty()) { 
			System.out.println("값이 없다.");
		} else {
			System.out.println(num);
		}
		
		Optional<String> sf = colorList.stream().filter((w)->w.contentEquals("green")).findFirst();
		System.out.println(sf);
		
		List<Person> perList = new ArrayList<Person>();
		perList.add(new Person("A", 12));
		perList.add(new Person("B", 14));
		perList.add(new Person("C", 22));
		perList.add(new Person("D", 18));
		perList.add(new Person("E", 32));
		
		Optional<Person> op = perList.stream().filter((w)->w.name.contentEquals("C")).findFirst();
		System.out.println(op);
		if(op.isPresent()) {
			perList.stream()
					.filter((w)->w.name.contentEquals("C"))
					.forEach(System.out::println);
		} else {
			System.out.println("없음");
		}
		
	}
}

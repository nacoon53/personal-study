package OptionalTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Person {
	String name;
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

class House {
	private Person owner;
	private String address;
	
	public House() {
		super();
	}
	public House(Person owner, String address) {
		super();
		this.owner = owner;
		this.address = address;
	}
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
}

class HouseService {
	List<House> dataList = new ArrayList<House>();
	public HouseService() {
		dataList.add(new House(null, "광진구"));
		dataList.add(new House(new Person("홍길동", 23), "서울시"));
		dataList.add(new House(new Person(), "부산시"));
		dataList.add(new House(null, "관악구"));
	}
}

public class OptionalTest {
	public static void main(String[] args) {
		HouseService service = new HouseService();
		House house = service.dataList.get(2);
		
		//기존의 null 체크 하던 방식
		if(house.getOwner() != null) {
			System.out.println(house.getOwner().getName() + " " + house.getAddress());
		}
		
		//Optional을 이용해서 개선하기
		Optional.of(house)
				.map(House::getOwner)
				.map(Person::getName)
				.ifPresent(name->System.out.print(name));
		
		Optional.of(house)
				.map(House::getAddress)
				.ifPresent(address->System.out.println(" " + address));
		
		String ownerName = Optional.of(house)
									.map(House::getOwner)
									.map(Person::getName)
									.orElse("이름 없음"); //값이 null일 때 할당된다.
		
		String address = Optional.of(house)
								.map(House::getAddress)
								.orElse("주소 없음"); //값이 null일 때 할당된다.
		
		System.out.println( ownerName + " " + address );
	}
}

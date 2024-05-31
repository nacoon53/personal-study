package 그룹;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {

    private String Country; // 나라
    private String City; // 도시 
    private String name; // 이름
	public Person() {
		super();
	}
	public Person(String country, String city, String name) {
		super();
		Country = country;
		City = city;
		this.name = name;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    @Override
    public String toString() {
    	return String.format("%s %s %s" ,  Country, City, name);
    }
}

public class 그룹 {
	public static void main(String[] args) {
		
		List<Person> testList = new ArrayList<Person>();
		
		testList.add(new Person("한국", "서울", "홍길동1"));
		testList.add(new Person("한국", "부산", "홍길동2"));
		testList.add(new Person("한국", "서울", "홍길동3"));
		testList.add(new Person("미국", "LA", "홍길동4"));
		testList.add(new Person("미국", "LA", "홍길동5"));
		testList.add(new Person("미국", "뉴욕", "홍길동6"));
		testList.add(new Person("미국", "뉴욕", "홍길동7"));
		testList.add(new Person("한국", "부산", "홍길동8"));
			
		Map<String, List<Person>> groupList = 
				testList.stream().collect(Collectors.groupingBy(Person::getCountry));
		groupList.get("한국").forEach(System.out::println);
		groupList.get("미국").forEach(System.out::println);
		
		System.out.println("********************");
		
		Map<String, Map<String, List<Person>>> groupList2 =
				testList.stream().collect(Collectors.groupingBy(Person::getCountry, 
						Collectors.groupingBy(Person::getCity)));
		
		groupList2.get("한국").get("서울").forEach(System.out::println);
		groupList2.get("미국").get("LA").forEach(System.out::println);
		
	}
}	

package lambdaTest4;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Compare<T> {
	int compareTo(T t1, T t2);
}

@FunctionalInterface 
interface Equal<T> { 
	boolean test(T t1, T t2);
}

class Person {
	String name = "";
	String phone = "";
	String email = "";
	
	public Person() {}
	public Person(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %s",  name, phone, email);
	}
}

public class lambdaTest4 {
	public static void main(String[] args) {
		String s1="test", s2="test";
		
		Compare<String> comp; //매개변수로 String 타입이 두 개 전달 되는 함수를 사용한다.
		comp = (t1, t2) -> t1.compareTo(t2); //String 클래스에 compareTo 함수가 존재한다.
		
		if(comp.compareTo(s1,  s2) > 0) {
			System.out.println(String.format("%s가 %s보다 크다.",  s1, s2));
		}else if(comp.compareTo(s1, s2) == 0) {
			System.out.println(String.format("%s과 %s는 같다.", s1, s2));
		}else {
			System.out.println(String.format("%s이 %s보다 작다.",  s1, s2));
		}
		
		Compare<Person> pComp = (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		};
		
		System.out.println(pComp.compareTo(new Person("홍길동", "", ""), new Person("홍길동", "1", "2")));
		
		
		//Integer
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Equal<Integer> iEqual = (x1, x2) -> x1 == x2;
		System.out.println(search(numList, 5, iEqual));
		System.out.println(search(numList, 15, iEqual));
		
		
		//String
		List<String> strList = Arrays.asList("school", "cloud", "rain", "sun", "windy", "moon", "star");
		
		//인터페이스형 변수를 선언한다.
		Equal<String> sEqual;
		sEqual = (a1, a2) -> a1.equals(a2);
		
		System.out.println(search(strList, "school", sEqual));
		System.out.println(search(strList, "rain", sEqual));
		System.out.println(search(strList, "president", sEqual));
		
		Equal<Person> perEqual;
		perEqual = (p1, p2) -> {
			return p1.name.equals(p2.name);
		};
		
		List<Person> perList = Arrays.asList(new Person("홍길동", "010-0000-0000", "hong@hanmail.com")
				,new Person("장길산", "010-0000-0001", "jang@hanmail.com")
				,new Person("임꺽정", "010-0000-0002", "im@hanmail.com")
				,new Person("홍경래", "010-0000-0003", "hong2@hanmail.com"));
		System.out.println(search(perList, new Person("홍길동", "010-0000-0000", "hong@hanmail.com"), perEqual));
		
	}
	
	//앞의 리스트에서 key 값의 위치를 찾아서 반환하는 함수 만들기, 있으면 위치 값, 없으면 -1을 반환한다.
	public static<T> int search(List<T> list, T key, Equal<T> e) {
		for(int i=0; i<list.size(); i++) {
			if(e.test(list.get(i), key)) {
				return i;
			}
		}

		return -1;
	}
}

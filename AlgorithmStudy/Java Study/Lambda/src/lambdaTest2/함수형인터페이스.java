package lambdaTest2;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface MyComparator1 {
	int compare(Object o1, Object o2); //추상에서도 내부가 구현되어 있지 않다.
	
	//compare라는 변수를 만들고 이 변수에 Object 타입의 매개변수를 두개 갖고, 반환값이 int 형태인 함수를 저장한다
}

public class 함수형인터페이스 {
	public static void main(String[] args) {
		List<Object> intList = Arrays.asList(6, 8, 5, 4, 3, 9, 11, 13, 15, 17);
		selectSort(intList, (o1, o2) -> (Integer)o1-(Integer)o2);
		intList.forEach( (n) -> {System.out.println(n);});
		
		List<Object> wordList = Arrays.asList("school", "assembly", "java", "python",
				"nodejs", "function", "array", "react", "vue");
		selectSort(wordList, (s1, s2) -> {return ((String)s1).compareTo((String)(s2)); });
		wordList.forEach((n) ->{System.out.println(n);});
		
		List<Object> eList = Arrays.asList(new Employees(1, "A", "1"),
				new Employees(3, "C", "1"),
				new Employees(2, "D", "1"),
				new Employees(5, "B", "1"),
				new Employees(9, "F", "1"));
		selectSort(eList, (s1, s2) -> { return ((Employees)s1).getEmployeeId() - ((Employees)s2).getEmployeeId();});
		eList.forEach((n) -> { System.out.println(n);});
	}
	
	public static void selectSort(List<Object> list, MyComparator1 comp) {
		for(int i=0; i<list.size()-1; i++) {
			for(int j = i+1; j<list.size(); j++) {
				//비교 파트는 데이터 타입에 따라 코드가 달라져야 한다. 
				if(comp.compare(list.get(i), list.get(j)) > 0) {
					Object temp = list.get(i);
					list.set(i,  list.get(j));
					list.set(j,  temp);
				}
			}
		}
	}
}

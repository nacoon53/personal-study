package lambdaTest5;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface MyForEach<T> {
	void print(T temp);
}

public class lambdaTest5 {
	public static <T> void printData(List<T> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public static <T> void printData2(List<T> list, MyForEach<T> m) {
		for(int i=0; i<list.size(); i++) {
			m.print(list.get(i));
		}
	}
	
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		printData(numList);
		printData2(numList, (n)->{System.out.println("*" + n + "*");});
	}
}


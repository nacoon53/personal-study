package lambdaTest6;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface MyComparator<T> {
	int compareTo(T t1, T t2);
}

class Book{
	String title = "";
	String author = "";
	
	public Book() {
		
	}
	
	public Book(String title) {
		this.title = title;
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return title + " " +  author;
	}
}

public class lambdaTest6 {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(5,4,9,11,2,3,8,6,15);
		selectSort(numList, (n1, n2) -> n1-n2);
		numList.forEach((n) -> {
			System.out.println(n);
		});
		
		List<Book> bookList = Arrays.asList(
				new Book("치매의세계", "김동희")
				,new Book("마음의 감옥", "김원일")
				,new Book("관촌수필", "이문구")
				,new Book("잔인한도시", "이청준")
				,new Book("광장", "최인훈")
				,new Book("하나코는없다", "최윤")
				);
		
		System.out.println("--- 책이름으로 정렬하기 ---");
		selectSort(bookList, (b1, b2) -> b1.title.compareTo(b2.title));
		bookList.forEach((s) -> {
			System.out.println(s);
		});
		
		System.out.println("--- 작가이름으로 정렬하기 ---");
		selectSort(bookList, (b1, b2) -> b1.author.compareTo(b2.author));
		bookList.forEach((s) -> {
			System.out.println(s);
		});
	}
	
	public static<T> void selectSort(List<T> list, MyComparator<T> comp) {
		for(int i=0; i<list.size()-1; i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(comp.compareTo(list.get(i), list.get(j)) > 0) {
				T temp = list.get(i);
				list.set(i,  list.get(j));
				list.set(j, temp);
				}
			}
		}
	}
}


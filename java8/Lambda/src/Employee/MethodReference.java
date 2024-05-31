package Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employees{
	int employeeId;
	String employeeName;
	boolean bManager;
	
	boolean isManager() {
		return bManager;
	}
	
	public Employees() {
		super();
	}

	public Employees(int employeeId, String employeeName, boolean bManager) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.bManager = bManager;
	}
	
	@Override
	public String toString() {
		
		return String.format("%d %s %s", employeeId, employeeName, bManager);
	}
}


public class MethodReference {
	public static void main(String[] args) {
		List<Employees> list = new ArrayList<Employees>();
		list.add(new Employees(1, "홍길동", false));
		list.add(new Employees(2, "김길동", true));
		list.add(new Employees(3, "임꺽정", false));
		list.add(new Employees(4, "장길산", true));
		list.add(new Employees(5, "임효산", false));
		list.add(new Employees(6, "이몽룡", true));
		list.add(new Employees(7, "강감찬", false));
		list.add(new Employees(8, "이순신", true));
		list.add(new Employees(9, "원균", false));
		list.add(new Employees(10, "이산", false));
		
		System.out.println("매니저인 사람 정보만");
		List<Employees> list1 = filterEmployees(list, Employees::isManager);
		System.out.println(list1);
		
		System.out.println("매니저 아닌사람 ");
		list1 = filterEmployees(list, (n)-> n.isManager()==false);
		System.out.println(list1);
		
		System.out.println("번호가 5넘는 사람 ");
		list1 = filterEmployees(list, (n)-> n.employeeId>5);
		System.out.println(list1);
		
		System.out.println("번호가 5넘는 사람 ");
		list1 = filterEmployees(list, (n)-> n.employeeName.contains("길"));
		System.out.println(list1);
		
		list1.stream().forEach(System.out::println);
		
		
	}

	public static List<Employees> filterEmployees(List<Employees> emplist, Predicate<Employees> p)
	{
		List<Employees> filterList = new ArrayList<Employees>();
		
		for(Employees e : emplist)
		{
			if(p.test(e)) //p로 전달받은 함수의 조건을 만족하는 객체가 있으면 
				filterList.add(e); //filterList에 추가시켜서  리턴하기 
		}
		
		return filterList;
	}
	
}


















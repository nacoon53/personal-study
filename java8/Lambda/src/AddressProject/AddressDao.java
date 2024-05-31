package AddressProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressDao {
	int seq = 10;
	List<AddressDto> addrList = new ArrayList<AddressDto>();
	Scanner sc = new Scanner(System.in);
	
	public AddressDao() {
		addrList.add(new AddressDto(1, "홍길동", "010-0000-0000", "hong@hanmail.net", "서울시 관악구 대학1동"));
		addrList.add(new AddressDto(2, "김성훈", "010-0000-0001", "kim@nate.com", "서울시 관악구 대학2동"));
		addrList.add(new AddressDto(3, "구본철", "010-0000-0002", "k2@hanmail.net", "서울시 관악구 대학3동"));
		addrList.add(new AddressDto(4, "이화종", "010-0000-0003", "asdeg@naver.com", "서울시 관악구 봉천1동"));
		addrList.add(new AddressDto(5, "윤구병", "010-0000-0004", "param@hanmail.net", "서울시 금천구 금천1동"));
		addrList.add(new AddressDto(6, "김성식", "010-0000-0005", "paran1@gmail.com", "서울시 금천구 금천2동"));
		addrList.add(new AddressDto(7, "유기홍", "010-0000-0006", "conan@gmail.com", "서울시 강남구 서초1동"));
		addrList.add(new AddressDto(8, "전성엽", "010-0000-0007", "kang@naver.com", "서울시 강남구 서초2동"));
		addrList.add(new AddressDto(9, "임효선", "010-0000-0008", "deee@hanmail.net", "경기도 용인군 구갈동"));
		addrList.add(new AddressDto(10, "김정은", "010-0000-0009", "korea@hanmail.net", "경기도 용인군 신갈동"));
	}
	
	public void search() {	
		while(true) {	

			System.out.println("1. 이름으로 검색");
			System.out.println("2. 이메일로 검색");
			System.out.println("3. 주소로 검색");
			System.out.println("4. 전화번호 검색");
			System.out.println("0. 종료");
			
			System.out.print("선택 : ");	
			int menu = sc.nextInt();
			
			if(menu == 0)  return;
			
			System.out.print("검색값 : ");
			String key = sc.next();
			
			switch(menu) {
				case 1: searchName(key); break;
				case 2: searchEmail(key); break;
				case 3: searchAddress(key); break;
				case 4: searchPhone(key); break;
			}
			
			System.out.println();
		}
	}
	
	void searchName(String key) {
		addrList.stream()
			.filter((n) -> n.getName().contains(key))
			.forEach(System.out::println);
	}
	
	void searchEmail(String key) {
		addrList.stream()
		.filter((n) -> n.getEmail().contains(key))
		.forEach(System.out::println);
	}
	
	void searchAddress(String key) {
		addrList.stream()
		.filter((n) -> n.getAddress().contains(key))
		.forEach(System.out::println);
	}
	
	void searchPhone(String key) {
		addrList.stream()
		.filter((n) -> n.getPhone().contains(key))
		.forEach(System.out::println);
	}
	
	public void sort() {		
		while(true) {	

			System.out.println("1. 이름으로 정렬");
			System.out.println("2. 이메일로 정렬");
			System.out.println("3. 주소로 정렬");
			System.out.println("4. 전화번호 정렬");
			System.out.println("0. 종료");
			
			System.out.print("선택 : ");	
			int menu = sc.nextInt();
			
			if(menu == 0)  return;
			
			addrList.stream()
				.sorted(
					(o1,o2)->{
						if(menu == 1) {
							return o1.getName().compareTo(o2.getName());
						}else if(menu == 2) {
							return o1.getEmail().compareTo(o2.getEmail());
						}else if(menu == 3) {
							return o1.getAddress().compareTo(o2.getAddress());
						}else{
							return o1.getPhone().compareTo(o2.getPhone());
						}
					})
				.forEach(System.out::println);

			System.out.println();
		}
	}
	
	void test() {
		//1. 서울시에 사는 사람 수 출력하기
		long count = addrList.stream().filter((n)->n.getAddress().contains("서울시")).count();
		System.out.println("서울시에 사는 사람 수 : " + count);
		
		//2. hanmail.net 사용하는 사람 수 출력하기
		count = addrList.stream().filter((n)->n.getEmail().contains("hanmail.net")).count();
		System.out.println("hanmail.net 사용하는 사람 수 : " + count);
		
		//3. naver.com 사용하는 사람 수 출력하기
		count = addrList.stream().filter((n)->n.getEmail().contains("naver.com")).count();
		System.out.println("naver.com 사용하는 사람 수 : " + count);
		
		//4. 금천구에 사는 사람 수 출력하기
		count = addrList.stream().filter((n)->n.getAddress().contains("금천구")).count();
		System.out.println("금천구에 사는 사람 수 : " + count);
		
		//5. 특정 지역에 사는 사람 수 출력하기
		String[] address = new String[] {"용인군", "관악구", "강남구"};
		for(String addr : address) {
			count = addrList.stream().filter((n)->n.getAddress().contains(addr)).count();
			System.out.println(addr + "에 사는 사람 수 : " + count);
		}
	}
}

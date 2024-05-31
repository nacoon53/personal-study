package 연산2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ScoreDto {
	String name = "";
	int kor = 0;
	int eng = 0;
	int mat = 0;
	int total = 0;
	float avg;
	String grade = "";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public ScoreDto() {
		super();
	}
	public ScoreDto(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d %d %d %d %.2f %s", name, kor, eng, mat, total, avg, grade);
		
	}
	
	
}
public class 연산2 {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(-1, 2, -3, 4, -5, 6, 7, 8, 9, 10);
		
		//map 연산 - 매개변수를 하나 갖고, 반환값이 반드시 존재하는 함수만 전달한다.
		numList.stream()
				.map( (n) -> n*-1)
				.forEach( (n) -> { System.out.println(n);});
		
		List<ScoreDto> scoreList = new ArrayList<ScoreDto>();
		scoreList.add(new ScoreDto("홍길동", 90, 90, 80));
		scoreList.add(new ScoreDto("김정현", 80, 70, 100));
		scoreList.add(new ScoreDto("이혁주", 60, 90, 80));
		scoreList.add(new ScoreDto("정소연", 80, 90, 60));
		scoreList.add(new ScoreDto("정경하", 70, 100, 70));
		scoreList.add(new ScoreDto("김정하", 70, 80, 40));
		scoreList.add(new ScoreDto("김정숙", 20, 90, 90));
		scoreList.add(new ScoreDto("유향미", 100, 80, 90));
		scoreList.add(new ScoreDto("최민정", 10, 60, 30));
		scoreList.add(new ScoreDto("장하영", 60, 90, 60));
		
		//변수를 추가하지 않고 forEach를 사용해서 총점과 평균을 구해서 출력하기
		scoreList.forEach((scoreDto) -> {
			scoreDto.setTotal( scoreDto.getKor() + scoreDto.getEng() + scoreDto.getMat() );
			scoreDto.setAvg( scoreDto.total / 3.0f );
			if(scoreDto.getAvg() >= 90) {
				scoreDto.setGrade("A");
			}else if(scoreDto.getAvg() >= 80) {
				scoreDto.setGrade("B");
			}else if(scoreDto.getAvg() >= 70) {
				scoreDto.setGrade("C");
			}else if(scoreDto.getAvg() >= 60) {
				scoreDto.setGrade("D");
			}else {
				scoreDto.setGrade("F");
			}
			
			System.out.println(scoreDto);
		});
		
		System.out.println(scoreList.get(0));
		
		//map을 이용해서 값들을 수정해서 Collect를 이용해서 다른 List로 보내기
		//필드 추출
		scoreList.stream().map( (dto)->dto.getGrade() ).forEach(System.out::println);
		
		long aCount = (int) scoreList.stream().map( (dto)->dto.getGrade()).filter((n)->n.equals("A")).count();
		long bCount = (int) scoreList.stream().map( (dto)->dto.getGrade()).filter((n)->n.equals("B")).count();
		long cCount = (int) scoreList.stream().map( (dto)->dto.getGrade()).filter((n)->n.equals("C")).count();
		
		System.out.println("A등급 : " + aCount);
		System.out.println("B등급 : " + bCount);
		System.out.println("C등급 : " + cCount);
	
		//1,2,3등 출력하기
		System.out.println("------------- 1,2,3등 출력하기 -------------");
		scoreList.stream().sorted( (x1, x2) -> x2.getTotal() - x1.getTotal()).limit(3).forEach(System.out::println);
	
		//이름으로 정렬하여 출력하기
		System.out.println("------------- 이름으로 정렬하여 출력하기 -------------");
		scoreList.stream().sorted((x1, x2)->x1.getName().compareTo(x2.getName())).forEach(System.out::println);
	
		//이름에서 김씨만 찾아서 성적순으로 정렬해서 출력하기
		System.out.println("이름에서 김씨만 찾아서 성적순으로 정렬해서 출력하기");
		scoreList.stream()
				.filter((n)->n.getName().startsWith("김"))
				.sorted((n1, n2)->n2.getTotal() - n1.getTotal())
				.forEach(System.out::println);
		
		//가운데 글자에 정이 들어가는 사람을 찾아서 출력하기 
		System.out.println("가운데 글자에 정이 들어가는 사람을 찾아서 출력하기 ");
		scoreList.stream()
				.filter((n)->n.getName().substring(1,2).equals("정"))
				.forEach(System.out::println);
		
		//미로 끝나는 사람을 찾아서 출력하기 
		System.out.println("미로 끝나는 사람을 찾아서 출력하기 ");
		scoreList.stream()
				.filter((n)->n.getName().endsWith("미"))
				.forEach(System.out::println);
		
		//이름에 정을 포함하는 사람을 찾아서 출력하기 
		System.out.println("이름에 정을 포함하는 사람을 찾아서 출력하기 ");
		scoreList.stream()
				.filter((n)->n.getName().contains("정"))
				.forEach(System.out::println);
		
		//등급이 A 또는 B인 사람만 성적순으로 내림차순하여 출력하기
		System.out.println("등급이 A 또는 B인 사람만 성적순으로 내림차순하여 출력하기");
		scoreList.stream()
			.filter((n)->n.getGrade().equals("A") || n.getGrade().equals("B"))
			.sorted((n1, n2)-> n2.getTotal() - n1.getTotal())
			.forEach(System.out::println);
		
		
	}
}

package 파일스트림;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class 파일스트림 {
	public static void main(String[] args) {
		
		//파일로 스트림 만들기
		long uniqueWords = 0;
		try{
			//파일의 라인 수 출력하기
			Stream<String> lines = Files.lines(Paths.get("data.txt"), Charset.defaultCharset()); //data.txt 파일이 src 폴더와 동일한 곳에 있어야 함.
			System.out.println("파일의 라인 수 :  "+ lines.count());
			
			//파일 내용의 고유 단어 수 출력하기
			lines = Files.lines(Paths.get("data.txt"), Charset.defaultCharset()); //data.txt 파일이 src 폴더와 동일한 곳에 있어야 함.
			uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" "))) //단어 단위로 스트림 생성
								.distinct()
								.count();			
			System.out.println("고유 단어 수 : " + uniqueWords);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	}
}

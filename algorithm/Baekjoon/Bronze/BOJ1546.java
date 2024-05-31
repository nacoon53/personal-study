import java.util.Scanner;

public class BOJ1546 {
	/*
	 * �����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ����
	 * M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�. ���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾�����
	 * ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�. �������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷���
	 * �ۼ��Ͻÿ�.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int subjectCnt = scan.nextInt();
		
		int score[] = new int[subjectCnt];
		int max = 0;
		float newScoreSum = 0;
		
		for(int i=0; i<subjectCnt; i++) {
			score[i] = scan.nextInt();
			if(max<score[i]) {
				max = score[i];
			}
		}
		
		for(int i=0; i<subjectCnt; i++) {
			newScoreSum += (float)score[i]/max*100;
		}
		
		System.out.println(newScoreSum/subjectCnt);
	}

}

public class StockPrice {
	/*
	 * 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
	 */
    public int[] solution(int[] prices) {
		int len = prices.length;
		int[] answer = new int[len];
		int i,j;
		
		for(i=0; i<len; i++) {
			for(j=i+1; j<len; j++) {
				answer[i]++;
				if(prices[i] > prices[j]) {
					break;
				}
			}
		}
		
        return answer;
    }
}

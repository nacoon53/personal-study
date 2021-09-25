import java.util.List;
import java.util.ArrayList;

class MakePrime {
    public int solution(int[] nums) {
        int answer = 0;

        List<Integer> primeN = new ArrayList<Integer>();

        //1000 * 50 미만의 수 중의 소수 구하기
        for(int i = 3; i <= 1000*50-1 ; i++) {
            boolean flag = false;
            for(int j=2; j<=Math.sqrt(i); j++) {
                if(i%j == 0){
                    flag = true; //소수가 아닐 경우
                    break;
                }   
            }            

            if(flag == false) {
                primeN.add(i);
            }
        }

        for(int i = 0; i < nums.length-2; i++) {
            for(int j= i+1; j< nums.length-1; j++) {
                for(int k = j+1; k < nums.length; k++){
                    int sum = (nums[i]+nums[j]+nums[k]);
                    if(primeN.contains(sum)){
                        answer++;
                        continue;
                    }
                }
            }
        }

        return answer;
    }
}
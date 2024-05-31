class RecommendNewID{
    public String solution(String new_id) {
        String answer = new_id;
        
        //1단계: new_id의 모든 대문자를 대응되는 소문자로 치환
        answer = answer.toLowerCase();
        
        //2단계: new_id에서 알파벳, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자 제거
        answer = answer.replaceAll("([^a-z|0-9|\\-|_|\\.])", "");
        
        //3단계: new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        answer = answer.replaceAll("\\.{2,}", ".");
        
        //4단계: new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거
        answer = answer.replaceAll("^\\.", "").replaceAll("\\.$","");
        
        //5단계: new_id가 빈 문자열이라면, new_id에 "a"를 대입
        if(answer.length() == 0) {
            answer = "a";
        }
        
        //6단계: 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
        if(answer.length() > 15) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("\\.$","");
        }
        //7단계: 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복
        int l = 3-answer.length();
        for(int i = 1; i<=l; i++) {
            answer = answer + answer.charAt(answer.length()-1);
        }
                
        return answer;
    }
}
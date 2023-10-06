class Solution {
    public void reverseString(char[] s) {
        char temp;

        for(int i = 0; i < s.length/2; i++) {     
            //앞글자와 뒷글자의 순서를 바꾼다.
            temp = s[i];
            s[i] = s[s.length-i-1]; 
            s[s.length-i-1] = temp;
        }
    }
}

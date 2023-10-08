class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();        
        int fizz=0, buzz =0;
        
        for(int i=1; i<=n; i++) {
            String str = "";
            fizz++; buzz++;
            
            if(fizz==3) {
                str += "Fizz";
                fizz = 0;
            }
            
            if(buzz==5) {
                str += "Buzz";
                buzz = 0;
            }
            
            if(str.equals("")) str = i+"";
            
            result.add(str);
        }
        
        return result;
    }
}
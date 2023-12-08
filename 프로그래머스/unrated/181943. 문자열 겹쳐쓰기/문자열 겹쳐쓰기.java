class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        int num1 = overwrite_string.length();
        int num2 = my_string.length();
        
        answer = my_string.substring(0,s) + overwrite_string + my_string.substring(s+num1, num2);
        
        return answer;
    }
}
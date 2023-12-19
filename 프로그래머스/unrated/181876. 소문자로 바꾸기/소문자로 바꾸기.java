class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i=0; i<myString.length(); i++){
        char c = myString.charAt(i);
            
            if(Character.isLowerCase(c)){
                answer = answer + Character.toLowerCase(c); 
            } else {
                answer = answer + Character.toLowerCase(c);
            }
            
        }
        
        return answer;
    }
}
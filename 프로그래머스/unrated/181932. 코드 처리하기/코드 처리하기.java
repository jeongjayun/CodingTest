class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
      
        for(int i=0; i<code.length(); i++){

            //mode 변경
             if (code.charAt(i) == '1') {
                mode = (mode == 0) ? 1 : 0;
            }
            
            if(mode==0){
                if(code.charAt(i)!='1' && i%2==0){
                    answer += code.charAt(i);
                } 
            } else if(mode==1){
                if(code.charAt(i)!='1' && i%2!=0){
                    answer += code.charAt(i);
                }
            }
                        
        }
        
          if(answer.isEmpty()){
                answer ="EMPTY";
            }
        
        return answer;
    }
}
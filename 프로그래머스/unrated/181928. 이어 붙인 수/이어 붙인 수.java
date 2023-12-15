class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String s1=""; //짝수 이어붙이기 
        String s2=""; //홀수 이어붙이기 
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                //num_list[i]가 짝수일 때
                s1 += String.valueOf(num_list[i]);
            } else {
                //홀수일 때
                s2 += String.valueOf(num_list[i]);
            }
        }
        answer = Integer.parseInt(s1)+Integer.parseInt(s2);
        return answer;
    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //n이 홀수일 때
        if(n%2!=0){
            for(int i=1; i<=n; i++){
                if(i%2!=0){
                    answer += i;
                }
            }
        } else { //n이 짝수일 때
            for(int i=1; i<=n; i++){
                if(i%2==0){
                    answer += i * i;
                }
                
            }
        }
        
        return answer;
    }
}
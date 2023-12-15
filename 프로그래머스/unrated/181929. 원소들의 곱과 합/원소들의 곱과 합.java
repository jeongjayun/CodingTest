class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        int result1=1; // 모든 원소들의 곱
        int result2=0; // 모든 원소들의 합
        
        for(int i=0; i<num_list.length; i++){
            //모든 원소들의 합
            result2 += num_list[i];
            //모든 원소들의 곱
            result1 *= num_list[i];
            
            if(result1 < Math.pow(result2,2)){
                answer = 1;
            } else {
                answer = 0;
            }
        }
        
        return answer;
    }
}
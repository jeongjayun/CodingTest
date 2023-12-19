class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for(int i=0; i<num_list.length; i++){
            // 첫번째로 나오는 음수의 인덱스를 구하세요.
            if(num_list[i]<0){
                answer = i;
                break;
            }
            
            for(int j=0; j<num_list.length; j++){
                if(num_list[j]>0){
                    answer =-1;
                }
            }
            
        }
        
        return answer;
    }
}
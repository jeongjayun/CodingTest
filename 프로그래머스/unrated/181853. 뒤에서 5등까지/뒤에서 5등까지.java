import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        //num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return
        
        Arrays.sort(num_list);
        
        for(int i=0; i<5; i++){
            answer[i] = num_list[i];    
        }
        
        return answer;
    }
}
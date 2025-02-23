class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        //배열의 길이가 다르면 긴 쪽이 크다
        //배열의 길이가 같으면 각 배열의 원소의 합을 비교.
        
        if(arr1.length > arr2.length){
            answer = 1;
        } else if(arr1.length < arr2.length){
            answer = -1;
        } else {
            int a = 0;
            int b = 0;
            
            for(int ar : arr1){
                a += ar;
            }
            
            for(int ar : arr2){
                b += ar;
            }
            
            if(a > b){
                answer = 1;
            } else if (a < b) {
                answer = -1;
            } else {
                answer = 0;
            }
        }
        
        return answer;
    }
}
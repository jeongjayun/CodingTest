import java.util.*;

class Solution {
    public int[] solution(int[] arr, int n) {
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 0) {
                // 배열의 길이가 짝수라면
                if (i % 2 != 0) {
                    // 짝수번째 인덱스에 n을 더해라
                    arr[i] += n;
                }
            } else {
                // 배열의 길이가 홀수라면
                if (i % 2 == 0) {
                    // 홀수번째 인덱스에 n을 더해라
                    arr[i] += n;
                }
            }

            answerList.add(arr[i]);
        }

        // List를 배열로 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}

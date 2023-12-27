import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    //문제 확인
    //9개의 다른 자연수, 최댓값과 몇번째 숫자인지.

    Scanner sc = new Scanner(System.in);

    int[] arr = new int[9]; //9개의 수가 저장될 배열
    int max = 0; //최댓값 초기화
        int index = 0; // 인덱스

    for(int i=0; i<9; i++){
        int N = sc.nextInt(); //입력받을 숫자.
        arr[i] = N;

        if(max < arr[i]){
            max = arr[i];
            index = i + 1;
        }
    }
        System.out.println(max);
        System.out.println(index);
    }
}
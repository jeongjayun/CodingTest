import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // N개의 바구니, M번 던질 수 입력받기
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] arr = new int[N]; // N개만큼 바구니 배열 만들기

        for (int i = 0; i < M; i++) {
            int I= scanner.nextInt(); // I번 바구니부터
            int J= scanner.nextInt(); // J번 바구니까지
            int K= scanner.nextInt(); // K번 공을
                                      // M번 넣는다.
            for (int j = I - 1; j < J; j++) {
                // 배열의 인덱스는 0부터 시작하고
                // 1<=I<=J<=N 이므로 -1 해준다.
                arr[j] = K;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }

    }
}
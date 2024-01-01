import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 바구니 총 갯수
        int M = scanner.nextInt(); // M번만큼 바구니 순서를 역순으로 만든다.

        int[] baskets = new int[N + 1]; // 바구니

        for (int i = 1; i <= N; i++) {
            baskets[i] = i;
        }

        for (int k = 0; k < M; k++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            for (int h = i; h <= j; h++) {
                int nn = j--;

                int tmp = baskets[h];
                baskets[h] = baskets[nn];
                baskets[nn] = tmp;
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(baskets[i] + " ");
        }

    }
}
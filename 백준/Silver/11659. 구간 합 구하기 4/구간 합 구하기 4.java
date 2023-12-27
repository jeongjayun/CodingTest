import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] arr = new int[N + 1];

        arr[0]=0;

        for (int i = 1; i <= N; i++) {
            arr[i] = arr[i - 1] + scanner.nextInt();
        }

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(arr[b] - arr[a - 1]);
        }
        
    }
}
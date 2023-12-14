import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// 정수 N개로 이루어진 수열
		int N = sc.nextInt();

		// 정수 X
		int X = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if (a < X) { // X보다 작은 수를 입력받은 순서대로 출력
				System.out.print(a + " ");
			}
		}
	}

}
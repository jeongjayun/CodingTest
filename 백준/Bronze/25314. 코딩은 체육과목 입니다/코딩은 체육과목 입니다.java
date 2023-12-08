import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제의 정수 N
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // N은 4의 배수

		if (N % 4 == 0) {
			for (int i = 1; 4 * i <= N; i++) {
				System.out.print("long ");
			}
			System.out.print("int");
		}
	}
}
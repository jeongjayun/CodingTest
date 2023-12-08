import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); // 영수증에 적힌 총 금액 X
		int N = sc.nextInt(); // 영수증에 적힌 구매한 물건의 종류 수 N

		// 이후 N개의 줄에는 각 물건의 가격 a의 개수와 b가 공백을 두고 주어진다.

		ArrayList<Integer> A = new ArrayList<>();
		ArrayList<Integer> B = new ArrayList<>();
		ArrayList<Integer> C = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			int a = sc.nextInt(); // 물건 가격
			int b = sc.nextInt(); // 물건 개수

			A.add(a);
			B.add(b);
		}

		for (int i = 0; i < N; i++) {
			int c = A.get(i) * B.get(i);
			C.add(c);
		}

		int sum = 0;

		for (int i = 0; i < N; i++) {
			sum += C.get(i);
		}

		if (sum == X) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
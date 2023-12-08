import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 입력받은 테스트 케이스 갯수

		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();

		for (int l = 0; l < T; l++) {
			// 테스트 갯수만큼 반복
			int A = sc.nextInt();
			int B = sc.nextInt();

			a.add(l, A);
			b.add(l, B);
		}

		for (int i = 0; i < T; i++) {
			System.out.println(a.get(i) + b.get(i));
		}

	}
}
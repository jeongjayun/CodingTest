import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		// 주사위 세 개가 같을 때
		if (A == B && B == C) {
			System.out.println(10000 + A * 1000);
		}
		// 2개의 주사위가 같을 때
		else if (A == B || A == C) {
			System.out.println(1000 + A * 100);
		} else if (B == C) {
			System.out.println(1000 + B * 100);
		}
		// 3개의 주사위 중에가장 큰 주사위
		else {
			int max;
			if (A > B) {
				if (C > A) { // C > A > B
					max = C;
				} else { // A > B >= C
					max = A;
				}
			} else {
				if (C > B) { // C > B >= A
					max = C;
				} else { // B >= C > A
					max = B;
				}
			}
			System.out.println(max * 100);
		}
	}
}
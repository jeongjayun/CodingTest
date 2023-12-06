import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정수 H와 M이주어진다. 0:00~23:59
		// 0<=H<=23, 0<=M<=59

		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(); // 시
		int M = sc.nextInt(); // 분

		// 입력된 숫자보다 45 일찍
		if (M - 45 > 0) { // M이 45보다 클 때
			System.out.println(H);
			System.out.println(M - 45);
		} else if (M - 45 == 0) { // M이 45일 때
			System.out.println(H);
			System.out.println(0); // M이 45보다 작을 때
		} else if (M - 45 < 0) {
			if (H - 1 < 0) {
				System.out.println(23);
			} else {
				System.out.println(H - 1);
			}
			System.out.println(60 + M - 45);
		}

	}

}
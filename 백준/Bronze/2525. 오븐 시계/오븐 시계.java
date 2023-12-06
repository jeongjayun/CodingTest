import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 오븐구이가 끝나는 시간을 '분'단위로 자동계산
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // 시
		int B = sc.nextInt(); // 분
		int C = sc.nextInt();// 오븐구이하는데 필요한 시간 (분)

		int D = B + C;

		if (D < 60) {
			System.out.print(A);
			System.out.print(" " + D);
		} else if (D >= 60) { // 60이상의 수로 입력되면
			if (D % 60 != 0) { // 나머지가 0이 아니다.

				if (A + (D / 60) >= 24) { // 23시를 넘어버리면
					System.out.print(((A + (D / 60)) - 24));
				} else {
					System.out.print(A + (D / 60));
				} // 몫은 더하고
				System.out.print(" " + (D % 60)); // 나머지는 분으로.
			} else if (D % 60 == 0) { // 나머지가 0이다.

				if (A + (D / 60) >= 24) { // 23시를 넘어버리면
					System.out.print(((A + (D / 60)) - 24));
				} else {
					System.out.print(A + (D / 60));
				} // 몫은 더하고

				System.out.print(" " + D % 60); // 나머지는 분으로.
			}
		}
	}

}
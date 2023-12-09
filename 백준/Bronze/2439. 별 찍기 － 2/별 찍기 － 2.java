import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 별 줄 입력받아

		for (int i = 1; i <= N; i++) {
			for (int k = 1; k <= N - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i ; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt(); // 별 줄 입력받아 

//		for (int i = 0; i < N; i++) {
//			for (int k = (N - 1); k >= i; k--) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < i + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}
// 이클립스 런처에서는 작동하는데 백준에만 넣으면 출력형식의 오류가 있다니 .. 왜일까 .. 

	}

}
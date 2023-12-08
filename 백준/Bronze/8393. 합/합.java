import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// n이 주어진다
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;

		// 1부터 n까지의 합
		for (int i = 1; i <= n; i++) {
			// sum = sum + i;
			sum += i;
		}

		System.out.println(sum);
	}

}
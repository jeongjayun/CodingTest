import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 연도 입력
		Scanner sc = new Scanner(System.in);
		int Year = sc.nextInt();

		// 4의 배수면서 100의 배수 아닐 때
		// 400의 배수일 때

		if (Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}
}
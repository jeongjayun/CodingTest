import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(a + b);
		}

		sc.close(); // EOF에 대해서 묻는 질문이었다.

		// # EOF(End of File) 개념
		// - 입력에서 더이상 읽을 수 있는 데이터가 없을 때
		// - null 을 뜻한다.

		// ***Scanner***
		// Scanner의 메소드들의 경우 더이상 읽을 데이터가 없으면 NoSuchElementException을 던지게 된다. 던져진 예외의 경우
		// **hasNext()** 메소드를 사용하여 처리한다.
		// **EOF의 경우 false 반환, 값이 있는 경우 true 반환**

	}

}
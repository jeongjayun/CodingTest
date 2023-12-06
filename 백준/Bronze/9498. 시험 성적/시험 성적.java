import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Grade = sc.nextInt();
		if (90 <= Grade && Grade <= 100) {
			System.out.println("A");
		} else if (80 <= Grade && Grade <= 89) {
			System.out.println("B");
		} else if (70 <= Grade && Grade <= 79) {
			System.out.println("C");
		} else if (60 <= Grade && Grade <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
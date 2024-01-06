import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();

        StringTokenizer st = new StringTokenizer(S, " ");
        System.out.println(st.countTokens());
    }
}
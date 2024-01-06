import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(S, " ");

        int A = Integer.parseInt(new StringBuffer(stringTokenizer.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuffer(stringTokenizer.nextToken()).reverse().toString());

        System.out.println(Math.max(A, B));
    }
}
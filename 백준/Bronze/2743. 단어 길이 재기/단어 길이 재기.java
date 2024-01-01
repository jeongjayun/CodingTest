import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char[] Arr = word.toCharArray();
        System.out.println(Arr.length);
    }
}
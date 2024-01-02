import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 문자열 입력 횟수
        scanner.nextLine();

        String[] words = new String[T];

        for (int i = 0; i < words.length; i++) {
            String str = scanner.nextLine();
            words[i] = str;
        }
        for (int i = 0; i < words.length; i++) {
            char start = words[i].charAt(0);
            char end = words[i].charAt(words[i].length()-1);
            System.out.print(start);
            System.out.println(end);
        }

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //단어 S, 정수 i, i번째 글자 출력

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int num = scanner.nextInt();
        char[] array = word.toCharArray();
        System.out.println(array[num-1]);
    }
}
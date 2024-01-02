import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T= scanner.nextInt(); //테스트 케이스 개수

        for (int i = 0; i < T; i++) {
            int R = scanner.nextInt();//반복횟수
            String S = scanner.next();//문자열 입력

            //각 문자를 R번 반복
            for (char c : S.toCharArray()) {
                for (int j = 0; j < R; j++) {
                    System.out.print(c);
                }
            }
            System.out.println(); //개행
        }
    }
}
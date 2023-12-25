import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //N값 입력받기
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        //길이 N의 숫자를 입력받아 String형 변수 sNum에 저장하기
        String sNum = scanner.next();
        //sNum을 다시 char[]형 변수 cNum에 변환하여 저장하기
        char[] cNum = sNum.toCharArray();
        //int형 sum 선언
        int sum = 0; //초기화

        //cNum만큼 반복
        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0';
        }

        //sum 출력
        System.out.println(sum);
    }
}
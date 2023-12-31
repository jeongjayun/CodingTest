import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        //알파벳이 단어에 포함되어 있는 경우 등장하는 위치, 포함되지 않은 경우 -1
        int[] positions = new int[26];//알파벳 개수

        for (int i = 0; i < positions.length; i++) {
            positions[i] = -1; //모든 알파벳 위치 -1로 초기화
        }

        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);
            int index = currentChar - 'a'; //알파벳 인덱스 계산

            if (positions[index] == -1) {
                positions[index] = i; //처음 등장한 경우 위치 저장
            }
        }

        for (int position : positions) {
            System.out.print(position + " ");
        }

    }
}
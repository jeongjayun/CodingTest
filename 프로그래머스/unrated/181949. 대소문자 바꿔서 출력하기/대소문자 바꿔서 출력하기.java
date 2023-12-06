import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String answer=""; //초기화
        
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(Character.isLowerCase(c)){
                answer=answer+Character.toUpperCase(c);
            } else {
                answer=answer+Character.toLowerCase(c);
            }
        }
        
        System.out.println(answer);
    }
}
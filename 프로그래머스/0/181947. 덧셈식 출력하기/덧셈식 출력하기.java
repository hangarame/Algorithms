import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>=1 && a<=100 && b>=1 && b<=100) {
            System.out.printf("%d + %d = %d", a, b, a + b);
        } else {
            System.out.println("1~100사이의 수를 입력해주세요.");
            return;
        }
        
        
    }
}
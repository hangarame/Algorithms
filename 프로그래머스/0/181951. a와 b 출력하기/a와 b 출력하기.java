import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if((a >= -100000 && a <= 100000) && (b >= -100000 && b <= 100000)) {
            System.out.printf("a = %d\n", a);
            System.out.printf("b = %d", b);
        }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
}
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] newStr = a.toCharArray();
        
        for(int i=0; i < newStr.length; i++) {
        	
        	if(newStr[i] >= 65 && newStr[i] <=90) {
        		newStr[i] = (char)(newStr[i] + 32);
        	} else if(newStr[i] >= 97 && newStr[i] <= 122) {
        		newStr[i] = (char)(newStr[i] - 32);
        	} else {
        		System.out.println("영문자가 아닌 문자가 입력되었습니다.");
        		return;
        	}
        }
        
        System.out.println(String.valueOf(newStr));
    }
}
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        
        
        List<Integer> group1 = new ArrayList<Integer>();
        List<Integer> group2 = new ArrayList<Integer>();
        
        
        //각 수의 약수
        for(int i=1; i<=n; i++) {
        	if(n % i == 0) {
        		group1.add(i);
        	}
        }
        
        for(int i=1; i<=m; i++) {
        	if(m % i == 0) {
        		group2.add(i);
        	}
        }
        
        //최대 공약수
        int gcd = 0;
        group1.sort((o1, o2) -> o2 - o1);
        group2.sort((o1, o2) -> o2 - o1);
        
        for(int i : group1) {
        	for(int j : group2) {
        		if(i == j) {
        			gcd = i;
                    break;
        		}
        	}
            
            if(gcd != 0) {
        		break;
        	}
        }
        
        //최소 공배수
        int lcm = gcd * (n/gcd) * (m/gcd);
        
        answer = number % lcm == 0 ? 1 : 0;
        
        
        return answer;
    }
}
class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        for(char chr : control.toCharArray()) {
        	if(chr == 'w') {
        		answer += 1;
        	} else if(chr == 's') {
        		answer -= 1;
        	} else if(chr == 'd') {
        		answer += 10;
        	} else if(chr == 'a') {
        		answer -= 10;
        	}
        }
        
        return answer;
    }
}
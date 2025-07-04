class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        char[] temp = my_string.toCharArray();
        
        int j = 0;
        
        for(int i=0; i<temp.length; i++) {
        	if(i < s) {
        		continue;
        	} else {
        		if(j<overwrite_string.length()) {
        			temp[i] = overwrite_string.charAt(j);
            		j++;
        		}
        	}
        	
        }
        
        answer = String.valueOf(temp);
        
        return answer;
    }
}
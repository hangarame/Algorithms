class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        
        char[] codeArr = code.toCharArray();
        
        int mode = 0;
        
        for(int i=0; i<codeArr.length; i++) {
        	if(codeArr[i] == '1') {
        		mode = mode == 0 ? 1 : 0;
        	} else {
        		if(mode == 0) {
            		if(i % 2 == 0) {
            			sb.append(codeArr[i]); 
            		}
            	} else {
            		if(i % 2 == 1) {
            			sb.append(codeArr[i]);
            		}
            	}
        	}
        }
        
        String ret = sb.length() > 0 ? sb.toString() : "EMPTY";
        
        
        
        return ret;
    }
}
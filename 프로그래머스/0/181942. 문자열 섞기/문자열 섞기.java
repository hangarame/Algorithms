class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        String[] strArray1 = str1.split("");
        String[] strArray2 = str2.split("");
        
        int size = 0;
        
        if(strArray1.length < strArray2.length) {
            size = strArray1.length;
        } else {
            size = strArray2.length;
        }
        
        for(int i=0; i < size; i++) {
            sb.append(strArray1[i]);
            sb.append(strArray2[i]);
            
        }
        
        sb.append(str1.substring(size));
        sb.append(str2.substring(size));
        
        answer = sb.toString();
        
        return answer;
    }
}
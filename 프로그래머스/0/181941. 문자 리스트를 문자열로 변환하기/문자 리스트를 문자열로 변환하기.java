class Solution {
    public String solution(String[] arr) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        for(String str : arr) {
            sb.append(str);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}
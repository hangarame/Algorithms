class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String oddNum = "";
        String evenNum = "";
        
        
        
        for(int i :num_list) {
        	if(i % 2 == 1) {
        		oddNum += i;
        	} else {
        		evenNum += i;
        	}
        }
        
        System.out.println("oddNum: " + oddNum);
        System.out.println("evenNum: " + evenNum);
        
        answer = Integer.parseInt(oddNum) + Integer.parseInt(evenNum);
        
        return answer;
    }
}
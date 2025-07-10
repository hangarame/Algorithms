import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int[] query : queries) {
        	
        	int tmp = -1;
        	
        	for(int i=query[0]; i<=query[1]; i++) {
        		
        		if(arr[i] > query[2]) {
        			
        			if(tmp == -1) {
        				tmp = arr[i];
        				
        			} else {
        				tmp = arr[i] < tmp ? arr[i] : tmp;
        			}
        		}
        		
        	}
        	list.add(tmp);
        	
        }
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}
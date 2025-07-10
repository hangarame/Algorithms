import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<=num_list.length; i++) {
        	if(i < num_list.length) {
        		list.add(num_list[i]);
        	} else {
        		if(num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
        			list.add(num_list[num_list.length - 1] - num_list[num_list.length - 2]);
        		} else {
        			list.add(num_list[num_list.length - 1] * 2);
        		}
        	}
        }
        
        answer = list.stream().mapToInt(num -> num.intValue()).toArray();
        
        
        return answer;
    }
}
class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int product = 1;
        
        for(int i : num_list) {
        	sum += i;
        	product *= i;
        }
        
        if(product > Math.pow(sum, 2)) {
        	return 0;
        } else {
        	return 1;
        }
    }
}
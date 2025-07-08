class Solution {
    public int solution(int n) {
        if(n % 2 == 1) {
            return getSumOdd(n);
        } else {
        	return getSumEven(n);
        }
    }
    
    public int getSumOdd(int n) {
    	return n + ((n-2) <= 0 ? 0 : getSumOdd(n-2));
    }
    
    public int getSumEven(int n) {
    	return (int)Math.pow(n, 2) + ((n-2) <= 0 ? 0 : getSumEven(n-2));
    }
}
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        //		int arr[] = {0, 1, 2, 4, 3};
//		int queries[][] = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};
//		System.out.println(Arrays.stream(sol.solution(arr, queries)).boxed().collect(Collectors.toList()).toString());
		
        for(int query[] : queries) {
        	
        	int s = query[0];
        	int e = query[1];
        	int k = query[2];
        	
        	for(int i = s; i<=e; i++) {
        		if(i % k == 0) {
        			arr[i] += 1;
        			
        		}
        	}
        	
        }
        
        return arr;
    }
}
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int n = Integer.MAX_VALUE;
        
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2] && n > arr[j]) {
                    n = arr[j];
                }  
            }
            answer[i] = (n != Integer.MAX_VALUE) ? n : -1;
            n = Integer.MAX_VALUE;
        }
        
        return answer;
    }
}
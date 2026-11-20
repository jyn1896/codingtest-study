class Solution {
    public double solution(int[] numbers) {
        double amount = 0;
        
        for (int x : numbers) {
            amount += x;
        }
        
        return amount/numbers.length;
    }
}
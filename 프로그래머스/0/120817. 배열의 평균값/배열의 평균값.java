class Solution {
    public double solution(int[] numbers) {
        double amount = 0;
        
        for (int i=0; i<numbers.length; i++) {
            amount += numbers[i];
        }
        
        return amount/numbers.length;
    }
}
class Solution {
    public int[] solution(int money) {
        int coffee = 0;
        
        while (money >= 5500) {
            money -= 5500;
            coffee ++;
        }
        
        int[] answer = {coffee, money};
        
        return answer;
    }
}
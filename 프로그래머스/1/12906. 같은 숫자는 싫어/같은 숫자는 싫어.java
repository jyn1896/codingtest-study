import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int x : arr) {
            if (stack.isEmpty() || stack.peek() != x) {
                stack.push(x);
            }
        }

        int n = stack.size();
        int[] answer = new int[n];
        
        while (!stack.isEmpty()) {
            answer[n-1] = stack.pop();   
            n--;
        }
        
        return answer;
    }
}
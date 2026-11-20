import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            int[] price = new int[n];
            
            for (int i = 0; i < n; i++) {
                price[i] = sc.nextInt();
            }
            
            int maxPrice = 0;
            long profit = 0;
            
            for (int i = n -1; i >=0; i--) {
                if (price[i] > maxPrice) {
                    maxPrice = price[i];
                } else {
                    profit += maxPrice - price[i];
                }
            }
            
            System.out.println("#" + test_case + " " + profit);
		}
	}
}
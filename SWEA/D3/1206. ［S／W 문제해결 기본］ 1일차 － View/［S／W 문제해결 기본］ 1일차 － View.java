import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			/////////////////////////////////////////////////////////////////////////////////////////////
			int n = sc.nextInt();
            int answer = 0;
            
            int[] buildings = new int[n];
            
            for(int i = 0; i < n; i++) {
                buildings[i] = sc.nextInt();
            }
            
            //확인할 빌딩 순서대로 받기
            for (int i = 2 ; i <n-2; i++) {
                
                int side_max = 0;
                
                //정해진 빌딩 좌우 2칸 안에서 제일 높은 빌딩 찾기
                if (buildings[i-1] >side_max) side_max = buildings[i-1];
                if (buildings[i-2] >side_max) side_max = buildings[i-2];
                if (buildings[i+1] >side_max) side_max = buildings[i+1];
                if (buildings[i+2] >side_max) side_max = buildings[i+2];
                
                //조망권 겟
                if (buildings[i] > side_max) {
                    answer += buildings[i] - side_max;
                }
            }
            
            
            System.out.println("#" + test_case + " " + answer);
			/////////////////////////////////////////////////////////////////////////////////////////////
		}
	}
}
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
            int m = sc.nextInt();
            
            int[][] map = new int[n][n];
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            
            int max_catch = 0;
            
            //M*M의 시작위치(좌상단)
            for (int i = 0; i <= n-m; i++) {
                for (int j = 0; j <= n-m; j++) {
                    int now_catch = 0;
                    
                    //파리채 내려치기
                    for (int r = 0; r < m; r++) {
                        for (int c = 0; c<m; c++) {
                            now_catch += map[i+r][j+c];
                        }
                    }
                    
                    //전에 잡은 최대 파리 수랑 비교하기
                     if (now_catch > max_catch) {
                        max_catch = now_catch;
                    }   
                }
            }
            
            System.out.printf("#%d %d%n", test_case, max_catch);
            
        }
	}
}
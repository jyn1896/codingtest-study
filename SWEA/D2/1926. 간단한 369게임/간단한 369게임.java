import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
            
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            //현재 숫자를 문자로 저장
            String str = "" + i;
            // 삼육구 등장 횟수 셀 변수
            int cnt = 0;
                
                for (int k = 0; k < str.length(); k++) {
    char ch = str.charAt(k);
    if (ch == '3' || ch == '6' || ch == '9') {
        cnt++;
    }
}
                
                
                switch (cnt) {
                    case 0 :
                        System.out.print(i + " ");
                        break;
                    case 1 :
                        System.out.print("- ");
                        break;
                    case 2 :
                        System.out.print("-- ");
                        break;
                    case 3 :
                        System.out.print("--- ");
                        break;
                }
            }
	}
}
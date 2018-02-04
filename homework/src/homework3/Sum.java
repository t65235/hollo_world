package homework3;

public class Sum {
	static int sum(int n) {
		if(n>=1)
		    n = 2*n + sum(n-1);
		return n;
	}
	public static void main(String[] args) {
		/*7.	遞迴函數的練習-Sum
寫一遞迴函數int sum (int n)用來計算2+4+6…+2n的值。
*/		int x = 6;
		System.out.print(sum(x));
		
	}

}

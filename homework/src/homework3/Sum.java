package homework3;

public class Sum {
	static int sum(int n) {
		if(n>=1)
		    n = 2*n + sum(n-1);
		return n;
	}
	public static void main(String[] args) {
		/*7.	���j��ƪ��m��-Sum
�g�@���j���int sum (int n)�Ψӭp��2+4+6�K+2n���ȡC
*/		int x = 6;
		System.out.print(sum(x));
		
	}

}

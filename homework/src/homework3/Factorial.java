package homework3;

public class Factorial {

	static int method(int x ) {
		/*6.	���j��ƪ��m��-Factorial
�g�@���j���int factorial (int n)�Ψӭp��1*2*3*�K*n���ȡC
���ܡGfactorial (n) = n * factorial(n-1)�Afactorial(1)=1
*/		if(x>1)
			x*=method(x-1);
			
			return(x);
			
	}
	public static void main(String[] args) {
		int x=5 ;
		System.out.printf("%d���j��ƭȵ���%d",x,method(x));
	
	}
	
}

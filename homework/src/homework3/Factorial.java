package homework3;

public class Factorial {

	static int method(int x ) {
		/*6.	患癹ㄧ计絤策-Factorial
糶患癹ㄧ计int factorial (int n)ノㄓ璸衡1*2*3**n
矗ボfactorial (n) = n * factorial(n-1)factorial(1)=1
*/		if(x>1)
			x*=method(x-1);
			
			return(x);
			
	}
	public static void main(String[] args) {
		int x=5 ;
		System.out.printf("%d患癹ㄧ计单%d",x,method(x));
	
	}
	
}

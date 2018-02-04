package homework3;

public class Sigma {

	public static void main(String[] args) {
		/*2.	函數的練習-Sigma
寫一函數double my_fun (double x, int n)如下：
 
提示：利用上題的power(x,n)和課堂上的factorial(n)來完成。*/
		double x =2 ;
		int n=3;
		double sum =0 , sum2= 1;
		for (int i=1 ; i <= n; i++) {
			sum2= 1;
			for(int j =1 ; j<=i ; j++ )
				sum2 *=j;
			sum += Math.pow(x, i)/sum2 ;
		}
		System.out.println(sum);
	}

}

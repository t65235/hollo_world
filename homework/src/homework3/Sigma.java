package homework3;

public class Sigma {

	public static void main(String[] args) {
		/*2.	��ƪ��m��-Sigma
�g�@���double my_fun (double x, int n)�p�U�G
 
���ܡG�Q�ΤW�D��power(x,n)�M�Ұ�W��factorial(n)�ӧ����C*/
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

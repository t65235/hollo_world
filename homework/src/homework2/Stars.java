package homework2;

public class Stars {
	public static void main(String[] args) {
		System.out.println("�ĤE�D");
		/*9.	�j��ԭz���m��-Stars
		   �e�X�U�C�T�رƦC���P�P�ϧΡC*/
		int i = 0;
		int j = 0;
		int k = 0;
		String l= "" ;
		for ( i=1; i<=5; i++ ) {
			l = l + "*" ;
			System.out.println(l);
		}
		System.out.println("");
		for( i=1;i<=5;i++) {
			for( j = 1 ; j<i;j++) {
				System.out.print(" ");
			}
			for( k =5 ; k>=i;k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for ( i=1; i<=5; i++ ) {
			
			   for( j=4; j>=i; j--){  //�NJ�]�w��a-1  �Ĥ@��|�]  �|���ť�
		              System.out.print(" ");
		           
		           }
		      
		           for( k=1; k<=2*i-1; k++){//��i=1  k=1  �|�]�X�@��*   ��i=2  k=3   �|�]�X�T��*
		              System.out.print("*");
		         }
		           System.out.println();
		}
	}
}

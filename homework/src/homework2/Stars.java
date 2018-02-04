package homework2;

public class Stars {
	public static void main(String[] args) {
		System.out.println("第九題");
		/*9.	迴圈敘述的練習-Stars
		   畫出下列三種排列的星星圖形。*/
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
			
			   for( j=4; j>=i; j--){  //將J設定為a-1  第一行會跑  四次空白
		              System.out.print(" ");
		           
		           }
		      
		           for( k=1; k<=2*i-1; k++){//當i=1  k=1  會跑出一個*   當i=2  k=3   會跑出三個*
		              System.out.print("*");
		         }
		           System.out.println();
		}
	}
}

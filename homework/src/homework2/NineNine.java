package homework2;

public class NineNine {

	public static void main(String[] args) {
		System.out.println("第十題");
		/*10.	迴圈敘述的練習-NineNine
   印出下列九九乘法表：

   		|	1	2	3	4	5	6	7	8	9
    -----------------------------------------------------------------
     9	|	9	18	27	36	45	54	63	72	81
     8	|	8	16	24	32	40	48	56	64
     7	|	7	14	21	28	35	42	49
     6	|	6	12	18	24	30	36
     5	|	5	10	15	20	25
     4	|	4	8	12	16
     3	|	3	6	9
     2	|	2	4
     1	| 	1
*/
		int i , j =0;
		System.out.println("        |       1        2       3       4       5       6      7       8       9");
		System.out.println("---------------------------------------------------------------------------------------------");
		for(i=9;i>=1;i--) {
			String k = "";
			for(j=1;j<=i;j++) {
				k = k+"\t"+ i*j ;
				
			}System.out.printf("%d\t|  %s\n",i,k);
		}
		
	}

}

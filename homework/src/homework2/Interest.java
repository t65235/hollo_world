package homework2;

public class Interest {

	public static void main(String[] args) {
		System.out.println("第十一題");
		/*11.	迴圈敘述的練習-Interest
		錢精打以10%單利投資100000元，郝細算則以5%複利投資100000元。計算多少年後郝細算的投資可以超過錢精打，並將此時兩人錢數印出。(27年後)
		提示：單利公式：P(1+r*n)    複利公式：P(1+r)n
		P：本金，r：利率，n：多少年 */
		int i =1;
		double p = 100000; //錢精打的錢
		double s = 100000; //郝細算的錢
		double r = 0.1 ;  // 單利 利率
		double t = 0.05 ; //複利利率
		for (i=1;(p*(1+r*i))>(s*Math.pow((1+t),i));i++) {
			
		}
		System.out.printf("%d年後郝細算的投資可以超過錢精打\n ",i);
		System.out.println(p*(1+r*i));
		System.out.printf("%10.2f",s*Math.pow((1+t),i));
		
		
		
		
	}

}

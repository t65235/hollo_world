package homework2;

public class Loan {

	public static void method(String[] args) {
		int i,j= 0;
		
		int a = 100000;
		
		for(i=1;i>0;i++) {
			if (a*1.2==i*12)break;
		}System.out.printf("銀行複利每月需還%d\n",i);
		System.out.printf("銀行總共需要還%d\n",i*12);
		for(i=1;i>0;i++) {     // ((a*b-c)*b-c)= a *b *b - c* b1 - c *b0    b=1.1 c= 要還的
			double k = 0;
			for(j=0;j<12;j++) {
				k = k + Math.pow(1.1, j);
			
			}
			if ((a*Math.pow(1.1, 12))-i*k<=i*12)break;
		};
			System.out.printf("當鋪複利每月需還%d\n",i-1);
			System.out.printf("當鋪總共需要還%d\n",i*12);
		for(i=1;i>0;i++) {    
			double k = 0;
			double b = Math.pow(1.01,30);
			for(j=0;j<12;j++) {       // b=(1.01)30 c =要還的
				k = k + Math.pow(b, j);
			
			}
			if ((a*Math.pow(b, 12))-i*k<=i*12)break;
		};
			System.out.printf("地下錢莊複利每月需還%d\n",i-1);
			System.out.printf("地下錢莊總共需要還%d\n",i*12);
		double s =0;
		for(i=0;i<12;i++) {
			System.out.printf("銀行第%d年需要還%.0f\n",i+1,a/12+(a-a/12 *i)*0.2/12);
			s = s+ a/12+(a-a/12 *i)*0.2/12 ;
		}	
			System.out.printf("銀行總共需要還%.0f\n",s);
			s =0;
		for(i=0;i<12;i++) {
			System.out.printf("當鋪第%d年需要還%.0f\n",i+1,a/12+(a-a/12 *i)*0.1);	
			s = s+ a/12+(a-a/12 *i)*0.1;
		}	System.out.printf("當鋪總共需要還%.0f\n",s);
		s =0;
		for(i=0;i<12;i++) {
			System.out.printf("地下錢莊第%d年需要還%.0f\n",i+1,a/12+(a-a/12 *i)*0.3);	
			s = s+ a/12+(a-a/12 *i)*0.3;
		}	System.out.printf("地下錢莊總共需要還%.0f\n",s);
	}
	
	public static void main(String[] args) {
		System.out.println("第十二題");
		/* 12.	迴圈敘述的練習-Loan
		錢不精以100000元分別向銀行、當鋪和地下錢莊借貸。若銀行的年利率為20%，
		當鋪月利率為10%和地下錢莊日利率為1%。以月為單位，計算一個月後至一年後每個月該歸還多少錢。*/
		int a=100000;
		for(int i=1;i<=12;i++) {
			System.out.printf("銀行只借%d個月該還%.0f元\n",i,a*(1+0.2/12*i));
			System.out.printf("當鋪只借%d個月該還%.0f元\n",i,a*(1+0.1*i));
			System.out.printf("地下錢莊只借%d個月該還%.0f元\n",i,a*(1+0.01*30*i));
			
		}
		
		
		
		
		

}}

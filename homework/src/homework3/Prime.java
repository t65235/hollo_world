package homework3;

public class Prime {
	
	
	public static void main(String[] args) {
		/*4.	函數的練習-Prime
寫一函數int prime (int n)用來找出第n個質數。*/
	int n = 9;
	int c ,d = 0;
	for(int i=1;i>0;i++) {
		c=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0)
				c += 1;}
		if(c==2)
			d +=1 ;
		if(d==n) {
			System.out.print(i);
		break;}
		}
		


	}

}

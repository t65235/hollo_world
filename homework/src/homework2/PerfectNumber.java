package homework2;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("第三題");
		/*3.	迴圏的練習-PerfectNumber
		一個數字若等於其所有因數的總和，則此數為perfect number。
		找出100以內所有的完美數。
		說明：6的因數為1, 2, 3，6=1+2+3，故6為完美數。*/
		int a= 100;
		String c="";
		for(int i=1;i<=a;i++) {
		int b =0;
			for(int j =1;j<i;j++ ) {
			if (i%j==0) {
				b=b+j;
				}}
		if(i==b) {
			c+=i+"    ";
			
		}}
		System.out.printf("%d以內所有的完美數: %s",a,c);
}
}

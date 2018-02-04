package homework2;

public class Factor {

	public static void main(String[] args) {
		System.out.println("第二題");
		/*2.	迴圏的練習-Factor
		輸入一正整數，求其所有的因數。
		說明：36的因數為1, 2, 3, 4, 6, 9, 12, 18, 36。*/
		int a= 36;
		String b ="";
		for(int i =1;i<=a;i++ ) {
			if (a%i==0) {
				b=b+i+"\t";
			}else continue;
		}
		System.out.printf("%d的因數為:%s",a,b);


	}

}

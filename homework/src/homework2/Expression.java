package homework2;

public class Expression {

	public static void main(String[] args) {
		System.out.println("第一題");
		/* 1.	迴圏的練習-Expression
		利用for迴圏計算12-22+32-42+…+492-502的值。*/
		int sum=0;
		int x =50;
		for(int i =1;i <=x-1 ;i+=2) 
			sum=(i*i-(i+1)*(i+1))+sum;
			
			System.out.println(sum);
	}
}

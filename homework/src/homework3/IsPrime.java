package homework3;

public class IsPrime {

	public static void main(String[] args) {
		/*3.	��ƪ��m��-IsPrime
�g�@���boolean isPrime (int n)�ΨӧP�_n�O�_����ơC*/
		int x =49;
		boolean y = true;
		
			for(int i=2;i<x;) {
				 
				if(x % i == 0) { 
					y = false ;
					break;}
				else i= i+1;
					
			}	
						
			if(y==true) {
				System.out.printf("%d�O���",x);
			}else System.out.printf("%d���O���",x);
		}

	}



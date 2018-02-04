package homework3;

public class IsPrime {

	public static void main(String[] args) {
		/*3.	ㄧ计絤策-IsPrime
糶ㄧ计boolean isPrime (int n)ノㄓ耞n琌借计*/
		int x =49;
		boolean y = true;
		
			for(int i=2;i<x;) {
				 
				if(x % i == 0) { 
					y = false ;
					break;}
				else i= i+1;
					
			}	
						
			if(y==true) {
				System.out.printf("%d琌借计",x);
			}else System.out.printf("%dぃ琌借计",x);
		}

	}



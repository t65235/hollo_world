package homework3;

public class MersennePrime {
	 static void Mersenne(int x) {
		int i =0;
		for( i=1;Math.pow(2, i)-1<x;i++) {}
		if(Math.pow(2, i)-1==x) { 
			System.out.printf("%d琌Mersenne借计",x);
			Mersenne2(x);}
		else System.out.printf("%dぃ琌Mersenne借计",x);
	
	}
	 static void Mersenne2(int x) {
		int i,c,j,l=0;
		String k ="";
		for( i=1;i>0;i++) {
			c=0;
			for(j=1;j<=(Math.pow(2, i)-1);j++) {
				if((Math.pow(2, i)-1)%j==0)
					c+=1;
				}
			if(c==2) {
				k+= (Math.pow(2, i)-1)+"\t";
				l+=1; 
			}if(l==7)break;
		}
		System.out.printf("玡8Mersenne借计:%s",k);
	}
	
	public static void main(String[] args) {
		/*5.	ㄧ计絤策-MersennePrime
糶ㄧ计boolean mersennePrime (int n)ノㄓ耞n琌Mersenne借计级糶祘Αт玡8Mersenne借计
矗ボ璝借计骸ì2P-1=n (pタ俱计)玥nMersenne Prime
弧讽p=323-1=7珿7Mersenne Prime*/

		int n =3;
		boolean o = true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				o =false ;
			}
		};
		if(o == true) {
			Mersenne(n);
			System.out.println("");
		}else System.out.printf("%dぃ琌Mersenne借计",n);
		}
	}



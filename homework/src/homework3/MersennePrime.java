package homework3;

public class MersennePrime {
	 static void Mersenne(int x) {
		int i =0;
		for( i=1;Math.pow(2, i)-1<x;i++) {}
		if(Math.pow(2, i)-1==x) { 
			System.out.printf("%d�OMersenne���",x);
			Mersenne2(x);}
		else System.out.printf("%d���OMersenne���",x);
	
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
		System.out.printf("�e8��Mersenne���:%s",k);
	}
	
	public static void main(String[] args) {
		/*5.	��ƪ��m��-MersennePrime
�g�@���boolean mersennePrime (int n)�ΨӧP�_n�O�_��Mersenne��ơC���g�@�{����X�e8��Mersenne��ơC
���ܡG�Y��ƺ���2P-1=n (p�������)�A�hn��Mersenne Prime�C
�����G��p=3�ɡA23-1=7�A�G7��Mersenne Prime�C*/

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
		}else System.out.printf("%d���OMersenne���",n);
		}
	}



package homework4;

public class PassArray {
	
	static double a(int[][] x) {
		int c=0;
		double z=0;
		for(int[] n: x)
			for(int m :n)
				{z +=m;
				c += 1;
				}
		 z = z /c;
		return z;
		}
	static int b(int[][] x) {
		int z=x[0][0];
		for(int[] n: x)
			for(int m :n) {
				if(z<m)
					z=m;
			}			
		return z;
	}
	static int c(int[][] x) {
		int z=x[0][0];
		for(int[] n: x)
			for(int m :n) {
				if(z>m)
						z=m;
			}			
		return z;
	}
	static String d(int[][] x) {
		String z="";
		int c =0,d=0;
		for(int i=0;i<x.length;i++) {
			c=0;
			d=0;
			for(int j=0;j<x[i].length;j++) {
				 c += x[i][j];
				 d+=1;
			}
			c=c/d;
			z += c +",";
		
		}	return z;
	}

	public static void main(String[] args) {
		/*4.	ㄧ计籔皚絤策-PassArray
a~d肈ㄧ计ㄓ矪瞶絤策皚把计肚患皚惠﹚竡main()跋办跑计ㄆ盢12计竚3 x 4蝴皚いㄧ计挡狦
a.	璸衡┮Τ计キА
b.	т12计い程
c.	т12计い程
d.	璸衡–舱ず4计キА*/
		int[][] x = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		System.out.println("┮Τ计キА"+a(x));
		System.out.println("12计い程"+b(x));
		System.out.println("12计い程"+c(x));
		System.out.println("–舱ず4计キА"+d(x));
	}
	

}

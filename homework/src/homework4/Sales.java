package homework4;

public class Sales {
	static int an ;	
	static int sum(int[][] args,int x) {
		int sum =0;
		for(int i=0;i < args[x].length;i++) {
			if(i==0) {
				sum += args[x][i]*12;
			}else if(i==1) {
				sum += args[x][i]*16;
			}else if(i==2) {
				sum += args[x][i]*10;
			}else if(i==3) {
				sum += args[x][i]*14;
			}else if(i==4) {
				sum += args[x][i]*15;
			}			
		}
		return sum;
	}
	static int sum2(int[][] args,String a) {
		int sum2 = 0,j=0;
		if(a.indexOf("A")==0|a.indexOf("0")==0)
			j=0;
		else if(a.indexOf("B")==0|a.indexOf("1")==0)
			j=1;
		else if(a.indexOf("C")==0|a.indexOf("2")==0)
			j=2;
		else if(a.indexOf("D")==0|a.indexOf("3")==0)
			j=3;
		else if(a.indexOf("4")==0|a.indexOf("4")==0)
			j=4;
			
			for(int i=0; i<args.length;i++) {
				if(j==0) 
					sum2 += args[i][j]*12;
				else if(j==1) 
					sum2 += args[i][j]*16;
				else if(j==2) 
					sum2 += args[i][j]*10;
				else if(j==3) 
					sum2 += args[i][j]*14;
				else if(j==4) 
					sum2 += args[i][j]*15;
			
		}
		return sum2;
}
	static String compare(String args,int[][] args1) {
		String X="";
		int sum =0, c =0, d=0,e=0;
		if(args.indexOf("�~�Z")==0) {
			for(int i=0;i<args1.length;i++) {
				if(sum<sum(args1,i)) {
					sum = sum(args1,i);
					c=i;
				}
			}
		}
		if(args.indexOf("���~")==0) {
			e=0;
			for(int i=0;i<args1[e].length;i++) {
				String f = i +"";
				if(sum<sum2(args1,f)) {
					sum = sum2(args1,f);
					d=i;
				}
			}
		}
		if(c==0)
			X="�P���1";
		else if(c==1)
			X="�P���2";
		else if(c==2)
			X="�P���3";
		if(d==0)
			X="���~A";
		else if(d==1)
			X="���~B";
		else if(d==2)
			X="���~C";
		else if(d==3)
			X="���~D";
		else if(d==4)
			X="���~E";
		return X;
	}
	public static void main(String[] args) {
		/*2.	�G���}�C���m��-Sales
		�Y�@���q�����ز��~A�BB�BC�BD�PE�A�������O��12�B16�B10�B14�P15���F�ӸӤ��q�@���T��P����A�L�̦b�Y������P��ƶq�p�U�ҥ�

		�P���	���~A	���~B	���~C	���~D	���~E
		1		33		32		56		45		33
		2		77		33		68		45		23
		3		43		55		43		67		65
		�խp��G
		a.	�C�@�ӾP������P���`���B
		b.	�C�@�����~���P���`���B
		c.	���̦n�~�Z�]�P���`���B�̦h�̡^���P���
		d.	�P���`���B�̦h�����~*/
		int[][] x=new int [3][];
		 x [0]=new int[] {33,32,56,45,33};
		 x [1]=new int[] {77,33,68,45,23};
		 x [2]=new int[] {43,55,43,67,65};
		 System.out.println("A�P������P���`���B"+sum(x,0));
		 System.out.println("B�P������P���`���B"+sum(x,1));
		 System.out.println("C�P������P���`���B"+sum(x,2));
		 System.out.println("A���~���P���`���B"+sum2(x,"A"));
		 System.out.println("B���~���P���`���B"+sum2(x,"B"));
		 System.out.println("C���~���P���`���B"+sum2(x,"C"));
		 System.out.println("D���~���P���`���B"+sum2(x,"D"));
		 System.out.println("E���~���P���`���B"+sum2(x,"E"));
		 System.out.println(compare("�~�Z",x)+"�~�Z�P���`���B�̦h");
		 System.out.println(compare("���~",x)+"���~�P���`���B�̦h");
	}

}

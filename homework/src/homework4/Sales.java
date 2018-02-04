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
		if(args.indexOf("業績")==0) {
			for(int i=0;i<args1.length;i++) {
				if(sum<sum(args1,i)) {
					sum = sum(args1,i);
					c=i;
				}
			}
		}
		if(args.indexOf("產品")==0) {
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
			X="銷售員1";
		else if(c==1)
			X="銷售員2";
		else if(c==2)
			X="銷售員3";
		if(d==0)
			X="產品A";
		else if(d==1)
			X="產品B";
		else if(d==2)
			X="產品C";
		else if(d==3)
			X="產品D";
		else if(d==4)
			X="產品E";
		return X;
	}
	public static void main(String[] args) {
		/*2.	二維陣列的練習-Sales
		某一公司有五種產品A、B、C、D與E，其單價分別為12、16、10、14與15元；而該公司共有三位銷售員，他們在某月份的銷售數量如下所示

		銷售員	產品A	產品B	產品C	產品D	產品E
		1		33		32		56		45		33
		2		77		33		68		45		23
		3		43		55		43		67		65
		試計算：
		a.	每一個銷售員的銷售總金額
		b.	每一項產品的銷售總金額
		c.	有最好業績（銷售總金額最多者）的銷售員
		d.	銷售總金額最多的產品*/
		int[][] x=new int [3][];
		 x [0]=new int[] {33,32,56,45,33};
		 x [1]=new int[] {77,33,68,45,23};
		 x [2]=new int[] {43,55,43,67,65};
		 System.out.println("A銷售員的銷售總金額"+sum(x,0));
		 System.out.println("B銷售員的銷售總金額"+sum(x,1));
		 System.out.println("C銷售員的銷售總金額"+sum(x,2));
		 System.out.println("A產品的銷售總金額"+sum2(x,"A"));
		 System.out.println("B產品的銷售總金額"+sum2(x,"B"));
		 System.out.println("C產品的銷售總金額"+sum2(x,"C"));
		 System.out.println("D產品的銷售總金額"+sum2(x,"D"));
		 System.out.println("E產品的銷售總金額"+sum2(x,"E"));
		 System.out.println(compare("業績",x)+"業績銷售總金額最多");
		 System.out.println(compare("產品",x)+"產品銷售總金額最多");
	}

}

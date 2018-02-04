package homework4;

public class Rain {
static void method(String name,int number) {
	 if(name.indexOf("all")==0)
			all();
	else if(name.indexOf("year")==0 && 1 <= number&& number<= 5) {
			hum(name,number);}
	else if(name.indexOf("season")==0 && 1 <= number&& number<= 4)
			hum(name,number);
	else if(name.indexOf("month")==0 && 1 <= number&& number<= 12)
			hum(name,number);
	else System.out.println("輸入錯誤 請從輸入");
}
static int[][][] rain() {
	int[][][] rain = {{{1,2,3},{4,5,6},{7,8,9},{10,11,12}},
			{{1,2,3},{4,5,6},{7,8,9},{10,11,12}},
			{{1,2,3},{4,5,6},{7,8,9},{10,11,12}},
			{{1,2,3},{4,5,6},{7,8,9},{10,11,12}},
			{{1,2,3},{4,5,6},{7,8,9},{10,11,12}}};
	
	return rain;
}
static void all() {
	
	double sum =0;
	for(int[][] n:rain())
		for(int[] m:n)
			for(int o:m)
				sum +=o;
	sum= sum/60 ;
	System.out.println("每月總平均降雨量"+sum+"mm");
}

static void hum(String name,int number) {
	int[][][] raim =rain().clone();
	double sum =0;
	
	if(name.indexOf("year")==0){
		System.out.println("222");
		if(number==1) {
			for(int[] n:raim[0] )
				for(int m :n)
				sum = sum +m;
			System.out.println("每月總平均降雨量"+sum/12+"mm");	
		}else if(number==2) {
				for(int[] n:raim[1] )
					for(int m :n)
						sum = sum +m;
				System.out.println("每月總平均降雨量"+sum/12+"mm");	
		}else if(number==3) {
			for(int[] n:raim[2] )
				for(int m :n)
					sum = sum +m;
			System.out.println("每月總平均降雨量"+sum/12+"mm");	
		}else {
			for(int[] n:raim[3] )
				for(int m :n)
					sum = sum +m;
			System.out.println("每月總平均降雨量"+sum/12+"mm");	
		}
	}else if (name.indexOf("season")==0) {
		for(int i=0;i<raim.length;i++) {
			for(int j=0 ;j<raim[i][number-1].length;j++) {
				if(number==1) 
						sum = sum +raim[i][0][j] ;
				else if(number==2) 
						sum = sum +raim[i][1][j] ;
				else if(number==3) 
						sum = sum +raim[i][2][j] ;
				else if(number==4) 
					    sum = sum +raim[i][3][j] ;
			}}
		System.out.println("每月總平均降雨量"+sum/15+"mm");	
	}else if (name.indexOf("month")==0) {
		for(int i=0;i<raim.length;i++) {
				if(number==1) 
						sum = sum +raim[i][0][0] ;
				else if(number==2) 
						sum = sum +raim[i][0][1] ;
				else if(number==3) 
						sum = sum +raim[i][0][2] ;
				else if(number==4) 
						sum = sum +raim[i][1][0] ;
				else if(number==5) 
						sum = sum +raim[i][1][1] ;
				else if(number==6) 
						sum = sum +raim[i][1][2] ;
				else if(number==7) 
						sum = sum +raim[i][2][0] ;
				else if(number==8) 
						sum = sum +raim[i][2][1] ;
				else if(number==9) 
						sum = sum +raim[i][2][2] ;
				else if(number==10) 
						sum = sum +raim[i][3][0] ;
				else if(number==11) 
						sum = sum +raim[i][3][1] ;
				else if(number==12) 
						sum = sum +raim[i][3][2] ;
				
			}	System.out.println("每月總平均降雨量"+sum/5+"mm");	
	
}else System.out.println("111");
}

	public static void main(String[] args) {
		/*3.	三維陣列的練習-Rain
輸入一字串，字串為”all” 表示計算60個月的總平均降雨量，”year”、”season”和”month”分別表示計算某年、某季或某月的平均降雨量。若為後三者
，再輸入一個正整數表示那一年、那一季或那一月。
說明：5年12個月的降雨量以三維陣列形式事先給好60個浮點數
需做誤錯處理：
a.	輸入除了”all”、”year”、”season”和”month”以外的字串
b.	若輸入”year”，而正整數輸入1至5以外的數字
c.	若輸入”season”，而正整數輸入1至4以外的數字
d.	若輸入”month”，而正整數輸入1至12以外的數字*/
		String name = args[0]; 
		int number = Integer.parseInt(args[1]);
		method(name,number);
		
		}
		

}

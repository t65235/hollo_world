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
	else System.out.println("��J���~ �бq��J");
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
	System.out.println("�C���`�������B�q"+sum+"mm");
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
			System.out.println("�C���`�������B�q"+sum/12+"mm");	
		}else if(number==2) {
				for(int[] n:raim[1] )
					for(int m :n)
						sum = sum +m;
				System.out.println("�C���`�������B�q"+sum/12+"mm");	
		}else if(number==3) {
			for(int[] n:raim[2] )
				for(int m :n)
					sum = sum +m;
			System.out.println("�C���`�������B�q"+sum/12+"mm");	
		}else {
			for(int[] n:raim[3] )
				for(int m :n)
					sum = sum +m;
			System.out.println("�C���`�������B�q"+sum/12+"mm");	
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
		System.out.println("�C���`�������B�q"+sum/15+"mm");	
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
				
			}	System.out.println("�C���`�������B�q"+sum/5+"mm");	
	
}else System.out.println("111");
}

	public static void main(String[] args) {
		/*3.	�T���}�C���m��-Rain
��J�@�r��A�r�ꬰ��all�� ��ܭp��60�Ӥ몺�`�������B�q�A��year���B��season���M��month�����O��ܭp��Y�~�B�Y�u�άY�몺�������B�q�C�Y����T��
�A�A��J�@�ӥ���ƪ�ܨ��@�~�B���@�u�Ψ��@��C
�����G5�~12�Ӥ몺���B�q�H�T���}�C�Φ��ƥ����n60�ӯB�I��
�ݰ��~���B�z�G
a.	��J���F��all���B��year���B��season���M��month���H�~���r��
b.	�Y��J��year���A�ӥ���ƿ�J1��5�H�~���Ʀr
c.	�Y��J��season���A�ӥ���ƿ�J1��4�H�~���Ʀr
d.	�Y��J��month���A�ӥ���ƿ�J1��12�H�~���Ʀr*/
		String name = args[0]; 
		int number = Integer.parseInt(args[1]);
		method(name,number);
		
		}
		

}

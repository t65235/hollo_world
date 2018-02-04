package homework3;

public class Convert {
	public static void toBinary(int x) {
	
		int a = x;
	
		String s= "";
		for(int i=1;i>0;i++) {
		s =  x%2+s;
				
		if(x/2==0|x/2==1) {
			System.out.printf("%d秈%s%s",a,x/2,s);
		break;}
		x= x/2;
		}}
	public static void toHexidecimal(int x) {
		int a = x;
		
		String s= "";
		for(int i=1;i>0;i++) {
			if(x%16==15)
				s = "F"+s;
			else if(x%16==14)
				s = "E"+s;
			else if(x%16==13)
				s = "D"+s;
			else if(x%16==12)
				s = "C"+s;
			else if(x%16==11)
				s = "B"+s;
			else if(x%16==10)
				s = "a"+s;
			else s= x%16+s;
				
		if(x/16==0|x/16==1|x/16==2|x/16==3|x/16==4|x/16==5|x/16==6|x/16==7|x/16==8|x/16==9) {
			System.out.printf("%d16秈%s%s",a,x/16,s);
		break;}
		if(x/16==15) 
			System.out.printf("%d16秈%s%s",a,"F",s);
		else if(x/16==14) 
			System.out.printf("%d16秈%s%s",a,"E",s);
		else if(x/16==13) 
			System.out.printf("%d16秈%s%s",a,"D",s);
		else if(x/16==12) 
			System.out.printf("%d16秈%s%s",a,"C",s);
		else if(x/16==11) 
			System.out.printf("%d16秈%s%s",a,"B",s);
		else if(x/16==10) { 
			System.out.printf("%d16秈%s%s",a,"A",s);
		break;}
		x= x/16 ;} 
		
	}
	public static void main(String[] args) {
		/*8.	ㄧ计絤策-Convert
糶ㄢㄧ计だtoBinary(int n)㎝toHexidecimal(int n)ノㄓ盢n锣传Θ秈㎝せ秈
*/
		int a = 16;
		toBinary(a);
		System.out.println("");
		toHexidecimal(a);
		System.out.println("");
		

	}

}

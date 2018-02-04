package homework3;

public class RConvert {


	public static String toBinary(int x) {
		String s= "" ;
		if(x>=2)		
		s =  toBinary(x/2)+""+x%2;
		if(x==1)
			s =1 +s;
		return s;
		
		}
	public static String toHexidecimal(int x) {
		
		String s= "" ;
		
		if(x%16<10) {
			s =x%16+""+s;
		}else if(x%16==15)
			s ="F" +s;
		else if(x%16==14)
			s ="E" +s;
		else if(x%16==13)
			s ="D" +s;
		else if(x%16==12)
			s ="C" +s;	
		else if(x%16==11)
			s ="B" +s;	
		else if(x%16==10)
			s ="A" +s;	
		if(x/16==1)
			s ="1" +s;	
		
		if(x>16)
			s =toHexidecimal(x/16)+ "" +s;
		return s;
				
	}

	
	
	
	
	public static void main(String[] args) {
		/*9.	患癹ㄧ计絤策-RConvert
盢瓃ㄢㄧ计эΘ患癹ㄧ计*/
		System.out.println(toHexidecimal(26550));
		System.out.println(toBinary(2560));
		
	}

}

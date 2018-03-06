package homework6;

import java.io.*;

public class EmployeemMain11 {
 
	public static void main(String[] args) {
	File file = new File(args[0]);
	
	try {
		BufferedReader in = new BufferedReader(new FileReader(file));
		String str;
		String[] tokens ;
		while((str=in.readLine())!=null) { 
		tokens = null;
		tokens = str.split(",");
		switch(tokens[0]) {
		case "一般職員":員工 b= new 一般職員(tokens) ;
				System.out.println("薪水"+b.當月薪水());break;
		case "二級主管":員工 c= new 二級主管(tokens) ;
				System.out.println("薪水"+c.當月薪水());break;
		case "一級主管":員工 d= new 一級主管(tokens) ;
				System.out.println("薪水"+d.當月薪水());break;
		}}
			in.close();
	}catch(IOException e) {e.printStackTrace();
		
	}}}
abstract class 員工{
	private String 姓名;
	private String 性別;
	private String 到職日;
	private String 電話;
	private String 住址;
	@SuppressWarnings("unused")
	private String[] tokens;
	
	public 員工(String[] tokens) {
		this.tokens=tokens;
		this.姓名=tokens[1];
		this.性別=tokens[2];
		this.到職日=tokens[3];
		this.電話=tokens[4];
		this.住址=tokens[5];
		基本資料();
	}
	public void 基本資料(){
		System.out.printf("%s,%s,%s,%s,%s\n",姓名,性別,到職日,電話,住址);
	} 
	abstract int 當月薪水() ;
	abstract void setHours(int hours);
}


class 一般職員 extends 員工{
	private int 本薪;
	private int hours;
	
	public 一般職員(String[] tokens) {
		super(tokens);
		this.本薪=Integer.parseInt(tokens[6]);
		this.hours= Integer.parseInt(tokens[7]);
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int 當月薪水() {
		if(hours==0) 
		return 本薪;
		else {
			本薪=(int)(本薪/240*1.5*hours+本薪);
		return 本薪 ;
		}
	}
}
class 二級主管 extends 一般職員{
	private int 午餐津貼;
	private int 職務加給;
	public int get職務加給() {
		return 職務加給;
	}
	public void set職務加給(int 職務加給) {
		this.職務加給 = 職務加給;
	}
	
	public 二級主管(String[] tokens) {
		super(tokens);
		this.午餐津貼=Integer.parseInt(tokens[8]);
		this.職務加給= Integer.parseInt(tokens[9]);
	}
	public int 當月薪水() {
		return super.當月薪水()+午餐津貼+職務加給 ;
		}
	}
class 一級主管 extends 二級主管{
	private int 交通津貼;
	
	public 一級主管(String[] tokens) {
		super(tokens);
		this.交通津貼=Integer.parseInt(tokens[10]);
			}
	public int 當月薪水() {
		return super.當月薪水()+交通津貼;
	}
}

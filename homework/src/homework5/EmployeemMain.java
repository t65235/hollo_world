package homework5;

public class EmployeemMain {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	員工 e01 =new 一般職員 ("王大明","男","100-1-1","0912345678","台灣",20000);
	System.out.println("當 月薪水"+e01.當月薪水());
	員工 e02 =new 一般職員 ("王大明","男","100-1-1","0912345678","台灣",20000);
	e02.setHours(6);
	System.out.println("當月薪水"+e02.當月薪水());
	員工 e03 =new 二級主管 ("王大明","男","100-1-1","0912345678","台灣",20000,1800,3000);
	e03.setHours(6);
	System.out.println("當月薪水"+e03.當月薪水());
	員工 e04 =new 二級主管 ("王大明","男","100-1-1","0912345678","台灣",20000,1800,3000);
	System.out.println("當月薪水"+e04.當月薪水());
	員工 e05 =new 一級主管 ("王大明","男","100-1-1","0912345678","台灣",20000,1800,5000,2000);
	System.out.println("當月薪水"+e05.當月薪水());
	員工 e06 =new 一級主管 ("王大明","男","100-1-1","0912345678","台灣",20000,1800,5000,2000);
	e06.setHours(6);
	System.out.println("當月薪水"+e06.當月薪水());
	}


}
abstract class 員工{
	private String 姓名;
	private String 性別;
	private String 到職日;
	private String 電話;
	private String 住址;
	public 員工(String 姓名,String 性別,String 到職日,String 電話,String 住址)	{
	this.姓名=姓名;
	this.性別=性別;
	this.到職日=到職日;
	this.電話=電話;
	this.住址=住址;
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
	public 一般職員(String 姓名,String 性別,String 到職日,String 電話,String 住址,int 本薪) {
		super( 姓名, 性別, 到職日, 電話, 住址);
		this.本薪=本薪;
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
	public 二級主管(String 姓名,String 性別,String 到職日,String 電話,String 住址,int 本薪,int 午餐津貼,int 職務加給) {
		super( 姓名, 性別, 到職日, 電話, 住址,本薪);
		this.午餐津貼=午餐津貼;
		this.職務加給=職務加給;
	}
	public int 當月薪水() {
		return super.當月薪水()+午餐津貼+職務加給 ;
		}
	}
class 一級主管 extends 二級主管{
	private int 交通津貼;
	public 一級主管(String 姓名,String 性別,String 到職日,String 電話,String 住址,int 本薪,int 午餐津貼,int 職務加給,int 交通津貼) {
	super( 姓名, 性別, 到職日, 電話, 住址,本薪,午餐津貼,職務加給);
	this.交通津貼=交通津貼;
	}
	public int 當月薪水() {
		return super.當月薪水()+交通津貼;
	}
}

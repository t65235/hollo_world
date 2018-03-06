package homework6;

import java.io.*;

public class asdasd {
	private String[] args;
	public static void main(String[] args) {
			File file=new File(args[0]); //new 一個file
		try {
			BufferedReader in =new BufferedReader(new FileReader(file));//先將file丟到低階reader 再丟到高皆reader()
			StringBuilder sb=new StringBuilder(300);
			String str;
			while((str=in.readLine())!=null){
				sb.append(str).append("\n");
				//sb.append(str);
			}
			String[] split_string=sb.toString().split(",");
			in.close();
			System.out.print(sb);
		
			int count=0;
			for(int i=0;i<split_string.length;i++) {
				System.out.println("i="+i+" value="+split_string[i]);
				if(split_string[i].equals("boy")||split_string[i].equals("girl")) {
					count=count+1;
				}
			}
			System.out.println("count="+count);
			
			員工1[] ee=new 員工1[count]; 
		
			int count_1=0;
			
			for(int i=0;i<split_string.length;i++) {
				
				if(split_string[i].equals("first")) {
					System.out.println("i="+i+" value="+split_string[i]);
					System.out.println("i+10="+(i+10)+" value="+split_string[i+10]);
					ee[count_1]=new 一級主管1(split_string[i+1],split_string[i+2],split_string[i+3],split_string[i+4],split_string[i+5],Integer.parseInt(split_string[i+6]),Integer.parseInt(split_string[i+7]),Integer.parseInt(split_string[i+8]),Integer.parseInt(split_string[i+9]),Integer.parseInt(split_string[i+10]));
					count_1++;
				}else if(split_string[i].equals("second")) {
					System.out.println("i="+i+" value="+split_string[i]);
					System.out.println("i+10="+(i+9)+" value="+split_string[i+9]);
					ee[count_1]=new 二級主管1(split_string[i+1],split_string[i+2],split_string[i+3],split_string[i+4],split_string[i+5],Integer.parseInt(split_string[i+6]),Integer.parseInt(split_string[i+7]),Integer.parseInt(split_string[i+8]),Integer.parseInt(split_string[i+9]));
					count_1++;
				}else if(split_string[i].equals("normal")){
					System.out.println("i="+i+" value="+split_string[i]);
					System.out.println("i+10="+(i+7)+" value="+split_string[i+7]);
					ee[count_1]=new 一般職員1(split_string[i+1],split_string[i+2],split_string[i+3],split_string[i+4],split_string[i+5],Integer.parseInt(split_string[i+6]),Integer.parseInt(split_string[i+7]));
					count_1++;
				}
				
			}}catch(IOException e1) {e1.printStackTrace();}
		
			
			/*
			ee[0] = new first_manager("Tom","boy","2012/02/5","034799065","Taipei",48000,0,1800,5000,2000);
			ee[1]= new first_manager("Jim","boy","2008/12/7","054334067","Taiwan",60000,10,1800,5000,2000);
			ee[2]=new second_manager("Ann","girl","2005/06/30","024994732","HK",36000,0,1800,3000);
			ee[3]=new second_manager("Amy","girl","2000/04/12","07923911","America",24000,20,1800,3000);
			ee[4]=new EmployeeNormal("David","boy","1980/05/20","081234536","Taipei",18000,0);
			ee[5]=new EmployeeNormal("Tony","boy","2002/08/17","093654342","KK",12000,30);
		
			//System.out.println("salary= "+ ee[2]);
			for(int i=0;i<ee.length;i++) {
				System.out.println("i="+i);
				ee[i].display();
				System.out.println("salary= "+ ee[i].paySalary());
			*/	}}
	

		
		
		
		
		
	abstract class 員工1{
		private String 姓名;
		private String 性別;
		private String 到職日;
		private String 電話;
		private String 住址;
		@SuppressWarnings("unused")
		private String[] tokens;
		public 員工1(String string, String string2, String string3, String string4, String string5) {
			this.姓名=string;
			this.性別=string2;
			this.到職日=string3;
			this.電話=string4;
			this.住址=string5;
		}
		
	
		public void 基本資料(){
			System.out.printf("%s,%s,%s,%s,%s\n",姓名,性別,到職日,電話,住址);
		} 
		abstract int 當月薪水() ;
		abstract void setHours(int hours);
	}


	class 一般職員1 extends 員工1{
		private int 本薪;
		private int hours;
	
		public 一般職員1(String string, String string2, String string3, String string4, String string5, int parseInt,
				int parseInt2) {
			super(string,string2,string3,string4,string5);
			this.本薪=parseInt;
			this.hours= parseInt2;
			
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
	class 二級主管1 extends 一般職員1{
		private int 午餐津貼;
		private int 職務加給;
		public int get職務加給() {
			return 職務加給;
		}
		public void set職務加給(int 職務加給) {
			this.職務加給 = 職務加給;
		}
		
		
		public 二級主管1(String string, String string2, String string3, String string4, String string5, int parseInt,
				int parseInt2, int parseInt3, int parseInt4) {
			
				super(string,string2,string3,string4,string5,parseInt,parseInt2);
				this.午餐津貼=parseInt3;
				this.職務加給=parseInt4 ;
		}
		public int 當月薪水() {
			return super.當月薪水()+午餐津貼+職務加給 ;
			}
		}
	class 一級主管1 extends 二級主管1{
		private int 交通津貼;
		
		
		public 一級主管1(String string, String string2, String string3, String string4, String string5, int parseInt,
				int parseInt2, int parseInt3, int parseInt4, int parseInt5) {

			super(string,string2,string3,string4,string5,parseInt,parseInt2,parseInt3,parseInt4);
			this.交通津貼=parseInt5;
		
		}
		public int 當月薪水() {
			return super.當月薪水()+交通津貼;
		}
	}

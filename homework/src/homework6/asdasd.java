package homework6;

import java.io.*;

public class asdasd {
	private String[] args;
	public static void main(String[] args) {
			File file=new File(args[0]); //new �@��file
		try {
			BufferedReader in =new BufferedReader(new FileReader(file));//���Nfile���C��reader �A��찪��reader()
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
			
			���u1[] ee=new ���u1[count]; 
		
			int count_1=0;
			
			for(int i=0;i<split_string.length;i++) {
				
				if(split_string[i].equals("first")) {
					System.out.println("i="+i+" value="+split_string[i]);
					System.out.println("i+10="+(i+10)+" value="+split_string[i+10]);
					ee[count_1]=new �@�ťD��1(split_string[i+1],split_string[i+2],split_string[i+3],split_string[i+4],split_string[i+5],Integer.parseInt(split_string[i+6]),Integer.parseInt(split_string[i+7]),Integer.parseInt(split_string[i+8]),Integer.parseInt(split_string[i+9]),Integer.parseInt(split_string[i+10]));
					count_1++;
				}else if(split_string[i].equals("second")) {
					System.out.println("i="+i+" value="+split_string[i]);
					System.out.println("i+10="+(i+9)+" value="+split_string[i+9]);
					ee[count_1]=new �G�ťD��1(split_string[i+1],split_string[i+2],split_string[i+3],split_string[i+4],split_string[i+5],Integer.parseInt(split_string[i+6]),Integer.parseInt(split_string[i+7]),Integer.parseInt(split_string[i+8]),Integer.parseInt(split_string[i+9]));
					count_1++;
				}else if(split_string[i].equals("normal")){
					System.out.println("i="+i+" value="+split_string[i]);
					System.out.println("i+10="+(i+7)+" value="+split_string[i+7]);
					ee[count_1]=new �@��¾��1(split_string[i+1],split_string[i+2],split_string[i+3],split_string[i+4],split_string[i+5],Integer.parseInt(split_string[i+6]),Integer.parseInt(split_string[i+7]));
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
	

		
		
		
		
		
	abstract class ���u1{
		private String �m�W;
		private String �ʧO;
		private String ��¾��;
		private String �q��;
		private String ��};
		@SuppressWarnings("unused")
		private String[] tokens;
		public ���u1(String string, String string2, String string3, String string4, String string5) {
			this.�m�W=string;
			this.�ʧO=string2;
			this.��¾��=string3;
			this.�q��=string4;
			this.��}=string5;
		}
		
	
		public void �򥻸��(){
			System.out.printf("%s,%s,%s,%s,%s\n",�m�W,�ʧO,��¾��,�q��,��});
		} 
		abstract int ����~��() ;
		abstract void setHours(int hours);
	}


	class �@��¾��1 extends ���u1{
		private int ���~;
		private int hours;
	
		public �@��¾��1(String string, String string2, String string3, String string4, String string5, int parseInt,
				int parseInt2) {
			super(string,string2,string3,string4,string5);
			this.���~=parseInt;
			this.hours= parseInt2;
			
		}
		public int getHours() {
			return hours;
		}
		public void setHours(int hours) {
			this.hours = hours;
		}
		public int ����~��() {
			if(hours==0) 
			return ���~;
			else {
				���~=(int)(���~/240*1.5*hours+���~);
			return ���~ ;
			}
		}
	}
	class �G�ťD��1 extends �@��¾��1{
		private int ���\�z�K;
		private int ¾�ȥ[��;
		public int get¾�ȥ[��() {
			return ¾�ȥ[��;
		}
		public void set¾�ȥ[��(int ¾�ȥ[��) {
			this.¾�ȥ[�� = ¾�ȥ[��;
		}
		
		
		public �G�ťD��1(String string, String string2, String string3, String string4, String string5, int parseInt,
				int parseInt2, int parseInt3, int parseInt4) {
			
				super(string,string2,string3,string4,string5,parseInt,parseInt2);
				this.���\�z�K=parseInt3;
				this.¾�ȥ[��=parseInt4 ;
		}
		public int ����~��() {
			return super.����~��()+���\�z�K+¾�ȥ[�� ;
			}
		}
	class �@�ťD��1 extends �G�ťD��1{
		private int ��q�z�K;
		
		
		public �@�ťD��1(String string, String string2, String string3, String string4, String string5, int parseInt,
				int parseInt2, int parseInt3, int parseInt4, int parseInt5) {

			super(string,string2,string3,string4,string5,parseInt,parseInt2,parseInt3,parseInt4);
			this.��q�z�K=parseInt5;
		
		}
		public int ����~��() {
			return super.����~��()+��q�z�K;
		}
	}

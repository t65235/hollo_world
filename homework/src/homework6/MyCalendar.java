package homework6;

import java.io.*;
import java.util.*;


public class MyCalendar {
	public static void main(String[] args) {
		String str;
		Scanner scanner=new Scanner(System.in);
		int year = scanner.nextInt();//輸入值，年
		BufferedReader mouth =new BufferedReader(new InputStreamReader(System.in));//輸入值，月
		
		try {
			if(!(str=mouth.readLine()).equals("")) {
			int a = Integer.parseInt(str);
			dataaaaa b =new dataaaaa(year,a);
			b.data();
			}else {
				dataaaaa b =new dataaaaa(year);
				b.abc();
			}
			mouth.close();
			scanner.close();
				
		}catch(IOException e ) {}
	}

static class dataaaaa{
	int year ,mouth;
	
	
	dataaaaa(int year){
		this.year=year;
		}
	dataaaaa(int year,int mouth){
		this.year=year;
		this.mouth=mouth-1;
		
		}
	void data() {
		Calendar today = new GregorianCalendar(year,mouth,1);
		int day = today. getActualMaximum(Calendar.DATE);//取最大日
		int day_of_week=today.get(Calendar.DAY_OF_WEEK);//取星期
		System.out.println(year+"年"+(mouth+1)+"月");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		System.out.println("-------------------------------------------------");
		for(int i =0;i<day_of_week-1 ; i++) {
			System.out.print("\t");
		}
		for(int j=0; j<day;j++ ) {
			if(day_of_week-1 ==7) {
				System.out.println("");
				day_of_week = 1;
				}
		System.out.print((j+1)+"\t" );
		day_of_week += 1;
		}
		System.out.println("");
	}
	void abc(){
		for(int i=0;i<12;i++) {
			data();
			mouth++;
			}
	}
}}
/*輸入一個正整數，列印出那一年的年曆。
輸入兩個整數，第一個數字代表那一年，第二個數字代表那
一月，列印出那一年那一月的月曆。
*/
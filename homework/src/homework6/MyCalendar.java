package homework6;

import java.io.*;
import java.util.*;


public class MyCalendar {
	public static void main(String[] args) {
		String str;
		Scanner scanner=new Scanner(System.in);
		int year = scanner.nextInt();//��J�ȡA�~
		BufferedReader mouth =new BufferedReader(new InputStreamReader(System.in));//��J�ȡA��
		
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
		int day = today. getActualMaximum(Calendar.DATE);//���̤j��
		int day_of_week=today.get(Calendar.DAY_OF_WEEK);//���P��
		System.out.println(year+"�~"+(mouth+1)+"��");
		System.out.println("��\t�@\t�G\t�T\t�|\t��\t��");
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
/*��J�@�ӥ���ơA�C�L�X���@�~���~��C
��J��Ӿ�ơA�Ĥ@�ӼƦr�N���@�~�A�ĤG�ӼƦr�N��
�@��A�C�L�X���@�~���@�몺���C
*/
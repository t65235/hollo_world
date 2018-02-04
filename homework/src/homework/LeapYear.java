package homework;

public class LeapYear {

	public static void main(String[] args) {
		// 4.	選擇性敘述的練習-LeapYear
		//輸入一西元年，如2015。判斷此年份是否為閏年。
		//提示：每四年一閏，每百年不閏，每四百年一閏，每四千年不閏。
		
		int year = 1; // 這裡請輸入西元幾年
		
		
		if (year%4 != 0||year%100==0&&year%400!=0||year%4000==0)
			{System.out.println("他不是一個閏年");
		}else 
			{System.out.println("他是一個閏年");
		}
		
		
	
	
	}}
	
	
	
	//400.4   1000.4000  1.3
    
package homework2;

import java.util.Scanner;

public class Password {
	public static String method() {
		System.out.println("還玩?測試結束了 快案停止鍵");
		return null;
	}
	
	
	public static void main(String[] args) {
		System.out.println("第八題");
		/*8.	迴圏的練習-Password
		出現”請輸入密碼”的提示，使用者有最多三次輸入的機會。
		若輸入正確，則印出”密碼輸入正確，歡迎使用本系統！”。
		若輸入不正確，再次出現”請輸入密碼”的提示。
		若三次輸入不正確，則印出”密碼輸入超過三次！”，並結束程式的執行。*/
		Scanner scanner= new Scanner(System.in);
		
		int turepass =  123456 ;
		int i = 1;
		do {
		System.out.println("請輸入密碼");
		int use = scanner.nextInt();
		if(use == turepass) {
			System.out.println("密碼輸入正確，歡迎使用本系統！");
			method();
			break;
			}else {
				System.out.println("密碼輸入錯誤 請重新輸入！");
				i++;
			}
		}while (i<=3);
		if(i==4) {
		System.out.println("密碼輸入超過三次！你的卡已GG!!");}
		scanner.close();
	}

}

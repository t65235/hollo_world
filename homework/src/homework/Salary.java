package homework;

public class Salary {

	public static void main(String[] args) {
		//3.	選擇性敘述的練習-Salary
		//輸入便利商店工讀生的工作時數，並計算其薪資。
		//60小時以內，時薪120元。
		//61~80小時，以時薪1.25倍計算。
		//81小時以上，以時薪1.5倍計算。
		//說明：薪資以累計方式計算。若工時為90小時，則薪資為60*120 + 20*120*1.25 + 10*120*1.5元。
		double hs1=120;  		//工作時數	60小時(含)以下
		double hs2=hs1*1.25;	//工作時數	61~80小時(含)
		double hs3=hs1*1.5;		//工作時數	81小時以上
		
		double HS=82;     	//工作時間    	 可做更改
		if (HS <= 60) { 
			System.out.printf("您獲得金幣 %,8.0f元", HS*hs1);
		}else if (HS <= 80) { 
			System.out.printf("您獲得金幣 %,8.0f元", (HS-60)*hs2+60*hs1);
		}else {
			System.out.printf("您獲得金幣 %,8.0f元", (HS-80)*hs3+(80-60)*hs2+60*hs1);
		}

	}

}

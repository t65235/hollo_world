package homework;

public class Electricity {

	public static void main(String[] args) {
		// 1.	選擇性敘述的練習-Electricity
		// 輸入何種用電和度數，計算出需繳之電費。
		// 電力公司使用累計方式來計算電費，分工業用電及家庭用電。
		double he1=0.15;  	//家庭用電	240度(含)以下
		double he2=0.25;	//家庭用電	240~540(含)度 
		double he3=0.45;	//家庭用電	540度以上
		double Ie1=0.45;	//工業用電	240度(含)以下
		double Ie2=0.45;	//工業用電	240~540(含)度 
		double Ie3=0.45;	//工業用電	540度以上
		String I="家是我的";
		double HE=653;     	//家庭使用電量 可做更改
		double IE=542;     	//工業使用電量 可做更改
	
     
		if(I.indexOf("家")==0) {if (HE <= 240) { 
				System.out.printf("您需繳自家電費 %,8.0f元", HE*he1);
			}else if (HE <= 540) { 
				System.out.printf("您需繳自家電費 %,8.0f元", (HE-240)*he2+240*he1);
			}else {
			System.out.printf("您需繳自家電費 %,8.0f元", (HE-540)*he3+(540-240)*he2+240*he1);
			}
		}else if(I.indexOf("工")==0) {
		
			if (IE <= 240) { 
				System.out.printf("您需繳工業電費 %,8.0f元", IE*Ie1);
			}else if (IE <= 540) { 
				System.out.printf("您需繳工業電費 %,8.0f元", (IE-240)*Ie2+240*Ie1);
			}else {
				System.out.printf("您需繳工業電費 %,8.0f元", (IE-540)*Ie3+(540-240)*Ie2+240*Ie1);
			}
		}}}

	

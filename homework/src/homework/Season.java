package homework;

public class Season {

	public static void main(String[] args) {
		// 輸入月份1~12月，利用switch判斷相對應的季節春、夏、秋、冬並印出。若不在此範圍則印出”輸入錯誤”。
		int M=0;
		switch(M){ 
			case 3:
			case 4:
			case 5:System.out.println("這是春天想要去踏青嗎?");
					break;
			case 6:
			case 7:
			case 8:System.out.println("這是夏天想要去游泳嗎?");
					break;
			case 9:
			case 10:
			case 11:System.out.println("這是秋天想要去賞楓嗎?");
					break;
			case 1:
			case 2:
			case 12:System.out.println("這是冬天想要去滾被嗎?");
					break;
			default:System.out.println("你國小畢業了嗎?");
			
		
	}}}

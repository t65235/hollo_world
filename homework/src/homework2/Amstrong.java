package homework2;

public class Amstrong {

	public static void main(String[] args) {
		System.out.println("第四題");
		/*4.	迴圏的練習-Amstrong
		Amstrong數是指一個三位數的整數，其各位數之立方和等於該數本身。
		找出所有的Amstrong數。
		說明：153=13+53+33，故153為Amstrong數。*/
		int a,b,c =0;
		String d="";
		for(a=1;a<9;a++) {
			for(b=0;b<9;b++) {
				for(c=0;c<9;c++) {
					if(a*100+b*10+c==Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3)) {
						d = d +" "+ (a*100+b*10+c);
					}
				}
			}
		} System.out.printf("所有的Amstrong數:%s",d);
	/*
	 * for(i=100,i<1000,i++){
	 * if(i==Math.pow(i/100, 3)+Math.pow(i%100/10, 3)+Math.pow(i%100%10, 3)
	 * 		System.out.println(i)
	 * }
	 */
		


	}

}

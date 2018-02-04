package homework;

public class Equation {

	public static void main(String[] args) {
		// 6.	選擇性敘述的練習-Equation
		// 一元二次方程式ax2+bx+c=0。輸入a, b, c三值，並計算方程式的根。
		//		b2-4ac > 0，有兩個不相等的實根。
		//		b2-4ac = 0，有兩個相等的實根。
		//		b2-4ac < 0，則印出”沒有實根”。
		int a =1;
		int b =4;
		int c =1;
		if (b*b-4*a*c < 0) {
			System.out.println("沒有實根");
		}else if (b*b-4*a*c==0) {
			System.out.println("x= "+(-b)/(2*a));
		}else {
			System.out.printf("x= %3.3f ",(-b)+Math.sqrt(b*b-4*a*c)/a);
			System.out.printf(", %3.3f ",(-b)-Math.pow((b*b-4*a*c),0.5)/a);
		}
	}
}
package homework;

public class Equation {

	public static void main(String[] args) {
		// 6.	��ܩʱԭz���m��-Equation
		// �@���G����{��ax2+bx+c=0�C��Ja, b, c�T�ȡA�íp���{�����ڡC
		//		b2-4ac > 0�A����Ӥ��۵�����ڡC
		//		b2-4ac = 0�A����Ӭ۵�����ڡC
		//		b2-4ac < 0�A�h�L�X���S����ڡ��C
		int a =1;
		int b =4;
		int c =1;
		if (b*b-4*a*c < 0) {
			System.out.println("�S�����");
		}else if (b*b-4*a*c==0) {
			System.out.println("x= "+(-b)/(2*a));
		}else {
			System.out.printf("x= %3.3f ",(-b)+Math.sqrt(b*b-4*a*c)/a);
			System.out.printf(", %3.3f ",(-b)-Math.pow((b*b-4*a*c),0.5)/a);
		}
	}
}
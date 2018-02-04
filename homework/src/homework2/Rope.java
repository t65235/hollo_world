package homework2;

public class Rope {

	public static void main(String[] args) {
		System.out.println("第六題");
		/*6.	迴圏的練習-
若有一條繩子長3000公尺，每天剪去一半的長度，需多少天繩子的長度會短於5公尺。*/
	int i =0;
		for(i=1;(3000/Math.pow(2, i))>5;i++) {
			}
		System.out.println(i);

	}

}

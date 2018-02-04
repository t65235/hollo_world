package homework4;

public class MaxMin {

	public static void main(String[] args) {
		/*1.	蝴皚絤策-MaxMin
ㄆ盢10计竚蝴皚いだт10计い程㎝程
*/
		int[] oneDim =new int []{259,576,3840,658,637,273,524,123,332,252};
		int c =oneDim[0];// 程跑计
		int d =oneDim[0];// 程跑计
		for(int i =0;i<oneDim.length ;i++ ) {
			if(c<oneDim[i]) {
				c=oneDim[i];
			}
			if(d>oneDim[i]) {
				d=oneDim[i];
			}
		}System.out.println(c);
		System.out.println(d);
	}

}

package homework4;

public class MaxMin {

	public static void main(String[] args) {
		/*1.	�@���}�C���m��-MaxMin
�ƥ��N10�ӼƦr�m��@���}�C���A���O��X10�ӼƦr���̤j���ȩM�̤p���ȡC
*/
		int[] oneDim =new int []{259,576,3840,658,637,273,524,123,332,252};
		int c =oneDim[0];// �̤j�ܼ�
		int d =oneDim[0];// �̤p�ܼ�
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

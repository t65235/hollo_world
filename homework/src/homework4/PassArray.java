package homework4;

public class PassArray {
	
	static double a(int[][] x) {
		int c=0;
		double z=0;
		for(int[] n: x)
			for(int m :n)
				{z +=m;
				c += 1;
				}
		 z = z /c;
		return z;
		}
	static int b(int[][] x) {
		int z=x[0][0];
		for(int[] n: x)
			for(int m :n) {
				if(z<m)
					z=m;
			}			
		return z;
	}
	static int c(int[][] x) {
		int z=x[0][0];
		for(int[] n: x)
			for(int m :n) {
				if(z>m)
						z=m;
			}			
		return z;
	}
	static String d(int[][] x) {
		String z="";
		int c =0,d=0;
		for(int i=0;i<x.length;i++) {
			c=0;
			d=0;
			for(int j=0;j<x[i].length;j++) {
				 c += x[i][j];
				 d+=1;
			}
			c=c/d;
			z += c +",";
		
		}	return z;
	}

	public static void main(String[] args) {
		/*4.	��ƻP�}�C���m��-PassArray
a~d�U�p�D�ҥH�@��ƨӳB�z�G���m�߰}�C���Ѽƶǻ��A�}�C�ݩw�q��main()���ϰ��ܼơA�ƥ��N12�ӼƦr�m��@3 x 4���G���}�C���A�C�L�U��ƪ����G�C
a.	�p��Ҧ��Ʀr��������
b.	��X12�ӼƦr���̤j����
c.	��X12�ӼƦr���̤p����
d.	�p��C�դ�4�ӼƦr��������*/
		int[][] x = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		System.out.println("�Ҧ��Ʀr��������"+a(x));
		System.out.println("12�ӼƦr���̤j����"+b(x));
		System.out.println("12�ӼƦr���̤p����"+c(x));
		System.out.println("�C�դ�4�ӼƦr��������"+d(x));
	}
	

}

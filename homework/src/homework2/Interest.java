package homework2;

public class Interest {

	public static void main(String[] args) {
		System.out.println("�ĤQ�@�D");
		/*11.	�j��ԭz���m��-Interest
		���르�H10%��Q���100000���A�q�Ӻ�h�H5%�ƧQ���100000���C�p��h�֦~��q�Ӻ⪺���i�H�W�L���르�A�ñN���ɨ�H���ƦL�X�C(27�~��)
		���ܡG��Q�����GP(1+r*n)    �ƧQ�����GP(1+r)n
		P�G�����Ar�G�Q�v�An�G�h�֦~ */
		int i =1;
		double p = 100000; //���르����
		double s = 100000; //�q�Ӻ⪺��
		double r = 0.1 ;  // ��Q �Q�v
		double t = 0.05 ; //�ƧQ�Q�v
		for (i=1;(p*(1+r*i))>(s*Math.pow((1+t),i));i++) {
			
		}
		System.out.printf("%d�~��q�Ӻ⪺���i�H�W�L���르\n ",i);
		System.out.println(p*(1+r*i));
		System.out.printf("%10.2f",s*Math.pow((1+t),i));
		
		
		
		
	}

}

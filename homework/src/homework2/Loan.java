package homework2;

public class Loan {

	public static void method(String[] args) {
		int i,j= 0;
		
		int a = 100000;
		
		for(i=1;i>0;i++) {
			if (a*1.2==i*12)break;
		}System.out.printf("�Ȧ�ƧQ�C�����%d\n",i);
		System.out.printf("�Ȧ��`�@�ݭn��%d\n",i*12);
		for(i=1;i>0;i++) {     // ((a*b-c)*b-c)= a *b *b - c* b1 - c *b0    b=1.1 c= �n�٪�
			double k = 0;
			for(j=0;j<12;j++) {
				k = k + Math.pow(1.1, j);
			
			}
			if ((a*Math.pow(1.1, 12))-i*k<=i*12)break;
		};
			System.out.printf("��Q�ƧQ�C�����%d\n",i-1);
			System.out.printf("��Q�`�@�ݭn��%d\n",i*12);
		for(i=1;i>0;i++) {    
			double k = 0;
			double b = Math.pow(1.01,30);
			for(j=0;j<12;j++) {       // b=(1.01)30 c =�n�٪�
				k = k + Math.pow(b, j);
			
			}
			if ((a*Math.pow(b, 12))-i*k<=i*12)break;
		};
			System.out.printf("�a�U�����ƧQ�C�����%d\n",i-1);
			System.out.printf("�a�U�����`�@�ݭn��%d\n",i*12);
		double s =0;
		for(i=0;i<12;i++) {
			System.out.printf("�Ȧ��%d�~�ݭn��%.0f\n",i+1,a/12+(a-a/12 *i)*0.2/12);
			s = s+ a/12+(a-a/12 *i)*0.2/12 ;
		}	
			System.out.printf("�Ȧ��`�@�ݭn��%.0f\n",s);
			s =0;
		for(i=0;i<12;i++) {
			System.out.printf("��Q��%d�~�ݭn��%.0f\n",i+1,a/12+(a-a/12 *i)*0.1);	
			s = s+ a/12+(a-a/12 *i)*0.1;
		}	System.out.printf("��Q�`�@�ݭn��%.0f\n",s);
		s =0;
		for(i=0;i<12;i++) {
			System.out.printf("�a�U������%d�~�ݭn��%.0f\n",i+1,a/12+(a-a/12 *i)*0.3);	
			s = s+ a/12+(a-a/12 *i)*0.3;
		}	System.out.printf("�a�U�����`�@�ݭn��%.0f\n",s);
	}
	
	public static void main(String[] args) {
		System.out.println("�ĤQ�G�D");
		/* 12.	�j��ԭz���m��-Loan
		������H100000�����O�V�Ȧ�B��Q�M�a�U�����ɶU�C�Y�Ȧ檺�~�Q�v��20%�A
		��Q��Q�v��10%�M�a�U������Q�v��1%�C�H�묰���A�p��@�Ӥ��ܤ@�~��C�Ӥ���k�٦h�ֿ��C*/
		int a=100000;
		for(int i=1;i<=12;i++) {
			System.out.printf("�Ȧ�u��%d�Ӥ����%.0f��\n",i,a*(1+0.2/12*i));
			System.out.printf("��Q�u��%d�Ӥ����%.0f��\n",i,a*(1+0.1*i));
			System.out.printf("�a�U�����u��%d�Ӥ����%.0f��\n",i,a*(1+0.01*30*i));
			
		}
		
		
		
		
		

}}

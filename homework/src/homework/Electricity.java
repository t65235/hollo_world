package homework;

public class Electricity {

	public static void main(String[] args) {
		// 1.	��ܩʱԭz���m��-Electricity
		// ��J��إιq�M�׼ơA�p��X��ú���q�O�C
		// �q�O���q�ϥβ֭p�覡�ӭp��q�O�A���u�~�ιq�ήa�x�ιq�C
		double he1=0.15;  	//�a�x�ιq	240��(�t)�H�U
		double he2=0.25;	//�a�x�ιq	240~540(�t)�� 
		double he3=0.45;	//�a�x�ιq	540�ץH�W
		double Ie1=0.45;	//�u�~�ιq	240��(�t)�H�U
		double Ie2=0.45;	//�u�~�ιq	240~540(�t)�� 
		double Ie3=0.45;	//�u�~�ιq	540�ץH�W
		String I="�a�O�ڪ�";
		double HE=653;     	//�a�x�ϥιq�q �i�����
		double IE=542;     	//�u�~�ϥιq�q �i�����
	
     
		if(I.indexOf("�a")==0) {if (HE <= 240) { 
				System.out.printf("�z��ú�ۮa�q�O %,8.0f��", HE*he1);
			}else if (HE <= 540) { 
				System.out.printf("�z��ú�ۮa�q�O %,8.0f��", (HE-240)*he2+240*he1);
			}else {
			System.out.printf("�z��ú�ۮa�q�O %,8.0f��", (HE-540)*he3+(540-240)*he2+240*he1);
			}
		}else if(I.indexOf("�u")==0) {
		
			if (IE <= 240) { 
				System.out.printf("�z��ú�u�~�q�O %,8.0f��", IE*Ie1);
			}else if (IE <= 540) { 
				System.out.printf("�z��ú�u�~�q�O %,8.0f��", (IE-240)*Ie2+240*Ie1);
			}else {
				System.out.printf("�z��ú�u�~�q�O %,8.0f��", (IE-540)*Ie3+(540-240)*Ie2+240*Ie1);
			}
		}}}

	

package homework;

public class Salary {

	public static void main(String[] args) {
		//3.	��ܩʱԭz���m��-Salary
		//��J�K�Q�ө��uŪ�ͪ��u�@�ɼơA�íp����~��C
		//60�p�ɥH���A���~120���C
		//61~80�p�ɡA�H���~1.25���p��C
		//81�p�ɥH�W�A�H���~1.5���p��C
		//�����G�~��H�֭p�覡�p��C�Y�u�ɬ�90�p�ɡA�h�~�ꬰ60*120 + 20*120*1.25 + 10*120*1.5���C
		double hs1=120;  		//�u�@�ɼ�	60�p��(�t)�H�U
		double hs2=hs1*1.25;	//�u�@�ɼ�	61~80�p��(�t)
		double hs3=hs1*1.5;		//�u�@�ɼ�	81�p�ɥH�W
		
		double HS=82;     	//�u�@�ɶ�    	 �i�����
		if (HS <= 60) { 
			System.out.printf("�z��o���� %,8.0f��", HS*hs1);
		}else if (HS <= 80) { 
			System.out.printf("�z��o���� %,8.0f��", (HS-60)*hs2+60*hs1);
		}else {
			System.out.printf("�z��o���� %,8.0f��", (HS-80)*hs3+(80-60)*hs2+60*hs1);
		}

	}

}

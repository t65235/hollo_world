package homework;

public class Refund {

	public static void main(String[] args) {
		// 5.	��ܩʱԭz���m��-Refund
		//��J�b�Y�ө��ʪ����I���B�P��I���B�C
		//��I���B�p�����I���B�A�h�L�X�����B�������C
		//��I���B�������I���B�A�h�L�X������������C
		//��I���B�j�����I���B�A�h��X��^���B�̤֪��r���ƩM�����ơC
		//���]���ȥu��1000, 500, 100���ȶr�M50, 10, 5, 1���w���C
		//�����G�Y�R�F132�����ӫ~�A�I1000���A����^�@�i500���A�T�i100���A�@��50���w���A�@��10���w���A�@��5���w���M�T��1���w���C
		int INF=132 ; // ���I���B
		int SF=1000; // ��I���B
		if (INF>SF) {System.out.println("���B����");
		}else if (INF==SF) {System.out.println("�������");
		}else {
			System.out.printf("���� %d�i500��  %d�i100�� %d�T50��  %d�T10��  %d�T5��  %d�T1��",(SF-INF)/500,((SF-INF)%500)/100
					, (((SF-INF)%500)%100)/50,((((SF-INF)%500)%100)%50)/10,(((((SF-INF)%500)%100)%50)%10)/5
					,(((((SF-INF)%500)%100)%50)%10)%5 );
		}}}

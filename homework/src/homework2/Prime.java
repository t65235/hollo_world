package homework2;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		System.out.println("�Ĥ��D");
		/* 5.	�j�骺�m��-Prime
		��J�@����ơA��X�Ҧ��p��ε��󪺽�ơC*/
Scanner scanner= new Scanner(System.in);
System.out.print("�п�J�@�����");
int x = scanner.nextInt();
scanner.close();
String c = "2	" ;
int j =0;
for(int i =2; i<=x;i++) {
	for( j= 2; j<x ;j++ ) {
		if(i%j==0)
		break;
		if(i == j + 1 ) {
			c+=i+"\t" ;
		} // if
	} //j

} System.out.println(c); //i 

	}

}

/* int c =0;
for(int i =1; i<=x;i++) {
	for(int j= 1; j<=x ;j++ ) {
		if(i%j==0)
		c = c+1
		} // if
	} //j
if(c==2){
system.out.println(i);
c=0;
	}eles c=0; 	


} System.out.println(c); //i 
 
 * */

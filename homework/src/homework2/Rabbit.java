package homework2;

public class Rabbit {

	public static void main(String[] args) {
		System.out.println("第七題");
		/*7.	迴圏的練習-Rabbit
		老王養了一群兔子，若三隻三隻一數，剩餘一隻；若五隻五隻一數，剩餘三隻；若七隻七隻一數，剩餘二隻。試問兔子最少有幾隻。*/

for(int i=1;i>0;i++) {
	if(i%3==1&&i%5==3&&i%7==2) {
		System.out.println(i);
		if(i>0)break;
	}
}
int i=0;
for( i=1;(i%3==1&&i%5==3&&i%7==2)==false ;i++) {
		}
   System.out.print(i);
	}

}

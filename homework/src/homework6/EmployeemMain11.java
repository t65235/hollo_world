package homework6;

import java.io.*;

public class EmployeemMain11 {
 
	public static void main(String[] args) {
	File file = new File(args[0]);
	
	try {
		BufferedReader in = new BufferedReader(new FileReader(file));
		String str;
		String[] tokens ;
		while((str=in.readLine())!=null) { 
		tokens = null;
		tokens = str.split(",");
		switch(tokens[0]) {
		case "�@��¾��":���u b= new �@��¾��(tokens) ;
				System.out.println("�~��"+b.����~��());break;
		case "�G�ťD��":���u c= new �G�ťD��(tokens) ;
				System.out.println("�~��"+c.����~��());break;
		case "�@�ťD��":���u d= new �@�ťD��(tokens) ;
				System.out.println("�~��"+d.����~��());break;
		}}
			in.close();
	}catch(IOException e) {e.printStackTrace();
		
	}}}
abstract class ���u{
	private String �m�W;
	private String �ʧO;
	private String ��¾��;
	private String �q��;
	private String ��};
	@SuppressWarnings("unused")
	private String[] tokens;
	
	public ���u(String[] tokens) {
		this.tokens=tokens;
		this.�m�W=tokens[1];
		this.�ʧO=tokens[2];
		this.��¾��=tokens[3];
		this.�q��=tokens[4];
		this.��}=tokens[5];
		�򥻸��();
	}
	public void �򥻸��(){
		System.out.printf("%s,%s,%s,%s,%s\n",�m�W,�ʧO,��¾��,�q��,��});
	} 
	abstract int ����~��() ;
	abstract void setHours(int hours);
}


class �@��¾�� extends ���u{
	private int ���~;
	private int hours;
	
	public �@��¾��(String[] tokens) {
		super(tokens);
		this.���~=Integer.parseInt(tokens[6]);
		this.hours= Integer.parseInt(tokens[7]);
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int ����~��() {
		if(hours==0) 
		return ���~;
		else {
			���~=(int)(���~/240*1.5*hours+���~);
		return ���~ ;
		}
	}
}
class �G�ťD�� extends �@��¾��{
	private int ���\�z�K;
	private int ¾�ȥ[��;
	public int get¾�ȥ[��() {
		return ¾�ȥ[��;
	}
	public void set¾�ȥ[��(int ¾�ȥ[��) {
		this.¾�ȥ[�� = ¾�ȥ[��;
	}
	
	public �G�ťD��(String[] tokens) {
		super(tokens);
		this.���\�z�K=Integer.parseInt(tokens[8]);
		this.¾�ȥ[��= Integer.parseInt(tokens[9]);
	}
	public int ����~��() {
		return super.����~��()+���\�z�K+¾�ȥ[�� ;
		}
	}
class �@�ťD�� extends �G�ťD��{
	private int ��q�z�K;
	
	public �@�ťD��(String[] tokens) {
		super(tokens);
		this.��q�z�K=Integer.parseInt(tokens[10]);
			}
	public int ����~��() {
		return super.����~��()+��q�z�K;
	}
}

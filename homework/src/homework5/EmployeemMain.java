package homework5;

public class EmployeemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	�@��¾�� e01 =new �@��¾�� ("���j��","�k","100-1-1","0912345678","�x�W",20000);
	System.out.println("����~��"+e01.����~��());
	�@��¾�� e02 =new �@��¾�� ("���j��","�k","100-1-1","0912345678","�x�W",20000);
	e02.setHours(6);
	System.out.println("����~��"+e02.����~��());
	�@��¾�� e03 =new �G�ťD�� ("���j��","�k","100-1-1","0912345678","�x�W",20000,1800,3000);
	e03.setHours(6);
	System.out.println("����~��"+e03.����~��());
	�@��¾�� e04 =new �G�ťD�� ("���j��","�k","100-1-1","0912345678","�x�W",20000,1800,3000);
	System.out.println("����~��"+e04.����~��());
	�@��¾�� e05 =new �@�ťD�� ("���j��","�k","100-1-1","0912345678","�x�W",20000,1800,5000,2000);
	System.out.println("����~��"+e05.����~��());
	�@��¾�� e06 =new �@�ťD�� ("���j��","�k","100-1-1","0912345678","�x�W",20000,1800,5000,2000);
	e06.setHours(6);
	System.out.println("����~��"+e06.����~��());
	}

}

abstract class ���u{
	private String �m�W;
	private String �ʧO;
	private String ��¾��;
	private String �q��;
	private String ��};
	public ���u(String �m�W,String �ʧO,String ��¾��,String �q��,String ��})	{
	this.�m�W=�m�W;
	this.�ʧO=�ʧO;
	this.��¾��=��¾��;
	this.�q��=�q��;
	this.��}=��};
	�򥻸��();
}
	public void �򥻸��(){
		System.out.printf("%s,%s,%s,%s,%s\n",�m�W,�ʧO,��¾��,�q��,��});
	} 
}


class �@��¾�� extends ���u{
	private int ���~;
	private int hours;
	public �@��¾��(String �m�W,String �ʧO,String ��¾��,String �q��,String ��},int ���~) {
		super( �m�W, �ʧO, ��¾��, �q��, ��});
		this.���~=���~;
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
	public �G�ťD��(String �m�W,String �ʧO,String ��¾��,String �q��,String ��},int ���~,int ���\�z�K,int ¾�ȥ[��) {
		super( �m�W, �ʧO, ��¾��, �q��, ��},���~);
		this.���\�z�K=���\�z�K;
		this.¾�ȥ[��=¾�ȥ[��;
	}
	public int ����~��() {
		return super.����~��()+���\�z�K+¾�ȥ[�� ;
		}
	}
class �@�ťD�� extends �G�ťD��{
	private int ��q�z�K;
	public �@�ťD��(String �m�W,String �ʧO,String ��¾��,String �q��,String ��},int ���~,int ���\�z�K,int ¾�ȥ[��,int ��q�z�K) {
	super( �m�W, �ʧO, ��¾��, �q��, ��},���~,���\�z�K,¾�ȥ[��);
	this.��q�z�K=��q�z�K;
	}
	public int ����~��() {
		return super.����~��()+��q�z�K;
	}
}

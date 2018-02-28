package homework5;

public class Stack {
	private int[] nember;
	private int no ;
	
	public void push(int a)throws StackFullException {
		if(no >= nember.length ) 
			throw new StackFullException();
		nember[no]=a;
		no++;
	}
	public void pop() throws StackEmptyException {
		if(no == 0 ) 
			throw new StackEmptyException();
		System.out.println(nember[no-1]);
		no--;
	}
		
	public static void main(String[] args)  {
		Stack a = new Stack();
		try{a.nember= new int[5];
		a.push(10);
		a.push(20);
		a.push(30);
		a.push(40);
		a.push(50);
		System.out.println(a.nember[4]);
		// a.push(60);
		a.pop();
		a.pop();
		a.pop();
		a.pop();
		a.pop();
		a.pop();
		System.out.println(a.no);
		}catch (StackEmptyException e ) {
			System.out.println("已經空了");
		}catch (StackFullException e ) {
			System.out.println("已經滿了");
		}
		
					
	}

}

 class  StackEmptyException extends Exception{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	StackEmptyException(){
		System.out.println("小米");
	} 
	
 }
 class StackFullException extends Exception{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	StackFullException(){
		System.out.println("好帥");
	}
	
 }
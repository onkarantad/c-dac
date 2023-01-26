package data_structure.ds2_LinkListUsingStack;

public class Tester {

	public static void main(String[] args) {
		LlistStack llstack=new LlistStack();
		llstack.push(10);
		llstack.push(20);
		llstack.push(30);
		llstack.push(40);
		llstack.Display();
		System.out.println("Top element pickup1 :- "+llstack.peek());
		llstack.pop();
		llstack.pop();
		llstack.Display();
		
		System.out.println("Top element pickup2 :-"+llstack.peek());
		
	}

}

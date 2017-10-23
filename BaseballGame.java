import java.util.Stack;

public class BaseballGame {
	
	public static int calPoints(String[] ops) {
		
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < ops.length; i++) {
			System.out.println("----------------------------------------------");
			if("C".equals(ops[i])) {
				int x = stack.pop();
				
			} else if("D".equals(ops[i])) {
				int x = stack.pop();
				stack.push(x);
				stack.push(2*x);
				
			} else if("+".equals(ops[i])) {
				int x = stack.pop();
				int y = stack.pop();
				stack.push(y);
				stack.push(x);
				stack.push(x+y);
				
			} else {
				int x = Integer.parseInt(ops[i]);
				
				stack.push(x);
			}
			//System.out.println("Round : "+(i+1)+" -> "+stack.size()+" ---> "+sumStack(stack));
		}
		
    return sumStack(stack);    
    }
	
	public static int sumStack(Stack<Integer> s) {
		int x = 0;
		while(!s.isEmpty()) {
			int y = s.pop();
			//System.out.println("Previous Sum : "+x);
			x = x + y;
			//System.out.println("Sum : "+x);
		}
		return x;
	}
	
	public static void printStack(Stack<Integer> s) {
		while(!s.isEmpty()) {
			System.out.print(s.pop()+"->");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"5","-2","4","C","D","9","+","+"};
		calPoints(str);

	}

}

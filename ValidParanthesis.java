import java.util.*;

public class ValidParanthesis {
	
//	public static boolean isValid(String s) {
//        Stack<Character> stack = new Stack<Character>();
//        
//        for(int i=0;i<s.length();i++) {
//            if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(') {
//                stack.push(s.charAt(i));
//            } else {
//                if(stack.isEmpty()) {
//                    return false;
//                }
//                if((stack.peek()=='{' && s.charAt(i)=='}') || (stack.peek()=='[' && s.charAt(i)==']') || (stack.peek()=='(' && s.charAt(i)==')')) {
//                    stack.pop();
//                } else {
//                	return false;
//                }
//            }
//        }
//        return stack.isEmpty();
//    }
	
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='(') {
				stack.push(')');
			} else if(s.charAt(i)=='[') {
				stack.push(']');
			} else if(s.charAt(i)=='{') {
				stack.push('}');
			} else if(stack.isEmpty() || s.charAt(i)!=stack.pop()) {
				return false;
			}
		}
		return stack.isEmpty();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("([)]"));
	}

}

import java.io.PrintWriter;


/*
 * evaluates the converted postfix expression
 * and produces the evaluated answer
 */

public class EvalPostfix {
	
	/*
	 * This method evaluates the postfix notation and gives the final answer
	 */
	
	public static int Evaluate(String post){
		ObjectStack postfix =new ObjectStack();
		
		for (int i = 0; i < post.length(); i++) {
			char ch = post.charAt(i);
			if (ch >= '0' && ch <= '9') {
				int number = ch - '0';
				postfix.push(number);
			} else if ((ch == '*' || ch == '/' || ch == '+' || ch == '-' || ch == '^')) {
				int top2 = (Integer) postfix.pop();
				int top1 = (Integer) postfix.pop();
				char operator = ch;
				if (operator == '+')
					postfix.push(top1 + top2);
				else if (operator == '-')
					postfix.push(top1 - top2);
				else if (operator == '*')
					postfix.push(top1 * top2);
				else if (operator == '/')
					postfix.push(top1 / top2);
				else if (operator == '^')
					postfix.push((int) Math.pow(top1, top2));
			}
		}
		return (Integer) postfix.pop();
	
}

	
	

}

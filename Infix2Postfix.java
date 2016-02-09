
/*
 * converts infix expression to postfix expression
 */

public class Infix2Postfix {
	
	/*
	 * This method prioritizes the operations
	 * Making it easier to convert from infix to postfix
	 */
	
	public static int priority (char op){
		switch (op){
			case '^': return 3;
			case '*': 
			case '/': return 2;
			case '+': 
			case '-': return 1;
			default:  return 0;
		}
	}
	
	/*
	 * This method converts the given string from infix to postfix notation
	 */
	
	public static String itf(String buf){
		ObjectStack infix=new ObjectStack();
	    String s="";
	    for(int i=0;i<buf.length();i++){
	       char cha=buf.charAt(i);
	       if((cha>='0' && cha<='9') || cha == ' ')
	          s+=cha;
	       else if(cha == '*' || cha == '/' || cha =='+' || cha == '-' || cha == '^'){
	    	   while(!infix.isEmpty() && (priority((Character) infix.top()) >= priority(cha))){
	       			if((Character) infix.top() == '(')
	       				infix.push(cha);
	       			else
	       				s+=(Character)infix.pop();
	    	   }
	    	   infix.push(cha);
	    	   }
	       else if(cha=='('){
	          infix.push(cha);}
	       else if(cha==')'){
	    	   while((((Character) infix.top()))!='(')
	               s+=(Character)infix.pop();
	    	   	infix.pop();
	           }
	    }
	       while(!infix.isEmpty()){
	    	   s += ((Character) infix.pop());
	       }
	    	s = s.substring(3);
	       return s;
	}
	
	}
	

import java.io.*;
import java.util.Scanner;

/**
 * 
 * @author Kate McNally
 * ID: 011047098
 * Project Title: Stack Lab
 * Description: Program converts expressions from infix to postfix and evaluates them 
 * Date: July 4, 2015
 * Begin the project through the driver class
 * Instructions: Run the program and watch the work being done
 *
 */

public class Driver {

	public static void main(String[] args) throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter("csis.txt"));
		Scanner fileScan = new Scanner(new File("infix.txt"));
		String buf;
		while(fileScan.hasNext()){
			buf = fileScan.nextLine();
			System.out.println(buf);
			pw.println(buf);
			System.out.println("The Postfix Notation is: ");
			pw.println("The Postfix Notation is: ");
			System.out.println(Infix2Postfix.itf(buf));
			pw.println(Infix2Postfix.itf(buf));
			System.out.println("The answer is: ");
			pw.println("The answer is: ");
			System.out.println(EvalPostfix.Evaluate(Infix2Postfix.itf(buf)));
			pw.println(EvalPostfix.Evaluate(Infix2Postfix.itf(buf)));
		}
		

		pw.close();
	}

}

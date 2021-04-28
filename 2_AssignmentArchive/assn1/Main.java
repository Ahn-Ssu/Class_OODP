package assn1;

import java.util.Scanner;

public class Main {

	private static int calTime=0;

	public static void main(String[] args) {
		Operator addop = new AddOperator("Addition");
		Operator subop = new SubOperator("Substraction");
		Operator mulop = new MulOperator("Multiplication");
		Operator divop = new DivOperator("Division");
		
		addop.setNext(subop).setNext(mulop).setNext(divop);
		
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("=====================");
			System.out.println("Calculation: " +(++calTime));
			System.out.print("Enter Opration Name:");
			String op = sc.next();
			System.out.print("Enter the First Operand: ");
			int n1 = sc.nextInt();
			System.out.print("Enter the Second Operand: ");
			int n2 = sc.nextInt();
			
			addop.support(new Problem(op,n1,n2));
			
		}
			
	}

}

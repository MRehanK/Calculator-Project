import java.util.*;

public class Calculator {
	
	static Scanner keyboard = new Scanner(System.in);
	static String operation = "";
	static String mode = "";
	static double result = 0.0;
	static double number1 = 0.0;
	static double number2 = 0.0;
	static String startOver;
	static Standard stan = new Standard();
	static Scientific scien = new Scientific();

	public static void main(String[] args) {
		
		do {
		System.out.println("Enter the calculator mode: Standard/Scientific?");
		mode = keyboard.next();
		
			if(mode.equals("Standard")) {
				System.out.println("Enter '+' for Addition, '-' for Subtration, '*' for multipication, '/' for division");
				operation = keyboard.next();
				if(operation.equals("+")) {
					Calculator.add();
				}
				else if(operation.equals("-")) {
					Calculator.sub();
				}
				else if(operation.equals("*")) {
					Calculator.mul();
				}
				else if(operation.equals("/")) {
					Calculator.div();
				}
				
				
			}
			else if (mode.equals("Scientific")) {
				System.out.println("Enter '+' for Addition, '-' for Subtration, '*' for multipication, '/' for division,'sin' for sine,'cos' for cosine,'tan' for tangent");
				operation = keyboard.next();
				if(operation.equals("+")) {
					Calculator.add();
				}
				else if(operation.equals("-")) {
					Calculator.sub();
				}
				else if(operation.equals("*")) {
					Calculator.mul();
				}
				else if(operation.equals("/")) {
					Calculator.div();
				}
				else if(operation.equals("sin")) {
					Calculator.sin();
				}
				else if(operation.equals("cos")) {
					Calculator.cos();
				}
				else if(operation.equals("tan")) {
					Calculator.tan();
				}
			}
			
			if (startOver.equals("Y")) {
				System.out.println("");
			}
			else if (startOver.equals("N")) {
				System.out.println("Thank You!!!");
				break;
			}
			
		}while(mode.equals("Standard") || mode.equalsIgnoreCase("Scientific"));
		
	}
	
	public static void add() {
			System.out.println("Please enter the two numbers you want to add.");
			number1 = keyboard.nextDouble();	
			number2 = keyboard.nextDouble();
			System.out.println("Result: " + stan.addition(number1, number2));
			System.out.println("Would you like to start agian: Y or N?");
			startOver = keyboard.next();
	}
	
	public static void sub() {
		
			System.out.println("Please enter the two numbers you want to add.");
			number1 = keyboard.nextDouble();	
			number2 = keyboard.nextDouble();
			System.out.println("Result: " + stan.addition(number1, number2));
			System.out.println("Would you like to start agian: Y or N?");
			startOver = keyboard.next();
			
		
	}
	
	public static void mul() {	
			System.out.println("Please enter the two numbers you want to add.");
			number1 = keyboard.nextDouble();	
			number2 = keyboard.nextDouble();
			System.out.println("Result: " + stan.addition(number1, number2));
			System.out.println("Would you like to start agian: Y or N?");
			startOver = keyboard.next();
	}
	
	public static void div() {
			System.out.println("Please enter the two numbers you want to add.");
			number1 = keyboard.nextDouble();	
			number2 = keyboard.nextDouble();
			System.out.println("Result: " + stan.addition(number1, number2));
			System.out.println("Would you like to start agian: Y or N?");
			startOver = keyboard.next();
	}
	
	public static void sin() {
		System.out.println("Please enter the number you would like to find the sin of.");
		number1 = keyboard.nextDouble();
		System.out.println("Result: " + scien.sin(number1));
		System.out.println("Would you like to start agian: Y or N?");
		startOver = keyboard.next();
	}
	
	public static void cos() {
		System.out.println("Please enter the number you would like to find the cos of.");
		number1 = keyboard.nextDouble();
		System.out.println("Result: " + scien.cos(number1));
		System.out.println("Would you like to start agian: Y or N?");
		startOver = keyboard.next();
	}
	
	public static void tan() {
		System.out.println("Please enter the number you would like to find the tan of.");
		number1 = keyboard.nextDouble();
		System.out.println("Result: " + scien.tan(number1));
		System.out.println("Would you like to start agian: Y or N?");
		startOver = keyboard.next();
	}

}

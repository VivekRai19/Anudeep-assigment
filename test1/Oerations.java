package test1;

import java.util.Scanner;

public class Oerations {

	public static void main(String[] args) {
		Oerations();

	}
	 private static void Oerations() {
		    char operator;
		    Double num1, num2, result;

		    // an object of Scanner class for taking input from user.
		    Scanner input = new Scanner(System.in);

		    // input from user to enter operator.
		    System.out.println("Choose an oprator: +, -, *, or /");
		    operator = input.next().charAt(0);

		    // input from user to enter numbers.
		    System.out.println("Enter first number");
		    num1 = input.nextDouble();

		    System.out.println("Enter second number");
		    num2 = input.nextDouble();

		    switch (operator) {

		      // performs addition between numbers
		      case '+':
		        result = num1 + num2;
		        System.out.println("Sum of Numbers=" + num1 + " + " + num2 + " = " + result);
		        break;

		      // performs subtraction between numbers
		      case '-':
		        result = num1 - num2;
		        System.out.println( "Substraction of Numbers=" + num1 + " - " + num2 + " = " + result);
		        break;

		      // performs multiplication between numbers
		      case '*':
		        result = num1 * num2;
		        System.out.println("Multiplication of Numbers=" + num1 + " * " + num2 + " = " + result);
		        break;

		      // performs division between numbers
		      case '/':
		        result = num1 / num2;
		        System.out.println("Division of Numbers=" + num1 + " / " + num2 + " = " + result);
		        break;

		      default:
		        System.out.println("Invalid operator! inserted");
		        System.out.println("use Operators::+,-,*,/");
		        break;
		    }

  }
}
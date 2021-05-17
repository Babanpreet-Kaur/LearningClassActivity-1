package calculator;

import java.util.Scanner;

public class maincalculator {


	public static void main(String[] args) {
		
		System.out.println("Basic Calculator");
		System.out.println("-------------------------------");
		char op;
	    float n1, n2, result;
	    Scanner value = new Scanner(System.in);

	    System.out.println("Choose an operator: +, -, *, /, e");
	    op = value.next().charAt(0);

	  
	    System.out.println("Enter first number");
	    n1 = value.nextFloat();

	    System.out.println("Enter second number");
	    n2 = value.nextFloat();
		Scanner commandLineArgs = new Scanner(System.in);
		Calculations c = new Calculations(commandLineArgs);
		
		switch (op) {

	      case '+':
	        System.out.println("Result: " + c.add(n1, n2));
	        break;

	      case '-':
	    	  System.out.println("Result: " + c.subtract(n1, n2));
	        break;

	    
	      case '*':
	    	  System.out.println("Result: " + c.multiply(n1, n2));
	        break;

	      case '/':
	    	  System.out.println("Result: " + c.divide(n1, n2));
	        break;
	        
	      case 'e':
	    	  System.out.println(c.exponentiate(n1, n2));
	    	  break;

	      default:
	        System.out.println("No Symbol Found!");
	        break;
	    }
		  
	   
	}

	public static boolean addnum(float a, float b) {
		float sum = a + b;
		if(sum < 0)
			return false;
		return true;
	}
	public static boolean subnum(float a, float b) {
		float sum;
		if (a>=b) {
		 sum = a - b;
		}else {
		  sum = b - a;
		}
		if (sum < 0)
			return false;
		return true;
	}
	public static boolean mulnum(float a, float b) {
		float sum = a * b;
		return true;
	}
	public static boolean divnum(float a, float b) {
		float sum = a/b;
		
		return true;
	}
	public static boolean expnum(float a, float b) {
		float sol = 1;
		for(int i=1; i<=b; i++) {
			sol= sol * a;
			
		}
		
		if (sol < 0) 
			return false;
		return true;
	}
	
	

}
class Calculations{
	Scanner input;
	float result;
	
	public Calculations(Scanner inp1) {
		this.input = inp1; 
	}
	
	
	public static float add(float input1, float input2) {
		return input1 + input2;
	}
	
	public float subtract(float input1, float input2) {
		return input1 - input2;
	}
	
	public float multiply(float input1, float input2) {
		return input1 - input2;
	}
	
	public float divide(float input1, float input2) {
		return input1 - input2;
	}
	
	public float exponentiate(float input1, float input2) {
		result = 1;
		for(int i=1; i<=input2; i++) {
			result= result * input1;
			
		}
		
		
		return result;
	}
	

}

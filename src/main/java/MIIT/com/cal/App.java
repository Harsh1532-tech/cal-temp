package MIIT.com.cal;

import java.util.Scanner;

/**
 * Hello world!
 *
 */



public class App 
{
	 public static void main( String[] args )
	    {	
		 
		 	
		 Scanner scanner = new Scanner(System.in);
	        int  userInput;
	        boolean Continue=true;
	        // Do-while loop to repeatedly prompt the user
	        do {
	            System.out.print("Select Your option ");
	            System.out.print("Select 1 for Calculation and Select 2 for Exit");
	            userInput = scanner.nextInt();
	            
	            System.out.println("User input: "+ userInput);
	            switch(userInput) {
	            case 1:
	            	System.out.println("Enter two number ");
	            	float a,b,ans;
	            	int selection;
	            	a=scanner.nextFloat();
	            	b=scanner.nextFloat();
	            	
	            	System.out.println("Enter one form following options");
	            	System.out.println("Select 1 for Addition");
	            	System.out.println("Select 2 for Substraction");
	            	System.out.println("Select 3 for Multiplication");
	            	System.out.println("Select 4 for Division");
	            	selection=scanner.nextInt();
	            	System.out.println("You Selected" + selection);
	            	System.out.println("a:"+ a);
	            	System.out.println("b:"+b);
	            	switch(selection) {
	            	case 1:
	            		ans=Calculator.add(a,b );
	            		System.out.println("Result is:" + ans);
	            		break;
	            	case 2:
	            		ans=Calculator.sub(a,b );
	            		System.out.println("Result is:" + ans);
	            		break;
	            	case 3:
	            		ans=Calculator.mul(a,b );
	            		System.out.println("Result is:" + ans);
	            		break;
	            	case 4:
	            		ans=Calculator.div(a,b );
	            		System.out.println("Result is:" + ans);
	            		break;
	            	}
	            	break;
            	case 2:
            		Continue=false; 
            		break;
	            }
	            	
	            

	        } while (Continue); // Loop condition always true to keep looping until "exit" is entered
	        
	        scanner.close(); // Close the scanner to release resources
	    } 
    
}


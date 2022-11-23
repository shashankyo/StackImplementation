package implementationofstack;

import java.util.Scanner;

public class stackApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the stack size");
	int n = scan.nextInt();
	stack stack = new stack(n);
	while(true)
	{
		System.out.println("Press 1 --------> PUSH");
		System.out.println("Press 2 --------> POP");
		System.out.println("Press 3 --------> DISPLAY");
		System.out.println("Press Any other value   --------> STOP");
		System.out.println("Enter your choice");
		int choice = scan.nextInt();
		switch(choice)
		{
		case 1:
			stack.push();
			break;
			
		case 2 :
			stack.pop();
			break;
		case 3:
			stack.display();
			break;
		default : System.exit(0);
		}
		
	}

}
}

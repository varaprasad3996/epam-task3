/* 
 * This class is used for presentation purpose...
 * We can modify this if we want upgrade the user interaction with application...
 * 
 */
import java.util.Scanner;
public class Output {
	
	public static void presentation(){
		System.out.println("--------Calculator---------");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit");
		
		
		Calculator c=new Calculator();
		while(true)
		{
			System.out.println("Enter your choice (1-5)");
			try {
				Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			float num1=0,num2=0;
			switch(choice)
			{
			case 1: 
				System.out.println("Enter num 1: ");
				num1=sc.nextFloat();
				System.out.println("Enter num 2: ");
				num2=sc.nextFloat();
				System.out.println(num1+" + "+num2+" = "+c.add(num1, num2));
				break;
			case 2: 
				System.out.println("Enter num 1: ");
				num1=sc.nextFloat();
				System.out.println("Enter num 2: ");
				num2=sc.nextFloat();
				System.out.println(num1+" - "+num2+" = "+c.subtract(num1, num2));
				break;
			case 3: 
				System.out.println("Enter num 1: ");
				num1=sc.nextFloat();
				System.out.println("Enter num 2: ");
				num2=sc.nextFloat();
				System.out.println(num1+" x "+num2+" = "+c.multiply(num1, num2));
				break;
			case 4: 
				System.out.println("Enter num 1: ");
				num1=sc.nextFloat();
				System.out.println("Enter num 2: ");
				num2=sc.nextFloat();
				if((int)num2==0)
					System.out.println("Can't divisible by 0");
				else
				System.out.println(num1+" / "+num2+" = "+c.divide(num1, num2));
				break;
			case 5: sc.close();
					System.exit(0);
					break;
			default:
				System.out.println("Please enter a valid input...");
				break;
			
			}
			}
			catch(Exception e)
			{
				System.out.println("Please enter a valid input..");
			}
			
			
			}
			
			
		}
	}


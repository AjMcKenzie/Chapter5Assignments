package switches;

import java.util.Scanner;

/**
 * @author AM312792
 *Feb 13th 2017
 */
public class switchStatementAge 
{

	public static void main(String[] args) 
	{
		int user;
		Scanner input = new Scanner(System.in);
	
		System.out.print("How old are you? >>>>>> ");
		user = input.nextInt();
		switch(user)
		{
		case 18:
			System.out.println("Your 18");
			break;
			
		case 19:
		case 20:
		case 21:
			System.out.println("Your between 19 and 21");
			break;
			
		case 22:
		case 23:
		case 24:
		case 25:
		case 26:
		case 27:
		case 28:
		case 29:
		case 30:
			System.out.println("Your between 22 and 30");
			break;
			
		case 31:
		case 32:
		case 33:
		case 34:
		case 35:
		case 36:
		case 37:
		case 38:
		case 39:
		case 40:
			System.out.println("Your between 31 and 40");
			break;
			
		default:
			System.out.println("Sorry that age isn't here. Go away you are wasting my time!");
				
		}

	}

}

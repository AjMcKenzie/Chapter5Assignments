package switches;

import java.util.Scanner;

/**
 * @author AM312792
 *Feb 13th 2017
 */
public class switchesDayofWeek 
{

	public static void main(String[] args) 
	{
		String day;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a day during the week for schedule? >>>>> ");
		day = input.nextLine();
		switch(day)
		{
		case "Monday":
		case "monday":
			System.out.print("Reserve room for Friday meeting");
			break;
			
		case "Tuesday":
		case "tuesday":
			System.out.print("Meeting with Principal your fired.");
			break;
			
		case "Wednesday":
		case "wednesday":
			System.out.print("Look for jobs on internet.");
			break;
			
		case "Thursday":
		case "thursday":
			System.out.print("Go to an interveiw for a job.");
			break;
			
		case "Friday":
		case "friday":
			System.out.print("Buy new stuff for new job.");
			break;
			
		case "Saturday":
		case "saturday":
			System.out.print("Relax and get ready for your new job.");
			break;
			
		case "Sunday":
		case "sunday":
			System.out.print("Get to bed early for new job");
			break;
			
			default:
				System.out.print("That day does not exist to the known realm.");
		}

	}

}

package youDoIt;

import java.util.Scanner;

/**
 * @author AM312792
 *
 */
public class MythicalCountry 
{

	public static void main(String[] args) 
	{
		double rate;
		double hoursWorked;
		double regularPay;
		double overtimePay;
		final int FULL_WEEK = 40;
		final double OT_RATE = 2;
		final double GovermentGetHalf = .5;
		double afterTax;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many hours did you work this week? ");
		hoursWorked = keyboard.nextDouble();
		System.out.print("What is your regular pay rate? ");
		rate = keyboard.nextDouble();
		
		if(hoursWorked > FULL_WEEK)
		{
			regularPay = FULL_WEEK * rate;
			overtimePay = (hoursWorked - FULL_WEEK) * OT_RATE * rate;
			afterTax = regularPay * GovermentGetHalf;
		}
		else
		{
			regularPay = hoursWorked * rate;
			overtimePay = 0.0;
			afterTax = regularPay * GovermentGetHalf;
		}
		System.out.println("Regular pay is " + regularPay + "\nOvertime pay is " + overtimePay + ". After tax is " + afterTax);
		

	}

}

package randomGuessMatch;

import javax.swing.JOptionPane;

/**
 * @author am312792
 *
 */
public class RandomGuess2
{

	public static void main(String[] args) 
	{
		final int LOW = 0;
		final int HIGH = 9;
		String msg;
		int result;
		int resultTwo;
		int resultThree;
		int userGuess;
		int userGuess2;
		int userGuess3;
		
		result = LOW + (int)(Math.random() * HIGH);
		resultTwo = LOW + (int)(Math.random() * HIGH);
		resultThree = LOW + (int)(Math.random() * HIGH);
		
		userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a number between " + LOW + " and " + HIGH));
		userGuess2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a number between " + LOW + " and " + HIGH));
		userGuess3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose  number between " + LOW + " and " + HIGH));
		
		if(userGuess == result && userGuess2 == resultTwo && userGuess3 == resultThree)
		{
			msg ="\n You win a million dollars!!";
		}
		if(userGuess == result && userGuess2 != resultTwo && userGuess3 != resultThree)//first number
		{
			msg = "\n You got the first guess right.";
		}
		if(userGuess != result && userGuess2 == resultTwo && userGuess3 != resultThree)//second number
		{
			msg = "\n You got the second guess right.";
		}
		if(userGuess != result && userGuess2 != resultTwo && userGuess3 == resultThree)//third number
		{
			msg = "\n You got the third guess right.";
		}
		else
			msg = "\n Your a loser, get out!!";
		
		JOptionPane.showMessageDialog(null, "The numbers are " + result + ", " + resultTwo + ", and " + resultThree + msg);
		
		
	}

}

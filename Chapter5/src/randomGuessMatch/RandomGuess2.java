package randomGuessMatch;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 * @author am312792
 *
 */
public class RandomGuess2
{

	public static void main(String[] args) 
	{
		Random r = new Random();
		final int LOW = 0;
		final int HIGH = 9;
		String msg;
		int result = r.nextInt(10) + LOW;
		int resultTwo = r.nextInt(10) + LOW;;
		int resultThree = r.nextInt(10) + LOW;;
		int userGuess;
		int userGuess2;
		int userGuess3;
		
		userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a number between " + LOW + " and " + HIGH));
		userGuess2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a number between " + LOW + " and " + HIGH));
		userGuess3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose  number between " + LOW + " and " + HIGH));
		
		if(userGuess == result && userGuess2 == resultTwo && userGuess3 == resultThree)//All numbers
		{
			msg ="\n You win a million dollars!!";
		}
		if(userGuess == result && userGuess2 != resultTwo && userGuess3 != resultThree)//First number
		{
			msg = "\n You got the first guess right.";
		}
		if(userGuess != result && userGuess2 == resultTwo && userGuess3 != resultThree)//Second number
		{
			msg = "\n You got the second guess right.";
		}
		if(userGuess != result && userGuess2 != resultTwo && userGuess3 == resultThree)//Third number
		{
			msg = "\n You got the third guess right.";
		}
		else
			msg = "\n Your a loser, get out!!";
		
		JOptionPane.showMessageDialog(null, "The numbers are " + result + ", " + resultTwo + ", and " + resultThree + msg);
		
		
	}

}

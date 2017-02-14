package randomGuessMatch;

import javax.swing.JOptionPane;

/**
 * @author am312792
 *
 */
public class Random 
{

	public static void main(String[] args) 
	{
		final int LOW = 100;
		final int HIGH = 1000;
		String msg;
		int result;
		int userGuess;
		
		result = LOW + (int)(Math.random() * HIGH);
		
		userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess my number between " + LOW + " and " + HIGH));
		
		if(userGuess == result)
			msg = "\n Your Guess was right";
			else
				if(userGuess < result)
					msg = "\n Your Guess was to low";
				else
					msg = "\n Your Guess was too high";
		JOptionPane.showMessageDialog(null, "The number is " + result + msg);
		
	}

}

package randomGuessMatch;

import java.util.Random; 
import javax.swing.JOptionPane;
/**
 * @author AM312792
 *
 */
public class RandomGuessMatch 
{

	public static void main(String[] args) 
	{
		Random r = new Random();
		final int lOW = 100;
		final int HIGH = 1000;
		String msg;
		int result = r.nextInt(10) + LOW;
		int userGuess;
		
		userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess my number between " + LOW + " and " + HIGH ));
		
		if(userGuess == result)
			msg = "\n Your Guess was Right!";
			else 
				if(userGuess < result)
					msg = "\n Your Guess was to low";
				else 
					msg = "\n Your Guess was to high";
		JOptionPane.showMessageDialog(null, "the numbers is " + result + msg);
		
	}

}
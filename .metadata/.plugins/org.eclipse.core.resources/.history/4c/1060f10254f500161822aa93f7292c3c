package gameZone;


import javax.swing.JOptionPane;

/**
 * @author am312792
 *
 */
public class RockPaperScissors 
{

	public static void main(String[] args) 
	{
		int user;
		int computer;
		String msg = null;
		String userPick;
		String computerPick;
		final int LOW = 1;
		final int HIGH = 3;
		computer = LOW + (int)(Math.random() * HIGH);
		
		// 1 = Rock, 2 = Paper, 3 = Scissors
		
		for(; ;){
			user = Integer.parseInt(JOptionPane.showInputDialog(null, "Type the NUMBER that you want \n1 for Rock \n2 for Paper \n3 for Scissors"));
		
		if(user == 1)
			userPick = "Rock";
		else
			if(user == 2)
				userPick = "Paper";
			else
				userPick = "Scissors";
		if(computer == 1)
			computerPick = "Rock";
		else
			if(computer == 2)
				computerPick = "Paper";
			else
				computerPick = "Scissors";
		if(user == 1)
			if(computer == 1)
				msg = "Tie";
			else
				if(computer == 2)
					msg = "Computer Wins";
				else
					msg = "You win";
		else
			if(user == 2)
				if(computer == 2)
					msg = "Tie";
				else
					if(computer == 3)
						msg = "Computer Wins";
					else
						msg = "You win";
			else
				if(user == 3)
					if(computer == 3)
						msg = "Tie";
					else
						if(computer == 1)
							msg = "Computer Wins";
						else
							msg = "You win";
				
		JOptionPane.showMessageDialog(null, msg);
	
		
		}
	}

}

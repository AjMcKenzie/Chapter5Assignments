package switches;

import javax.swing.JOptionPane;

/**
 * @author AM312792
 *Feb 13th 2017
 */
public class studentScannerSwitch 
{

	public static void main(String[] args) 
	{
		int studentNumber;
		
		String studentString;
		
		for ( ; ; ) {
			
		
		studentString = (String)JOptionPane.showInputDialog(null, "Please scan the student ID or book number >>>> ", "Enter User ID or book #",
				JOptionPane.QUESTION_MESSAGE, null,null,"");
		studentNumber = Integer.parseInt(studentString);
		
		if(studentNumber >= 100000 || studentNumber <= 4000000)
		{
			switch(studentNumber)
			{
			case 274896:
				JOptionPane.showMessageDialog(null, "Andrew McKenzie Java Book.");
				break;
				
			case 274885:
				JOptionPane.showMessageDialog(null, "Charles Carlstrom Java Book.");
				break;
			
			case 316282:
				JOptionPane.showMessageDialog(null, "Ress Alzahrani Java Book.");
				break;
				
			case 274884:
				JOptionPane.showMessageDialog(null, "Tatyana Vaughn Java Book.");
				break;
				
			case 133778:
				JOptionPane.showMessageDialog(null, "Nick Hasson Java Book.");
				break;
				
			case 131457:
				JOptionPane.showMessageDialog(null, "Kassie Remley Java Book.");
				break;
				
			case 137412:
				JOptionPane.showMessageDialog(null, "Sebastian Frick Java Book.");
				break;
				
			case 131147:
				JOptionPane.showMessageDialog(null, "Zach Dorris Java Book.");
				break;
				
			case 274887:
				JOptionPane.showMessageDialog(null, "Cahse Kress Java Book.");
				break;
				
			case 133225:
				JOptionPane.showMessageDialog(null, "Isaiah Ponciano Java Book.");
				break;
				
			case 137428:
				JOptionPane.showMessageDialog(null, "Mason Hancock Java Book.");
				break;
				
			case 99722:
				JOptionPane.showMessageDialog(null, "Andrew Mckenzie's computer found in room 161 in Mr. Brosius room.");
				break;
				
			case 99650:
				JOptionPane.showMessageDialog(null, "Andrew Mckenzie's monitor 2 found in room 161 in Mr. Brosius room.");
				break;
				
			case 100521:
				JOptionPane.showMessageDialog(null, "Andrew Mckenzie's monitor 1 found in room 161 in Mr. Brosius room.");
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "That set numbers does not exist.");
			}
		}
		}
		

	}

}

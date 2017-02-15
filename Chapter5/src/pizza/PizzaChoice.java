package pizza;

import java.util.Scanner;

/**
 * @author AM312792
 *
 */
public class PizzaChoice 
{

	public static void main(String[] args) 
	{
		String choiceYes; //user is selecting that they have made a choice
		String size;
		String pizzaKind = null;
		double smallCost = 5.00;
		double mediumCost = 7.00;
		double largeCost = 10.00;
		
		
		
		Scanner input = new Scanner(System.in);
		
		//Yes? or No?
		
		System.out.print("Would you like a pizza? Yes or No >>>> ");
		choiceYes = input.nextLine();
		
		// Choice / Size?
		
		if("Yes".equals(choiceYes) || "yes".equals(choiceYes) || "Y".equals(choiceYes) || "y".equals(choiceYes))
		{
			System.out.print("You said " + choiceYes + " to have a pizza. \n");
			System.out.print("Please choose a size, Small, Medium, or Large? >>>> ");
			size = input.nextLine(); 
			
			//Size / Kind?
			
			if("small".equals(size) || "medium".equals(size) || "large".equals(size) || "Small".equals(size) || "Medium".equals(size) || "Large".equals(size)
					|| "s".equals(size) || "m".equals(size) || "l".equals(size) || "S".equals(size) || "M".equals(size) || "L".equals(size))
			{
				System.out.print("You said " + size + " pizza size. \n");
				System.out.print("What kind of pizza do you want? Pepperoni, Sausage, and or Cheese? >>>> ");
				pizzaKind = input.nextLine();
				
				//Kind / Order?
				
				if("Pepperoni".equals(pizzaKind) || "Sausage".equals(pizzaKind) || "Cheese".equals(pizzaKind) || "pepperoni".equals(pizzaKind) || "sausage".equals(pizzaKind) || "cheese".equals(pizzaKind)
						|| "P".equals(pizzaKind) || "S".equals(pizzaKind) || "C".equals(pizzaKind) || "p".equals(pizzaKind) || "s".equals(pizzaKind) || "c".equals(pizzaKind))
				{
					System.out.print("You said " + pizzaKind + " that sounds delicious. \n");
					System.out.print("Your order consists of a " + size + " pizza with the toppings of " + pizzaKind + ". ");
					
					//Cost
					
					if("small".equals(size) || "Small".equals(size) || "s".equals(size) || "S".equals(size))
					{
						System.out.println("The cost of your pizza is $" + smallCost + "0");
					}
					
					if("medium".equals(size) || "m".equals(size) || "Medium".equals(size) || "M".equals(size))
					{
						System.out.println("The cost of your pizza is $" + mediumCost + "0");
					}
					
					if("large".equals(size) || "l".equals(size) || "Large".equals(size) || "L".equals(size))
					{
						System.out.println("The cost of your pizza is $" + largeCost + "0");
					}
					
				}
				
			}
		}
		if("No".equals(choiceYes) || "no".equals(choiceYes) || "N".equals(choiceYes)|| "n".equals(choiceYes))
		{
			System.out.print("You said " + choiceYes + " to haveing a pizza. \n");
			System.out.print("I am tring to run a business and you are wasting my time! Get out!!");
			
		}
	}

}

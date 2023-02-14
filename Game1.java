package Game1;
import java.util.Scanner;
public class Game1 {
                               //Mohammadalhammad-444000697-173//

	public static void main(String[] args) {
		
			Scanner Mo = new Scanner(System.in);
			
			System.out.print("1. play \n2. exit game \nselect(1 or 2): ");
			int choice =  Mo.nextInt(); 
			
			while(choice == 1) {
				
				int max = 10, min = 1, counter = 1, guess;
				int range = (max - min) +1;
				int num = (int)(Math.random() * range) + min;
			
				do {
					
					System.out.print("Enter guess(1-10):");
					guess =  Mo.nextInt(); 
					
					if(guess > num)
						System.out.println("too high");
					else if(guess < num)
						System.out.println("too low");
					else {
						System.out.println("corect");
						break;
					}
					
					counter++;
				}
				while(counter <= 3);
				
				if(guess != num)
					System.out.println("Game over!");
				System.out.println();
					
				
				System.out.print("1. play \n2. exit game \nselect: ");
				choice =  Mo.nextInt(); 
				
			
			                                                               // Thank you for using MohammadAlhammads‘ program :)   
			}
			}
		}


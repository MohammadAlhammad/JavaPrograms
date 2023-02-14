package TheUnknownMethod;
import java.util.Scanner;
public class TheUnknownMethod {
	
	 //MohammadNassirAlhammad-444000697-173//

	     public static void main(String args[]) { 
		                   
		   int max = 100, min = 1;
		   int range = (max - min) + 1;

	      Scanner input = new Scanner (System.in);

	      System.out.println("Do you want to know what the method does?");
	      System.out.println("yes/no");

	      String answer=input.next();
	      answer=answer.toLowerCase();        

	      while ( answer.equals("yes") ){

	        System.out.print("This line prints the result of calling the method-->");

	        System.out.println((int)(Math.random()*range) + min );

	        System.out.println("Do you STILL want to know what the method does?");
	        System.out.println("yes/no");

	        answer=input.next();
	        answer=answer.toLowerCase();

	      }

	      System.out.println("Go to this URL: https://www.educative.io/answers/how-to-use-the-mathrandom-method-in-java ");
	      System.out.println("It will help you learn what the method does thank you by Mohammad");
 
		  







 	    		}
	}

package guessgame;

import java.util.Scanner;
import java.util.Arrays;

 public class guessgame {

	    public static void main(String[] args) {
	        
	        Scanner Mo = new Scanner(System.in);
	        int[] numbers = {13, 7, 23, 2, 29, 3, 5, 71, 11, 41, 17, 19, 53, 73, 31, 97,43, 47, 59, 61, 79, 67, 89, 89};
	        Arrays.sort(numbers);
	        System.out.print("\n"+Arrays.toString(numbers)+"\n");
	       
	        System.out.print("enter the fist number: ");
	        int guess1 = Mo.nextInt();
	       
	        System.out.print("enter the second number: ");
	        int guess2 = Mo.nextInt();
	        
	        System.out.println(guess1 + "found in index: " + Arrays.binarySearch(numbers, guess1));
	        System.out.println(guess2 + "found in index: " + Arrays.binarySearch(numbers, guess2));
	    
		
		                                                       // Thank you for using MohammadAlhammads‘ program :) 
		}
	}

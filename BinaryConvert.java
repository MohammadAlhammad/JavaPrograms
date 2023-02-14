package BinaryConvert;
import java.util.Scanner;

public class BinaryConvert {                        


    public static void main(String[] args) {
        Scanner Mo = new Scanner(System.in);
        System.out.println("please enter four bits:");
        String binaryBits = Mo.next();
        while (binaryBits.length() != 4){
            System.out.println("Incorrect, please enter four bits: ");
            binaryBits = input.next();
        }
        int decimal = 0;

        for(int i=binaryBits.length()-1;i>=0;i--){
            if(binaryBits.charAt(binaryBits.length() - i - 1) == '1'){
               decimal += Math.pow(2,i) ;
            }
        }
        System.out.println(decimal);


	}

}                                                            // Thank you for using MohammadAlhammads‘ program :)//

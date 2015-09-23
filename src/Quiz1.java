
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johns6971
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int num = 1;
        System.out.println("Enter 0 to quit");
        while(num != 0) 
        {
            System.out.print("Enter a number to classify: ");
            
            num = input.nextInt();
            
            //exits if number is 0
            if(num == 0) 
            {
                System.exit(0);
            }
            
            
            int[] array = new int[num]; 
            
            int divisor = num;
            
            //filling the array with
            for(int i = 0; i < array.length; i++) 
            {
                if(divisor == 1) 
                {
                    //adds num because num/1 = num
                    //exits loop if the divisor is 1
                    array[i] = num;
                    break;
                }
                //if the remainder is 0 
                if(num % divisor == 0) 
                {
                    //adds quotient to the array
                    array[i] = num / divisor;
                }
                divisor --;
            }
            
            int sum = 0;
            
            for(int i = 0; i < array.length; i ++) 
            {
                //Finding the sum
                sum += array[i];
            }
            
            if(sum == num * 2) 
            {
                System.out.println(num + " is a perfect number");
                
            }
            if(sum < num * 2) 
            {
                System.out.println(num + " is a deficient  number");
                
            }
            if(sum > num * 2) 
            {
                System.out.println(num + " is an abundant number");
            }
        }
        
        
        
        
        
        
        
        
    }
}

import java.util.Scanner; //the import for scanner class

public class ChapterFour2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------------");
	System.out.println("//Chapter 4 Lab Assignment Part 2//");
        
        char again = 'y'; //loops code 
        while(again == 'y') {
              
	System.out.println("------------------------------------------");
            
	System.out.println("[Input]");
    	System.out.println(" ");
        
        boolean positive = true;
        int sumTotal = 0;
		
        while(positive) //while boolean is true ..do..
        {
		
			 System.out.println("Enter a number: "); 
            int nextNumber = scanner.nextInt();
			
            if (nextNumber < 0) //if number less than 0
                positive = false; // boolean set to false
            
            else //if number not less than 0
                sumTotal = sumTotal + nextNumber; //display sum
        }
		
        System.out.println("------------------------------------------");
 	System.out.println("[Output]");
        System.out.println(" ");
        
        System.out.println("The sum of the positive entered numbers is = " + sumTotal);      
           
	System.out.println(" ");
	System.out.println("Would you like to try again? y/n");
        
            again = scanner.next().charAt(0); //scans for input to restart code
    }
}
}

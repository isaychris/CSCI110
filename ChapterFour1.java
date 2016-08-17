import java.util.Scanner; //the import for scanner class

class ChapterFour1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("------------------------------------------");
	System.out.println("//Chapter 4 Lab Assignment Part 1//");
        
        char again = 'y'; //loops code 
        while(again == 'y') {
              
	System.out.println("------------------------------------------");
            
	System.out.println("[Input]");
    	System.out.println(" ");
		
        System.out.println("Enter the value of \"n\":");
        int inputN = scanner.nextInt(); //scans for n
        
        System.out.println("------------------------------------------");
 	System.out.println("[Output]");
        System.out.println(" ");
        
        int oddSum = 0; //start number
		
        for (int startN = 0; startN < inputN; startN++) //loop until input is bigger than;           
        {
        oddSum = oddSum + (startN*2) + 1; //total
        }     
        
        System.out.println("The odd sum of \"n\" " + "(" + inputN + ") " + "is = " + oddSum);
         
	System.out.println(" ");
	System.out.println("Would you like to try again? y/n");
            again = scanner.next().charAt(0); //scans for input to restart code
        }
    }
}




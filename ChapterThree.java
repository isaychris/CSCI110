//Program ChapterThree.java
//The purpose of this program is to display the the average grade and grade letter of a student by entering three test scores.
//Created by Chris Banci
//Compiled on June 30, 2014

import java.util.Scanner; //import for scanner class

class ChapterThree {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        		
	System.out.println("------------------------------------------");
	System.out.println("//Chapter 3 Lab Assignment//");
	System.out.println("//Final Grade Calculator//");
        
        char again = 'y'; //loops code 
        while(again == 'y') {
        
	System.out.println("------------------------------------------");
	System.out.println("[Input]");
    	System.out.println(" ");
			
        System.out.println("Enter first test: ");
        int firstInput = scanner.nextInt(); //scans input for first test
        
        System.out.println(" ");

        System.out.println("Enter second test: ");
        int secondInput = scanner.nextInt(); //scans input for second test

	System.out.println(" ");
	
        System.out.println("Enter third test: ");
        int thirdInput = scanner.nextInt(); //scans input for third test
           
        int n1, n2, n3, totalTest, averageN; //variables as integers
            n1 = firstInput; 
            n2 = secondInput;
            n3 = thirdInput; 
            totalTest = 3;
            averageN = ((n1 + n2 + n3) / (totalTest)); 
    
        char grade; //if statements for grade letters
            if (averageN >= 90) {
                grade = 'A';
            } else if (averageN >= 80) {
                grade = 'B';
            } else if (averageN >= 70) {
                grade = 'C';
            } else if (averageN >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }       
        
	System.out.println("------------------------------------------");
 	System.out.println("[Output]");
        System.out.println(" ");

	System.out.println("Average = " + averageN + "%"); //displays average

        System.out.println("Grade = " + grade); //displays grade

	System.out.println(" ");
	System.out.println("Would you like to try again? y/n");
            again = scanner.next().charAt(0); //scans for input to restart code
        }
    }
}


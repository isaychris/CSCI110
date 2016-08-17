import java.util.Scanner; //import for scanner

public class ChapterSeven {
    public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in); //scanner instance

    System.out.println("------------------------------------------");
    System.out.println("//Chapter 7 Lab Assignment//");
    System.out.println("//Arrays//");

        char again = 'y'; //loops code 
        while(again == 'y') {

    System.out.println("------------------------------------------");
    System.out.println("[Input]");
    System.out.println(" ");

    System.out.print("How many scores to enter: ");
        int size = scanner.nextInt(); //how many arrays

    System.out.println(" ");
    
        int [] score = new int[size]; //score instance
        double sum = 0.0; //start of sum
        int counter = 1; //start of counter      

        //loop for scores
        for (int index = 0 ; index < score.length; index++) {
            System.out.print("Enter score " + counter + ": ");
            score[index] = scanner.nextInt();
            sum = sum + score[index];
            counter++; }
        
        double average = ((double) sum) / score.length; //average

        //display scores seperated by comma
        String result = "";
            for(int index : score)
            result += "" + index + ", ";

    System.out.println("------------------------------------------");
    System.out.println("[Output]");
    System.out.println(" ");
    System.out.println("The score average is: " + average + "");
    System.out.println("The " + score.length + " scores entered were: " + result);
   
    System.out.println(" ");
    
	System.out.print("Try again? (y/n): ");
            again = scanner.next().charAt(0); //scans for input to restart code
    }
}
}
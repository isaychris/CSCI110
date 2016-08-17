import java.util.Scanner; //the import for scanner class

public class MidTerm {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("------------------------------------------");
		System.out.println("// Midterm - Palindrome Checker //");
        
        //loops code when user enters y
        char again = 'y';  
        while(again == 'y') {
              
		System.out.println("------------------------------------------");
        System.out.println("[Input]");
    	System.out.println(" ");

        System.out.print("Enter a word: ");
        
        //scanner input
        String word_org = scanner.next(); //orginal
        String word = word_org.toLowerCase(); //lowercase
        
        //variables
        int length = word.length(); //length of word
        int left = 0; //index 0
        int right = length - 1; //index last

        //boolean
        boolean isWordPal = true;

        //loops code while expression is true.
        while (left < right)
        { 
            char startletter = word.charAt(left); //char at index 0
            char endletter = word.charAt(right); //char at index last
    
            //boolean set to false if expression !=
            if (word.charAt(left) != word.charAt(right)) 
            {
                isWordPal = false;
            }  
            ++left;
            --right;
        }	
        
        System.out.println("------------------------------------------");
		System.out.println("[Output]");
        System.out.println(" ");
        
        //if boolean is true
        if (true == isWordPal)
        {
            System.out.println(word_org + " is a palindrome"); 
            
        //if boolean is false   
        } else {
            System.out.println(word_org + " is NOT a palindrome"); 
        }
        
        System.out.println(" ");
		System.out.println("Enter another word? y/n");
        
        again = scanner.next().charAt(0); //scans for input to restart code
        
        }
        }
        }


        

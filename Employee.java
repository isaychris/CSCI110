import java.util.Scanner;

public class Employee {

private String name;
private int salary;
private int hoursWorked;
private int pay;

//readInput() counter
public static int counterOne = 1; 

//constructor two parameters
public Employee (String n, int s) {
    name = n;
    salary = s;
    
}//defaults
public Employee () {
    name = null;
    salary = 0;
}

//mutator
public void setHours(int hours) {
    hoursWorked = hours;
}

//method to read input
public void readInput () {  
    System.out.println(" ");
    System.out.println("Employee " + "[" + counterOne + "]");
    System.out.print("- Name: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
    
    System.out.print("- Salary($/h): ");
	salary = scanner.nextInt();
        
    System.out.print("- Hours: ");
        hoursWorked = scanner.nextInt();
        setHours(hoursWorked);
}

//retuns pay value
public int getPay() {
    return pay = salary * hoursWorked;
}

//returns name value
public String getName() {
    return name;
}
}

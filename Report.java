import java.util.Scanner;

public class Report {
    private Employee[] person;  
    private int EmployeeSize;
    private static int totalPay;
    
    //displayData() counter
    private int counterTwo = 1; 
    
    //returns total payroll
    public int getTotal() {
        return totalPay;
    }
    
    //method to read input.
    public void getInput() {     
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Number of Employees: ");
        EmployeeSize = scanner.nextInt(); 
        person = new Employee[EmployeeSize]; //array object
        
        for (int index = 0 ; index < EmployeeSize; index++) { 
            person[index] =  new Employee(); //employee object
            person[index].readInput(); //readInput for each person.
            
            //totalpay calculated
            totalPay = totalPay + person[index].getPay(); 
            Employee.counterOne++;
        }
    }
         
    public void displayData() {
    for (int index = 0 ; index < EmployeeSize; index++) {
        System.out.println(" ");
        System.out.println("Employee " + "[" + counterTwo + "]");
        System.out.println("- Name: " + person[index].getName());
        System.out.println("- Payroll: " + "$" + person[index].getPay());
        
        counterTwo++;
        }
    }
        
public static void main(String[] args) {   
    System.out.println("==========================================");
    System.out.println("//Payroll Calculator - Final//");
    System.out.println("==========================================");
    System.out.println("[Input]");
    System.out.println(" ");
    
    Report aEmployee = new Report();

    aEmployee.getInput(); //gets input

    System.out.println("------------------------------------------");
    System.out.println("[Output]");
    System.out.println(" ");
    System.out.println("Payroll calculated...");
    
    aEmployee.displayData(); //displays input and calculation
    

    System.out.println("==========================================");
    System.out.println("Total Payroll: " + "$" + aEmployee.getTotal());
    System.out.println("==========================================");
}
}
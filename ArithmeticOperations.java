import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
   
        double Addition = num1 + num2;
        System.out.println("Addition: " + Addition);
        
        
        double Multiplication = num1 * num2;
        System.out.println("Multiplication: " + Multiplication);
        
       
        double Subtraction = num1 - num2;
        System.out.println("Subtraction: " + Subtraction);
        
        
        double Division = num1 / num2;
        System.out.println("Division: " + Division);
    }
}
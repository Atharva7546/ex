import java.util.Scanner;

public class ex {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to Basic Calculator");
            System.out.println("Available operations:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");

            System.out.print("Enter operation number: ");
            int operation = scanner.nextInt();

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0.0;
            String operator = "";

            switch (operation) {
                case 1:
                    result = num1 + num2;
                    operator = "+";
                    break;
                case 2:
                    result = num1 - num2;
                    operator = "-";
                    break;
                case 3:
                    result = num1 * num2;
                    operator = "*";
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        operator = "/";
                    } else {
                        System.out.println("Error! Division by zero is not allowed.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid operation selected.");
                    return;
            }

            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}

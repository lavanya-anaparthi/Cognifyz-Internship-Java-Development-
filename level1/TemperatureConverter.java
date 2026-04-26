import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Temperature Converter ---");
        System.out.print("Enter value: ");
        double val = sc.nextDouble();
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = sc.nextInt();
        if (choice == 1) {
            double result = (val * 9/5) + 32;
            System.out.println("Converted Temperature: " + result + "°F");
        } else if (choice == 2) {
            double result = (val - 32) * 5/9;
            System.out.println("Converted Temperature: " + result + "°C");
        } else {
            System.out.println("Invalid choice.");
        }
        sc.close();
    }
}

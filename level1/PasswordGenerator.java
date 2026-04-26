import java.util.Scanner;
import java.util.Random;
public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter password length: ");
        int length = sc.nextInt();
        System.out.print("Include numbers? (y/n): ");
        boolean useNum = sc.next().equalsIgnoreCase("y");
        System.out.print("Include special characters? (y/n): ");
        boolean useSpec = sc.next().equalsIgnoreCase("y");
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String special = "!@#$%^&*()_+-=";
        String pool = lower + upper;
        if (useNum) pool += numbers;
        if (useSpec) pool += special;
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            password.append(pool.charAt(rand.nextInt(pool.length())));
        }
        System.out.println("Generated Password: " + password.toString());
        sc.close();
    }
}

import java.util.*;
public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass = sc.nextLine();
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (char ch : pass.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true;   }
        if (pass.length() >= 8 && hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("Strong Password ");
        } else if (pass.length() >= 6) {
            System.out.println("Medium Password ");
        } else {
         System.out.println("Weak Password ");   }
        sc.close();
    }
}
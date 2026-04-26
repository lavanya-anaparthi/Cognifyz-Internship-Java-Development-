import java.io.*;
import java.util.*;

public class FileEncryptDecrypt {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        System.out.print("Enter 1 for Encrypt, 2 for Decrypt: ");
        int choice = sc.nextInt();

        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        String outputFile = (choice == 1) ? "encrypted.txt" : "decrypted.txt";
        FileWriter fw = new FileWriter(outputFile);

        int ch;
        while ((ch = br.read()) != -1) {
            if (choice == 1)
                fw.write(ch + 3);   // Encrypt
            else
                fw.write(ch - 3);   // Decrypt
        }

        br.close();
        fw.close();

        System.out.println("Output saved in " + outputFile);

        sc.close();
    }
}
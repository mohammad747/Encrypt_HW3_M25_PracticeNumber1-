import java.util.Scanner;
/*
practice number 1
 */
/*
Written by: Mohammad Hashemi
Tuesday,March 12 2019
سه شنبه،21اسفند97
 */
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Encryption encryption = new Encryption();
        Decryption decryption = new Decryption();

        System.out.print("Enter the message: ");
        encryption.setMessage(scanner.nextLine());

        System.out.print("Enter the key: ");
        encryption.setKey(scanner.nextInt());

        System.out.println("Encrypted message: " + encryption.encryption());

        System.out.println("Decrypted message:" + decryption.decryption(encryption));


    }//End of main method


}//End of class


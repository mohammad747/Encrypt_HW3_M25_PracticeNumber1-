import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Encryption encryption = new Encryption();
        Decryption decryption = new Decryption();

        System.out.print("Enter the message: ");
        encryption.setMessage(scanner.next());

        System.out.print("Enter the key: ");
        encryption.setKey(scanner.nextInt());

        System.out.println("Encrypted message is: "+encryption.encryption());


    }



}


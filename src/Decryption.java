public class Decryption {

    Encryption encryption = new Encryption();

    private String decryption(Encryption encryption){
        int ascii;
        String encryptedMessage = null;
        for (int i=0;i<encryption.getMessage().length();i++){
            ascii = (int) encryption.getMessage().charAt(i);

            encryptedMessage = Integer.toString(ascii - encryption.getKey());

        }

        return encryptedMessage;
    }
}

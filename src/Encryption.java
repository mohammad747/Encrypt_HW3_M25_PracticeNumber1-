public class Encryption {
    private String message;
    private static int key;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static void setKey(int key) {
        Encryption.key = key;
    }

    public static int getKey() {
        return key;
    }

    String encryption(String message, int key) {
        int ascii;


        for (int i = 0; i < message.length(); i++) {

            ascii = (int) message.charAt(i);

            message = Integer.toString(ascii + key);
        }
        return message;
    }

}

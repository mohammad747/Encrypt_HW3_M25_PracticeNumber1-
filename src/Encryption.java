class Encryption {
    private String message;
    private static int key;

    void setMessage(String message) {
        this.message = message;
    }

    String getMessage() {
        return message;
    }

    static void setKey(int key) {
        Encryption.key = key;
    }

    static int getKey() {
        return key;
    }

    String encryption(String message, int key) {
        int ascii;


        for (int i = 0; i < message.length(); i++) {

            ascii = (int) message.charAt(i);

            this.message = Integer.toString(ascii + key);
        }
        return this.message;
    }

}

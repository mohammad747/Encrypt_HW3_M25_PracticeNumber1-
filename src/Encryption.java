class Encryption {
    private String message;
    private int key;

    void setMessage(String message) {
        this.message = message;
    }

    String getMessage() {
        return message;
    }

    void setKey(int key) {
        this.key = key;
    }

    int getKey() {
        return key;
    }

    String encryption() {
        int ascii;

        for (int i = 0; i < this.message.length(); i++) {

            ascii = (int) this.message.charAt(i);

            this.message = Integer.toString(ascii + key);
        }
        return this.message;
    }

}

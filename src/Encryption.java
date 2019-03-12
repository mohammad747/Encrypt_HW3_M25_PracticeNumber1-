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

        char[] chars = this.message.toCharArray();

        for (int i=0;i<chars.length;i++){
            chars[i]= (char)(((int) chars[i])+key);
        }
        this.message = new String(chars);
        return message;
    }

}

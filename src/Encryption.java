/*
practice number 1
 */
/*
Written by: Mohammad Hashemi
Tuesday,March 12 2019
سه شنبه،21اسفند97
 */
class Encryption {
    private String message;
    private int key;

    String getMessage() {
        return message;
    }

    void setMessage(String message) {
        this.message = message;
    }

    int getKey() {
        return key;
    }

    void setKey(int key) {
        this.key = key;
    }

    //Encryption method which encrypt a message with the given key
    String encryption() {

        //Convert the given message to an array of chars
        char[] chars = this.message.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') continue;
            chars[i] = (char) (((int) chars[i]) + key);

        }
        this.message = new String(chars);
        return message;
    }//End of method

}//End of class

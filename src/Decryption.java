/*
practice number 1
 */
/*
Written by: Mohammad Hashemi
Tuesday,March 12 2019
سه شنبه،21اسفند97
 */
class Decryption {
    //Decryption method which decrypt the return
    // message from the encryption method
    //of Encryption.class
    String decryption(Encryption encryption) {
        char[] chars = encryption.getMessage().toCharArray();
        for (int i = 0; i < encryption.getMessage().length(); i++) {
            //Skip spaces
            if (chars[i] == ' ') continue;
            chars[i] = (char) (((int) chars[i]) - encryption.getKey());
        }

        encryption.setMessage(new String(chars));
        return encryption.getMessage();
    }//End of Decryption
}//End of class

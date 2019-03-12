class Decryption {

    String decryption(Encryption encryption){
        char[] chars = encryption.getMessage().toCharArray();
        for (int i=0;i<encryption.getMessage().length();i++){
            if (chars[i]==' ')continue;
            chars[i]= (char)(((int) chars[i])-encryption.getKey());

        }

        encryption.setMessage(new String(chars));
        return encryption.getMessage();
    }
}

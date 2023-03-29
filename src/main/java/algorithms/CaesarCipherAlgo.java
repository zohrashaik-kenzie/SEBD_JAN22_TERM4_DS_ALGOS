package algorithms;

public class CaesarCipherAlgo {
    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encrypt(String plainText, int n) {

        StringBuilder cipherText = new StringBuilder();

        for (int i = 0; i < plainText.length(); i++) { // O(n)
            char charToEncrypt = plainText.charAt(i);
            char replaceVal = ' ';

            if (charToEncrypt != ' ') {
                int x = ALPHABET.indexOf(charToEncrypt);
                int keyVal = (n + x) % 26;
                replaceVal = ALPHABET.charAt(keyVal);
            }

            cipherText.append(replaceVal); // O(1) because using StringBuffer
        }

        return cipherText.toString();

    }

    public static String decrypt(String cipherText, int n) {

        StringBuilder plainText = new StringBuilder();

        for (int i = 0; i < cipherText.length(); i++) {
            char charToDecrypt = cipherText.charAt(i);
            char replaceVal = ' ';

            if (charToDecrypt != ' ') {
                int x = ALPHABET.indexOf(charToDecrypt);
                int keyVal = (x - n) % 26;

                if (keyVal < 0) {
                    keyVal = ALPHABET.length() + keyVal;
                }

                replaceVal = ALPHABET.charAt(keyVal);
            }

            plainText.append(replaceVal);
        }

        return plainText.toString();
    }
    public static void main(String[] args){
         System.out.println(encrypt("THIS IS A TEST",3));
    }
}

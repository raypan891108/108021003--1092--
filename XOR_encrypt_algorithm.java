import java.util.*;

public class XOR_encrypt_algorithm {
    public static void main(String[] args) {

        String key = "01101011";
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        String encrypt_str = encrypt(key, str);
        System.out.println(encrypt_str);

        String Decrypt_str = encrypt(key, encrypt_str);
        System.out.println(Decrypt_str);
    }

    public static String encrypt(String key, String str) {

        String[] array_str = str.split("");
        String[] array_key = key.split("");
        String encrypt_str = "";
        for (int i = 0; i < array_str.length; i++) {
            if ((int) (array_str[i].charAt(0)) == (int) (array_key[i].charAt(0))) {
                encrypt_str += "0";
            } else {
                encrypt_str += "1";
            }
        }
        // System.out.println(encrypt_str);
        return encrypt_str;
    }

    public static String Decrypt(String key, String str) {

        String[] array_str = str.split("");
        String[] array_key = key.split("");
        String Decrypt_str = "";
        for (int i = 0; i < array_str.length; i++) {
            if (Integer.parseInt(array_str[i]) == Integer.parseInt(array_key[i])) {
                Decrypt_str += "0";
            } else {
                Decrypt_str += "1";
            }
        }
        // System.out.println(encrypt_str);
        return Decrypt_str;
    }
}

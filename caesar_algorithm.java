import java.util.*;

public class caesar_algorithm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rand = new Random();
        int key = rand.nextInt(26) + 1;
        System.out.println(key);
        String str = scn.next();

        String encrypt_str = encrypt(key, str);
        System.out.println(encrypt_str);

        String Decrypt_str = Decrypt(key, encrypt_str);
        System.out.println(Decrypt_str);
    }

    public static String encrypt(int key, String str) {
        String encrypt_str = "";
        for (int i = 0; i < str.length(); i++) {
            int tmp = (int) str.charAt(i);
            if (tmp < 91) {
                tmp += key;
                if (tmp > 90) {
                    tmp -= 26;
                }
                encrypt_str += (char) tmp;
            } else {
                tmp += key;
                if (tmp > 122) {
                    tmp -= 26;
                }
                encrypt_str += (char) tmp;
            }
        }
        return encrypt_str;
    }

    public static String Decrypt(int key, String str) {
        String Decrypt_str = "";
        for (int i = 0; i < str.length(); i++) {
            int tmp = (int) str.charAt(i);
            if (tmp < 91) {
                tmp -= key;
                if (tmp < 65) {
                    tmp += 26;
                }
                Decrypt_str += (char) tmp;
            } else {
                tmp -= key;
                if (tmp < 97) {
                    tmp += 26;
                }
                Decrypt_str += (char) tmp;
            }
        }
        return Decrypt_str;
    }
}

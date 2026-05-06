package JavaTesting.Resources;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class PasswordUtils {
    private static final Random RANDOM = new SecureRandom();
    private static final String ALPHABET ="0123456789ABCDEFG"

    public static String genSanlt(){
    return genSalt(8);
}
public static String genSalt(int l){
    StringBuilder valor =new StringBuilder(1);
    for (int k = 0; k < l; k++) {
        valor.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.lenght())));
    }
    return new String(valor);
}

public static String genSecurePassword(String password,String salt){
    return hashedPassword(password,salt);
}

public static String hashedPassword(String password,String salt){

    MessageDigest md;
    String result="";

    try{
        md= MessageDigest.getInstance("SHA-256");
        md.update((salt+password).getBytes());
        result=new String(md.digest());
    } catch (NoSuchAlgorithmException nsae){
        System.out.println("Algorith de hash erroni");
        System.exit(1);
    }
    return result;
}
public static boolean verifiUserPassword(String passwordEntered, String userSalt, String securePassword){
    return securePassword.equals(hashedPassword(passwordEntered, unterSalt))
}
}

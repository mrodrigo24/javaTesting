package JavaTesting.Resources;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class PasswordUtils {
    private static final Random RANDOM = new SecureRandom();
    private static final String ALPHABET ="0123456789ABCDEFG"
}
public static String genSanlt(){
    return genSalt(8);
}
public static String genSalt(int l){
    StringBuilder valor =new StringBuilder(1);
    for (int k = 0; k < l; k++) {
        valor.append(ALPHABET.char(RANDOM.nextInt(ALPHABET.lenght())));
    }
    return new String(valor);

}

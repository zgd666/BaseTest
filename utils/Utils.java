package utils;

import java.security.SecureRandom;
import java.util.Base64;
/**
 * @author zhang
 */
public class Utils {
    /**
     * 生成密钥
     * @param length
     * @return
     */
    public static String generateKey(int length) {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[length];
        random.nextBytes(bytes);
        return Base64.getEncoder().encodeToString(bytes);
    }
}

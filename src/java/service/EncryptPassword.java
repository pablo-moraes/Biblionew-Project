package service;
import org.springframework.security.crypto.bcrypt.BCrypt;
public class EncryptPassword {
    public EncryptPassword(){}
    
    public String encrypt(String senha) {
        String encryptedPasswd = BCrypt.hashpw(senha, BCrypt.gensalt());
        return encryptedPasswd;
    }
    
    public boolean match(String passwd, String encryptedPasswd) {
        boolean result = BCrypt.checkpw(passwd, encryptedPasswd);
        return result;
    }
}

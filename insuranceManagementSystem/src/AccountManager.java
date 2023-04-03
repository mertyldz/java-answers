import java.util.HashMap;
import java.util.TreeSet;

public class AccountManager {
    private static TreeSet<Account> accList = new TreeSet<>();
    private static HashMap<String, String> idPw = new HashMap<>();

    public AccountManager() {
    }

    public static TreeSet<Account> getAccList() {
        return accList;
    }

    public static void setAccList(TreeSet<Account> accList) {
        AccountManager.accList = accList;
    }

    public static void login(String email, String password) throws InvalidAuthenticationException {

        if (getIdPw().containsKey(email) && getIdPw().containsValue(password)) {
            System.out.println("Başarılı şekilde giriş yaptınız...");
        } else {
            throw new InvalidAuthenticationException("Hatalı giriş denemesi !");
        }
    }

    public static HashMap<String, String> getIdPw() {
        return idPw;
    }

    public static void setIdPw(HashMap<String, String> idPw) {
        AccountManager.idPw = idPw;
    }


}

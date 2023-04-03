import java.util.ArrayList;
import java.util.Comparator;

public abstract class Account{
    private User usr;
    private boolean AuthenticationStatus;
    private ArrayList<Insurance> insurances;

    public Account(User usr, boolean authenticationStatus, ArrayList<Insurance> insurances) {
        this.usr = usr;
        AuthenticationStatus = authenticationStatus;
        this.insurances = insurances;
    }


    private final void showUserInfo() {
        System.out.println("---Kullanıcı Bilgileri---");
        System.out.println("Kullanıcı Adı : " + usr.getFirstName() + " " + usr.getLastName());
        System.out.println("Mesleği : " + usr.getJob());
        System.out.println("E-posta Adresi : " + usr.getEmail());
        System.out.println("Şifresi : " + usr.getPassword());
        usr.printAddresses();
        System.out.println("Yaşı : " + usr.getAge());
        System.out.println("Son Giriş Tarihi" + usr.getLastLoginDate());
    }

    public User getUsr() {
        return usr;
    }

    public void setUsr(User usr) {
        this.usr = usr;
    }

    public boolean isAuthenticationStatus() {
        return AuthenticationStatus;
    }

    public void setAuthenticationStatus(boolean authenticationStatus) {
        AuthenticationStatus = authenticationStatus;
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(ArrayList<Insurance> insurances) {
        this.insurances = insurances;
    }

    public String login(User usr, String email, String password) throws InvalidAuthenticationException {
        if (usr.getEmail() == email && usr.getPassword() == password) {
            return "SUCCESS";
        } else {
            throw new InvalidAuthenticationException("Hatalı giriş denemesi");
        }
    }

}

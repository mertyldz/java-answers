import java.util.ArrayList;

public class Enterprise extends Account{
    public Enterprise(User usr, boolean authenticationStatus, ArrayList<Insurance> insurances) {
        super(usr, authenticationStatus, insurances);
    }
}

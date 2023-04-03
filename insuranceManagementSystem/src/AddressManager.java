import java.util.ArrayList;

public class AddressManager implements IAddress {

    public AddressManager(User usr) {
        this.usr = usr;
    }

    private User usr;

    public User getUsr() {
        return usr;
    }

    public void setUsr(User usr) {
        this.usr = usr;
    }

    @Override
    public void addAdress(String typ1, String str1, String typ2, String str2) {
        ArrayList<Address> adr = new ArrayList<>();
        adr.add(new Address(typ1, str1));
        adr.add(new Address(typ2, str2));

        usr.setAddresses(adr);

    }

    @Override
    public void deleteAdressByType(String str) {
        for (Address a : getUsr().getAddresses()) {
            if (a.getAddressType().equals(str)) {
                getUsr().getAddresses().remove(a);
            }
        }
    }

    @Override
    public void changeAdressByType(String str, String newAdress) {
        for (Address a : getUsr().getAddresses()) {
            if (a.getAddressType().equals(str)) {
                a.setAddress(newAdress);
            }
        }

    }
}

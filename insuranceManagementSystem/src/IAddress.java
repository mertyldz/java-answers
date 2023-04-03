public interface IAddress {
    void addAdress(String typ1, String str1, String typ2, String str2);

    void deleteAdressByType(String str);

    void changeAdressByType(String str, String newAdress);
}

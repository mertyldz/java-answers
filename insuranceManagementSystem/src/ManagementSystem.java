import java.util.ArrayList;
import java.util.Scanner;

public class ManagementSystem {
    public static void run() throws InvalidAuthenticationException {
        ArrayList<Address> adr = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        boolean menuKey = true;
        while (menuKey) {
            System.out.println("1-Kullanıcı Ekle");
            System.out.println("2-Login");
            System.out.println("0-Çıkış");
            int choice = s.nextInt();
            switch (choice){
                case 1:
                    System.out.println("---Yeni Kullanıcı---");
                    System.out.print("İsminiz : ");
                    String name = s.next();

                    System.out.print("Soyisminiz : ");
                    String lastName = s.next();

                    System.out.print("Mail adresiniz : ");
                    String email = s.next();

                    System.out.print("Şifreniz : ");
                    String pw = s.next();

                    System.out.print("İş adresinizi giriniz : ");
                    String address1 = s.next();

                    System.out.print("Ev adresinizi giriniz : ");
                    String address2 = s.next();

                    // Address Get Together
                    Address jobAd = new Address("Job", address1);
                    Address homeAd = new Address("Home", address2);
                    adr.add(jobAd);
                    adr.add(homeAd);

                    System.out.print("İşiniz : ");
                    String job = s.next();

                    System.out.print("Yaşınız : ");
                    int age = s.nextInt();
                    User usr = new User(name, lastName, email, pw, job, age, adr, "03-04-2023");
                    break;
                case 2:
                    System.out.print("Kullanıcı adı : ");
                    String emailLog = s.next();
                    System.out.print("Şifre : ");
                    String pwLog = s.next();

                    AccountManager.login(emailLog, pwLog);
                    break;
                case 0:
                    menuKey=false;
                    break;
            }
        }
    }
}

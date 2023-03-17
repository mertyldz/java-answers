import java.util.Objects;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        String userName, password;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = scanner.nextLine();

        System.out.print("Şifreniz : ");
        password = scanner.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız!");
        } else if (userName.equals("patika") && !password.equals("java123")) {
            System.out.print("Şifrenizi sıfırlamak ister misiniz ? \n1-Evet\n2-Hayır");
            int reset = scanner.nextInt();

            switch (reset){
                case 1:
                    System.out.print("Yeni şifrenizi giriniz : ");
                    String newPassword = scanner.next();

                    if(newPassword.equals("java123")){
                        System.out.println("Şifre oluşturulamadı, başka şifre deneyiniz.");
                    } else{
                        System.out.println("Şifre oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.println("Şifre oluşturmak istemediniz, çıkış yapılıyor");
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız !");
                    break;
            }

        } else {
            System.out.println("Bilgileriniz yanlış !");
        }
    }
}
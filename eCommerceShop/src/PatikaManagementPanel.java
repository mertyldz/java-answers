import java.util.Scanner;

public class PatikaManagementPanel {
    public static void run() {
        Brands brandList = new Brands();
        Scanner sc = new Scanner(System.in);
        int i;
        boolean menuKey = true;
        boolean notebookKey = true;
        boolean phoneKey = true;

        // Menu Transactions
        while (menuKey) {
            System.out.println("PatikaStore Ürün Yönetim Paneli");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("4 - Marka Ekle");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz : ");
            i = sc.nextInt();

            switch (i) {
                case 1:
                    System.out.println("---Notebook İşlemleri---");
                    while (notebookKey) {
                        System.out.println("1 - Listele");
                        System.out.println("2 - Sil");
                        System.out.println("3 - Ekle");
                        System.out.println("0 - Çıkış Yap");
                        int notebookOption = sc.nextInt();
                        switch (notebookOption) {
                            case 1 -> Notebook.printNotebooks();
                            case 2 -> Notebook.deleteNotebookById();
                            case 3 -> Notebook.addNotebook();
                            case 0 -> notebookKey = false;
                            default -> System.out.println("Geçerli bir işlem giriniz !");
                        }
                    }
                    break;
                case 2:
                    System.out.println("---Telefon İşlemleri---");
                    while (phoneKey) {
                        System.out.println("1 - Listele");
                        System.out.println("2 - Sil");
                        System.out.println("3 - Ekle");
                        System.out.println("0 - Çıkış Yap");
                        int phoneOption = sc.nextInt();
                        switch (phoneOption) {
                            case 1 -> Telephone.printTelInfo();
                            case 2 -> Telephone.deletePhoneById();
                            case 3 -> Telephone.addPhone();
                            case 0 -> phoneKey = false;
                        }
                    }

                    break;
                case 3:
                    System.out.println("---Markaları Listele---");
                    for (Brands b : Brands.getBrandList()) {
                        System.out.println(b.getId() + " - " + b.getName());
                    }
                    break;
                case 4:
                    System.out.print("Marka adı giriniz : ");
                    String name = sc.next();
                    Brands.addBrand(name);
                    break;
                case 0:
                    System.out.println("Çıkış Yapılıyor...");
                    menuKey = false;
                    break;
                default:
                    System.out.println("Geçerli bir işlem giriniz !");
            }
        }

    }
}

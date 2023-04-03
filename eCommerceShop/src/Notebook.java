import java.util.ArrayList;
import java.util.Scanner;

public class Notebook extends BaseProduct {
    private static ArrayList<Notebook> notebooks = new ArrayList<>();

    static {
        add();
    }

    public Notebook(int id, double price, double discountRatio, double stockAmount, String productName, Brands brandInfo, int ram, int storage, double screenSize) {
        super(id, price, discountRatio, stockAmount, productName, brandInfo, ram, storage, screenSize);
    }

    public Notebook() {
        add();
    }

    public static void add() {
        notebooks.add(new Notebook(1, 7000, 20, 50, "HUAWEI Matebook 14", Brands.getBrandByName("Huawei"), 16, 512, 14.0));
        notebooks.add(new Notebook(2, 3699, 20, 50, "LENOVO V14 IGL", Brands.getBrandByName("Lenovo"), 8, 1024, 14.0));
        notebooks.add(new Notebook(3, 8199, 20, 50, "ASUS Tuf Gaming", Brands.getBrandByName("Asus"), 32, 2048, 15.6));
    }

    public static Notebook getNotebookById(int id) {
        return notebooks.get(id + 1);
    }

    public static ArrayList<Notebook> getNotebooks() {
        return notebooks;
    }

    public static void printNotebooks() {
        for (Notebook nb : notebooks) {
            System.out.println("| " + nb.getId() + " | " + nb.getProductName() + " \t|" + nb.getPrice() + " TL| " + nb.getBrandInfo().getName() + " | " + nb.getStorage() + " | " + nb.getScreenSize() + " | " + nb.getRam() + " \t|");
        }

    }

    public static void deleteNotebookById() {
        int deleteId;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Silinecek ürünün id'sini giriniz : ");
        deleteId = scanner.nextInt();

        for (int i = 0; i < notebooks.size(); i++) {
            if (notebooks.get(i).getId() == deleteId) {
                notebooks.remove(i);
            }
        }
    }

    public static void addNotebook() {
        int id, ram, storage;
        double price, discountRatio, screenSize, stockAmount;
        String productName;
        Brands brandInfo;

        Scanner scanner = new Scanner(System.in);
        System.out.print("ID : ");
        id = scanner.nextInt();
        System.out.print("Price : ");
        price = scanner.nextDouble();
        System.out.print("Discount Ratio : ");
        discountRatio = scanner.nextDouble();
        System.out.print("Stock Amount : ");
        stockAmount = scanner.nextDouble();
        System.out.print("Product Name : ");
        productName = scanner.next();
        System.out.print("Brand Info : ");
        String brandInfoName = scanner.next();
        brandInfo = Brands.getBrandByName(brandInfoName);
        System.out.print("Ram : ");
        ram = scanner.nextInt();
        System.out.print("Storage : ");
        storage = scanner.nextInt();
        System.out.print("Screen Size : ");
        screenSize = scanner.nextDouble();

        Notebook newNotebook = new Notebook(id, price, discountRatio, stockAmount, productName, brandInfo, ram, storage, screenSize);
        notebooks.add(newNotebook);
    }

    @Override
    public void printInfo() {

    }
}

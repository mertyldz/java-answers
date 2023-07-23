import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Macera oyununa hoşgeldiniz!");
        System.out.print("Lütfen bir isim giriniz: ");
//        String playerName = scanner.nextLine();
        Player player = new Player("Mert");
        System.out.println("Sayın " + player.getName() + " bu karanlık ve sisli adaya hoşgeldiniz!\nBurada yaşananların " +
                "hepsi gerçek!");
        System.out.println("Lütfen bir karakter seçiniz !");
        player.selectChar();

        Location location = null;
        while (true) {
            player.printInfo();
            System.out.println();
            System.out.println("########## Bölgeler ##########");
            System.out.println();
            System.out.println("1 - Güvenli Ev --> Burası sizin için güvenli bir ev, düşman yoktur!");
            System.out.println("2 - Eşya Dükkanı --> Silah veya zırh satın alabilirsiniz!");
            System.out.println("3 - Mağara --> Ödül <Yemek>, dikkatli ol zombi çıkabilir!");
            System.out.println("4 - Orman --> Ödül<Odun>, dikkatli ol vampir çıkabilir!");
            System.out.println("5 - Nehir --> Ödül<Su>, dikkatli ol ayı çıkabilir!");
            System.out.println("6 - Maden --> Ödül<Para,Silah,Zırh>, dikkatli ol yılan çıkabilir!");
            System.out.println("0 - Çıkış Yap --> Oyunu sonlandır !");
            System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz: ");
            int selectLoc = scanner.nextInt();
            switch (selectLoc) {
                case 0 -> location = null;
                case 1 -> location = new SafeHouse(player);
                case 2 -> location = new ToolStore(player);
                case 3 -> {
                    if (BattleLoc.getConqueredList().contains("Mağara")) {
                        System.out.println("Bu harita zaten keşfedildi!");
                        continue;
                    } else {
                        location = new Cave(player);
                    }
                }
                case 4 -> {
                    if (BattleLoc.getConqueredList().contains("Orman")) {
                        System.out.println("Bu harita zaten keşfedildi!");
                        continue;
                    } else {
                        location = new Forest(player);
                    }
                }
                case 5 -> {
                    if (BattleLoc.getConqueredList().contains("Nehir")) {
                        System.out.println("Bu harita zaten keşfedildi!");
                        continue;
                    } else {
                        location = new River(player);
                    }
                }
                case 6 -> location = new Mine(player);
                default -> location = new SafeHouse(player);
            }


            if (location == null) {
                System.out.println("Bu karanlık ve sisli adadan çabuk vazgeçtin!");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("GAME OVER");
                break;
            }
        }
    }
}

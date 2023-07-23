public class ToolStore extends NormalLoc {

    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("----- Mağazaya Hoşgeldiniz ! -----");
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("1 - Silahlar");
            System.out.println("2 - Zırhlar");
            System.out.println("3 - Çıkış Yap");
            System.out.print("Seçiminiz: ");
            int selectCase = scanner.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.println("Geçersiz bir değer girdiniz, tekrar giriniz: ");
                selectCase = scanner.nextInt();
            }
            switch (selectCase) {
                case 1 -> {
                    printWeapon();
                    buyWeapon();
                }
                case 2 -> {
                    printArmor();
                    buyArmor();
                }
                case 3 -> {
                    System.out.println("Bir daha bekleriz");
                    showMenu = false;
                }
            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("----- Silahlar -----");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + " - " + w.getName() + " <Para: " + w.getPrice() + ", Hasar: " + w.getDamage() + ">");
        }
        System.out.println("0 - Çıkış Yap");
    }

    public void buyWeapon() {
        System.out.print("Bir silah seçiniz: ");
        int selectedWeaponId = scanner.nextInt();
        while (selectedWeaponId < 0 || selectedWeaponId > Weapon.weapons().length) {
            System.out.println("Geçersiz değer, tekrar giriniz: ");
            selectedWeaponId = scanner.nextInt();
        }
        if (selectedWeaponId != 0) {
            Weapon selectedWeapon = Weapon.getWeaponById(selectedWeaponId);
            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır!");
                } else {
                    // Satın almanın gerçekleştiği alan
                    System.out.println(selectedWeapon.getName() + " silahını satın aldınız !");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paranız: " + this.getPlayer().getMoney());
                    System.out.println("Önceki silahınız: " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Yeni silahınız: " + this.getPlayer().getInventory().getWeapon().getName());
                }
            }
        }
    }

    public void printArmor() {
        System.out.println("----- Zırhlar -----");
        for (Armor a : Armor.armors()) {
            System.out.println(a.getId() + " - " + a.getName() + " <Para: " + a.getPrice() + " Zırh: " + a.getBlock() + ">");
        }
        System.out.println("0 - Çıkış Yap");
    }

    public void buyArmor() {
        System.out.print("Bir zırh seçiniz: ");
        int selectedArmorId = scanner.nextInt();
        while (selectedArmorId < 0 || selectedArmorId > Armor.armors().length) {
            System.out.println("Geçersiz değer, tekrar giriniz: ");
            selectedArmorId = scanner.nextInt();
        }
        if (selectedArmorId != 0) {

            Armor selectedArmor = Armor.getArmorById(selectedArmorId);
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır!");
                } else {
                    // Satın almanın gerçekleştiği alan
                    System.out.println(selectedArmor.getName() + " zırhını satın aldınız !");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paranız: " + this.getPlayer().getMoney());
                    System.out.println("Önceki zırhınız: " + this.getPlayer().getInventory().getArmor().getName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Yeni silahınız: " + this.getPlayer().getInventory().getArmor().getName());
                }
            }
        }
    }
}

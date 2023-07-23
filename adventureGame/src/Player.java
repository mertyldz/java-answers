import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int originalHealth;
    private int money;
    private String charName;
    private String name;
    private GameChar gameChar;
    private Scanner scanner = new Scanner(System.in);
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {
        Samurai samurai = new Samurai();
        Knight knight = new Knight();
        Archer archer = new Archer();
        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("Karakterler");
        System.out.println("-------------------------------------------------------");
        for (GameChar gameChar : charList) {
            System.out.println("ID: " + gameChar.getId() + "\t Karakter: " + gameChar.getName() + "\t Hasar: " + gameChar.getDamage()
                    + "\t Sağlık: " + gameChar.getHealth() + "\t Para: " + gameChar.getMoney());
        }

        System.out.println("-------------------------------------------------------");
        System.out.print("Lütfen bir karakter giriniz: ");
        int selectChar = scanner.nextInt();
        switch (selectChar) {
            case 1 -> initPlayer(new Samurai());
            case 2 -> initPlayer(new Archer());
            case 3 -> initPlayer(new Knight());
            default -> initPlayer(new Samurai());
        }

    }

    public void printInfo() {
        System.out.println(
                "Silahınız: " + this.getInventory().getWeapon().getName() +
                        "\t | \t Zırhınız: " + this.getInventory().getArmor().getName() +
                        "\t | \t Bloklama: " + this.getInventory().getArmor().getBlock() +
                        "\t | \t Hasarınız: " + this.getTotalDamage() +
                        "\t | \t Sağlık: " + this.getHealth() +
                        "\t | \t Para: " + this.getMoney()
        );
    }

    public int getTotalDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public void initPlayer(GameChar gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setOriginalHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public GameChar getGameChar() {
        return gameChar;
    }

    public void setGameChar(GameChar gameChar) {
        this.gameChar = gameChar;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    public Weapon getWeapon() {
        return this.getInventory().getWeapon();
    }
}

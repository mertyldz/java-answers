import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class BattleLoc extends Location {
    private Obstacle obstacle;
    private Objective award;
    private int maxObstacle;
    public static List<String> conqueredList = new ArrayList<>();

    public BattleLoc(Player player, String name, Obstacle obstacle, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacleNumber();
        System.out.println("Şu anda buradasınız: " + this.getName());
        System.out.println("Dikkatli ol! Burada " + obsNumber + " tane " + this.getObstacle().getName() + " yaşıyor!");
        System.out.print("<S>avaş veya <K>aç: ");
        String selectCase = scanner.nextLine();
        selectCase = selectCase.toUpperCase();
        if (selectCase.equals("S") && combat(obsNumber)) {
            System.out.println(this.getName() + " tüm düşmanları yendiniz! ");
            return true;
        }

        if (getPlayer().getHealth() <= 0) {
            System.out.println("Öldünüz!");
            return false;
        }
        return true;
    }


    public boolean combat(int obsNumber) {
        for (int i = 1; i <= obsNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
            playerStats();
            obstacleStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                System.out.println("<V>ur veya <K>aç");
                String selectCombat = scanner.nextLine().toUpperCase();
                if (selectCombat.equals("V")) {
                    System.out.println("Siz vurdunuz!");
                    this.getObstacle().setHealth(obstacle.getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getObstacle().getHealth() > 0) {
                        System.out.println();
                        System.out.println("Canavar size vurdu!");
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (obstacleDamage < 0) {
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                        afterHit();
                    }
                } else {
                    return false;
                }
            }

            if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
                System.out.println("Düşmanı yendiniz!");
                System.out.println(this.getObstacle().getAward() + " para kazandınız!");
                this.getPlayer().getInventory().getObjectiveList().add(this.getAward());
                System.out.println(this.getAward() + " inventory'e eklendi!");
                BattleLoc.getConqueredList().add(this.getName());
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                System.out.println("Güncel paranız: " + this.getPlayer().getMoney());
            } else {
                return false;
            }
        }
        return false;
    }

    public void afterHit() {
        System.out.println("Canınız: " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " Canı: " + this.getObstacle().getHealth());
        System.out.println("---------");
    }

    public void playerStats() {
        System.out.println("Oyuncu değerleri");
        System.out.println("-------------------------");
        System.out.println("Sağlık: " + this.getPlayer().getHealth());
        System.out.println("Silah: " + this.getPlayer().getWeapon().getName());
        System.out.println("Zırh: " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama: " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Hasar: " + this.getPlayer().getTotalDamage());
        System.out.println("Para: " + this.getPlayer().getMoney());
        System.out.println();
    }

    public void obstacleStats(int i) {
        System.out.println(i + "." + this.getObstacle().getName() + " Değerleri");
        System.out.println("-------------------------");
        System.out.println("Sağlık: " + this.getObstacle().getHealth());
        System.out.println("Hasar: " + this.getObstacle().getDamage());
        System.out.println("Ödül: " + this.getObstacle().getAward());
    }

    public int randomObstacleNumber() {
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public Objective getAward() {
        return award;
    }

    public void setAward(Objective award) {
        this.award = award;
    }

    public static List<String> getConqueredList() {
        return conqueredList;
    }

    public static void setConqueredList(List<String> conqueredList) {
        BattleLoc.conqueredList = conqueredList;
    }
}

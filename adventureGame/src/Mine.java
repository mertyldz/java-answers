public class Mine extends BattleLoc {
    public Mine(Player player) {
        super(player, "Maden", new Snake(), 5);
    }

    public void earnedAward() {
        // 0-15 silah, 15-30 zırh, 30-55 para, 45 hiçbir şey
        int chances = (int) (Math.random() * 100);
        int secondChances = (int) (Math.random() * 100);

        if (chances < 15) {
            // 0-20 tüfek, 20-50 kılıç, 50-100 tabanca
            if (secondChances < 20) {
                if (this.getPlayer().getInventory().getWeapon().getDamage() < Weapon.weapons()[2].getDamage()) {
                    System.out.println(Weapon.weapons()[2].getName() + " kazanıldı ve giyildi!");
                    this.getPlayer().getInventory().setWeapon(Weapon.weapons()[2]);
                } else {
                    System.out.println("Kullanıcının silahı, düşen silahtan daha iyi olduğu için toplanmadı!");
                }

            } else if (secondChances < 50) {
                if (this.getPlayer().getInventory().getWeapon().getDamage() < Weapon.weapons()[1].getDamage()) {
                    System.out.println(Weapon.weapons()[1].getName() + " kazanıldı ve giyildi!");
                    this.getPlayer().getInventory().setWeapon(Weapon.weapons()[2]);
                } else {
                    System.out.println("Kullanıcının silahı, düşen silahtan daha iyi olduğu için toplanmadı!");
                }
            } else {

                if (this.getPlayer().getInventory().getWeapon().getDamage() < Weapon.weapons()[0].getDamage()) {
                    System.out.println(Weapon.weapons()[0].getName() + " kazanıldı ve giyildi!");
                    this.getPlayer().getInventory().setWeapon(Weapon.weapons()[2]);
                } else {
                    System.out.println("Kullanıcının silahı, düşen silahtan daha iyi olduğu için toplanmadı!");
                }
            }

        } else if (chances < 30) {
            // 0-20 ağır zırh, 20-50 orta, 50-100 hafif
            if (secondChances < 20) {
                if (this.getPlayer().getInventory().getArmor().getBlock() < Armor.armors()[2].getBlock()) {
                    System.out.println(Armor.armors()[2].getName() + " zırh kazanıldı ve giyildi!");
                    this.getPlayer().getInventory().setArmor(Armor.armors()[2]);
                } else {
                    System.out.println("Kullanıcının zırhı, düşen zırhtan daha iyi olduğu için toplanmadı!");
                }
            } else if (secondChances < 50) {
                if (this.getPlayer().getInventory().getArmor().getBlock() < Armor.armors()[1].getBlock()) {
                    System.out.println(Armor.armors()[1].getName() + " zırh kazanıldı ve giyildi!");
                    this.getPlayer().getInventory().setArmor(Armor.armors()[1]);
                } else {
                    System.out.println("Kullanıcının zırhı, düşen zırhtan daha iyi olduğu için toplanmadı!");
                }
            } else {
                if (this.getPlayer().getInventory().getArmor().getBlock() < Armor.armors()[0].getBlock()) {
                    System.out.println(Armor.armors()[0].getName() + " zırh kazanıldı ve giyildi!");
                    this.getPlayer().getInventory().setArmor(Armor.armors()[0]);
                } else {
                    System.out.println("Kullanıcının zırhı, düşen zırhtan daha iyi olduğu için toplanmadı!");
                }
            }
        } else if (chances < 55) {
            if (secondChances < 20) {
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 10);
            } else if (secondChances < 50) {
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 5);
            } else {
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 1);
            }

        } else {
            this.getObstacle().setAward(0);
            System.out.println("Hiçbir şey kazanamadınız!");
        }

    }

    @Override
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
                    this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
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
                this.earnedAward();
                System.out.println("Güncel paranız: " + this.getPlayer().getMoney());
            } else {
                return false;
            }
        }
        return false;
    }
}

package UTS_PBO.character;

public class Character {
    protected int hp;
    protected int attack;
    protected int defense;
    protected int potions = 3;

    public Character(int hp, int attack, int defense) {
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }
    
    public int getDefense() {
        return defense;
    }
    
    public void receiveDamage(int damage) {
        this.hp -= damage;
    }
    

    

    public void attack(Character enemy) {
        int damage = this.attack - enemy.defense;
        damage = damage > 0 ? damage : 0;
        enemy.hp -= damage;
        System.out.println("Character menyerang Enemy! Damage: " + damage);
    }

    public void defend(int enemyAttack) {
        int damage = enemyAttack - (this.defense + 5); // +5 saat bertahan
        damage = damage > 0 ? damage : 0;
        this.hp -= damage;
        System.out.println("Bertahan! Damage berkurang. Terima damage: " + damage);
    }

    public int getAttack() {
        return attack;
    }

    public void usePotion() {
        if (potions > 0) {
            hp += 20;
            potions--;
            System.out.println("Minum ramuan! +20 HP. Sisa ramuan: " + potions);
        } else {
            System.out.println("Tidak ada ramuan tersisa!");
        }
    }

    // Overloaded method
    public void usePotion(int healAmount) {
        if (potions > 0) {
            hp += healAmount;
            potions--;
            System.out.println("Minum ramuan khusus! +" + healAmount + " HP. Sisa ramuan: " + potions);
        } else {
            System.out.println("Tidak ada ramuan tersisa!");
        }
    }

    public int getHP() {
        return hp;
    }

    public int getPotions() {
        return potions;
    }
}

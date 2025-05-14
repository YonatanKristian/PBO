
package UTS_PBO.enemy;

import UTS_PBO.character.Character;

public class Enemy extends Character {

    public Enemy(int hp, int attack, int defense) {
        super(hp, attack, defense);
    }

    @Override
    public void attack(Character player) {
    int damage = this.attack - player.getDefense();
    damage = Math.max(damage, 0);
    player.receiveDamage(damage);
    System.out.println("Enemy menyerang balik! Damage: " + damage);
}

}

package ObjectMaster;

public class Wizard extends Human {
    protected int health = 50;
    protected int intelligence = 8;

    public Wizard(){

    }

    public int heal(Human player) {
        player.health = player.health + this.intellegence;
        return player.health;
    }

    public int fireball(Human player) {
        player.health = player.health - this.intellegence * 3;
        return player.health;
    }


}
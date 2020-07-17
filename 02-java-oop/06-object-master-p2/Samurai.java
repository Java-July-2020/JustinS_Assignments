package ObjectMaster;

public class Samurai extends Human{
    protected int health = 200;

    public Samurai(){

    }

    public int deathBlow(Human player){
        player.health = 0;
        this.health = this.health / 2;
        return player.health;
    }

    public void meditate(){
        this.health = 200;
    }

    public int howMany(Human player){
        int numOfSamurai = this.health;
        return numOfSamurai;
    }
}
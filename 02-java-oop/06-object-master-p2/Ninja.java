package ObjectMaster;

public class Ninja extends Human {
    protected int stealth = 10;

    public Ninja(){

    }

    public int steal(Human player){
       player.health -= this.stealth;
        return player.health;
    }

    public void flee(){
        this.health -= 10;
    
    }
}
package ObjectMaster;


public class Human {
    private int strength = 3;
    private int stealth = 3;
    private int intellegence = 3;
    private int health = 100;


    public Human(){
        
    }
    
    public int getHealth(){
        return this.health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getStealth(){
        return this.stealth;
    }

    public void setStealth(int stealth){
        this.stealth = stealth;
    }

    public int getStrength(){
        return this.strength;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public int getIntellegence(){
        return this.intellegence;
    }

    public void setIntellegence(int intellegence){
        this.intellegence = intellegence;
    }

    public int attackHuman(Human player){
        player.health -= this.strength;
        System.out.println("Current health is:" + player.health);
        return health;
    }


}
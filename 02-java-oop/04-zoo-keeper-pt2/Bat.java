package ZooKeeper;

public class Bat {
    protected int energyLevel = 500;

    public void fly(){
        System.out.println("WHOOOOOOOOOOOOOOSH");
        energyLevel -= 50;
    }

    public void eatHumans(){
        energyLevel += 25;
    }

    public void attackTown(){
        System.out.println("the sound of a town on fire");
        energyLevel -= 100;
    }
    
}
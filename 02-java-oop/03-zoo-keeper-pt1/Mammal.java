package ZooKeeper;

public class Mammal {
    protected int energy;
    
    public Mammal(){
        energy = 100;
    }
    
    public int getEnergy(){
        return this.energy;
    }

    public void setEnergy(int energy){
        this.energy = energy;
    }

    public int displayReturnEnergy(int energy) {
        this.energy = energy;
        System.out.println("This animal's current energy is" + energy);
        return energy;
    }
    
}
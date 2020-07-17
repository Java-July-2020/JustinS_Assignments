package ZooKeeper;

public class Gorilla extends Mammal{
    
    public void throwSomething(){
        System.out.println("The gorilla threw a something smelly at you!");
        energy -= 5;
    }

    public void eatBananas(){
        System.out.println("The gorilla found a banana and is happily munching away!");
        energy += 10;
    }

    public void climb(){
        System.out.println("The gorilla climbed a tree to get a better look!");
        energy -= 10;
    }

}
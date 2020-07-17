package ObjectMaster;

public class OBJMTest {
    public static void main(String[] args) {
        Human baseHuman = new Human();
        System.out.println("Then base health of humans is: " + baseHuman.getHealth());
        System.out.println("Then base strength of humans is: " + baseHuman.getStrength());
        System.out.println("Then base intelligence of humans is: " + baseHuman.getIntellegence());
        System.out.println("Then base stealth of humans is: " + baseHuman.getStealth());

    
        baseHuman.attackHuman(baseHuman);
    }
}
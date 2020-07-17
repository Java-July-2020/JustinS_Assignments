package ObjectMaster;

public class OBJMTest {
    public static void main(String[] args) {
        Human baseHuman = new Human();
        System.out.println("Then base health of humans is: " + baseHuman.getHealth());
        System.out.println("Then base strength of humans is: " + baseHuman.getStrength());
        System.out.println("Then base intelligence of humans is: " + baseHuman.getIntellegence());
        System.out.println("Then base stealth of humans is: " + baseHuman.getStealth());
  
        baseHuman.attackHuman(baseHuman);

        Wizard newWizard = new Wizard();
        System.out.println(newWizard.fireball(baseHuman));
        System.out.println(newWizard.heal(baseHuman));

        Ninja newNinja = new Ninja();
        System.out.println(newNinja.steal(baseHuman));
        newNinja.flee();

        Samurai newSamurai = new Samurai();
        System.out.println(newSamurai.deathBlow(baseHuman));
        newSamurai.meditate();
        System.out.println(newSamurai.howMany(newSamurai));
        
    }
}
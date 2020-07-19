package Phone;
    
public class Galaxy extends PhoneAbstract implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "Test Ring";
    }
    @Override
    public String unlock() {
        return "Test Click";
    }
    @Override
    public void displayInfo() {
        System.out.println("Galaxy " + this.getVersionNumber() + " from " + this.getCarrier());      
    }
}

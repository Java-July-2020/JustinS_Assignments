package Phone;

public class IPhone extends PhoneAbstract implements Ringable {
    public IPhone(final String versionNumber, final int batteryPercentage, final String carrier, final String ringTone) {
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
        System.out.println("iPhone " + this.getVersionNumber() + " from " + this.getCarrier());      
    }
}

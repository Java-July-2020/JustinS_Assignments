package Phone;

public abstract class PhoneAbstract {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public PhoneAbstract(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    // getters and setters removed for brevity. Please implement them yourself
    
    public void setVerionNumber(String number) {
    	this.versionNumber = number;
    }
    
    public String getVersionNumber() {
    	return this.versionNumber;
    }
    
    public void setbatteryPercentage(int number) {
    	this.batteryPercentage = number;
    }
    
    public int getbatteryPercentage() {
    	return this.batteryPercentage;
    }
    
    public void setCarrier(String carrier) {
    	this.carrier = carrier;
    }
    
    public String getCarrier() {
    	return this.carrier;
    }
    
    public void setRingTone(String ringtone) {
    	this.ringTone = ringtone;
    }
    
    public String getRingTone() {
    	return this.ringTone;
    }
}

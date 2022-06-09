public class IPhone extends Phone implements Ringable {
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	@Override
	public String ring() {
		return "IPhone " + getVersionNumber() + " says " + getRingTone();
	}

	@Override
	public String unlock() {
		return "Unlocking via face recognition";
	}

	@Override
	public void displayInfo() {
		System.out.println("Galaxy " + getVersionNumber() + " from " + getCarrier());
	}
}

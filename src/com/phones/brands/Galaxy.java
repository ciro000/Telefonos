package com.phones.brands;
import com.phones.Phone;
import com.phones.Ringable;

	public class Galaxy extends Phone implements Ringable {
	    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
	        super(versionNumber, batteryPercentage, carrier, ringTone);
	    }
	    
	    @Override
	    public String ring() {
	        return "Galaxy " + super.getBatteryPercentage() + " suena " + super.getRingTone();
	    }
	    @Override
	    public String unlock() {
	        return "Galaxy " + super.getCarrier() + " desbloqueado";
	    }
	    @Override
	    public void displayInfo() {
	        System.out.println("Galaxy tiene " + super.getBatteryPercentage() + " de batería");
	    }


}

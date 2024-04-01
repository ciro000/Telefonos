package com.phones.brands;
import com.phones.Phone;
import com.phones.Ringable;

public class Iphone extends Phone implements Ringable {
	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	
	@Override
	public String ring() {
		return "Iphone " + super.getVersionNumber() + " suena " + super.getRingTone();
	}
	
	@Override
	public String unlock() {
		return "Iphone " + super.getCarrier() + " desbloqueado";
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Iphone batería " + super.getBatteryPercentage());
	}

}

package com.phones.test;
import com.phones.brands.Galaxy;
import com.phones.brands.Iphone;

public class PhoneTest {

	public static void main(String[] args) {
		
		Iphone XII = new Iphone("12", 80, "Movistar", "Cerveza Crystal");
		XII.displayInfo();
		System.out.println(XII.ring());
		System.out.println(XII.unlock());
		
		Galaxy NotePro = new Galaxy("10", 39, "Entel", "Hamster Dance tutututu");
		NotePro.displayInfo();
		System.out.println(NotePro.ring());
		System.out.println(NotePro.unlock());
		

	}

}

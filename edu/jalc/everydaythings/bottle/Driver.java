package edu.jalc.everydaythings.bottle;

import edu.jalc.everydaythings.bottle.beverage.BeerBottle;
import edu.jalc.everydaythings.bottle.beverage.BeverageBottle;
import edu.jalc.everydaythings.bottle.beverage.SodaBottle;
import edu.jalc.everydaythings.bottle.utility.HandSanitizerBottle;
import edu.jalc.everydaythings.liquid.beverage.Beer;
import edu.jalc.everydaythings.liquid.beverage.Soda;
import edu.jalc.everydaythings.liquid.Water;
import edu.jalc.everydaythings.liquid.utility.HandSanitizer;

import java.util.ArrayList;

public class Driver {
	public static void main(String... args){

		// Yuk, we can drink hand sanitizer!
		ArrayList<Bottle> drinks = new ArrayList<>();
		drinks.add(new SodaBottle(20, new Soda()));
		drinks.add(new BeerBottle(16, new Beer()));
		drinks.add(new WaterBottle(20, new Water()));
		drinks.add(new HandSanitizerBottle(120, new HandSanitizer()));

		for(Bottle bottle : drinks){
			System.out.println("You just drank a " + bottle);
		}

		System.out.println("\nLet's try that again");

		// Instead lets polymorph to a beveragebottle preventing non-beverages
		ArrayList<BeverageBottle> beverages = new ArrayList<>();

		beverages.add(new SodaBottle(20, new Soda()));
		beverages.add(new BeerBottle(16, new Beer()));

		// Will no longer work, but with extra credit, it can be turned back on.
		// beverages.add(new WaterBottle(20, new Water()));

		// notice how we can polymorph from beverage bottle to bottle?
		for(Bottle bottle : beverages){
			System.out.println("You just drank a " + bottle);
		}

		Fillable fillable = new SodaBottle(20, new Soda());
		fillable.fill(2);

		Pourable bottle = new SodaBottle(20, new Soda());
		System.out.println(bottle);
		bottle.pour(2);
	}
}

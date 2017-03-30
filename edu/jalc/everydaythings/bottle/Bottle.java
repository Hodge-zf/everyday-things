package edu.jalc.everydaythings.bottle;

import edu.jalc.everydaythings.liquid.Liquid;

abstract public class Bottle implements Fillable, Pourable{

	private double capacity;
	private Liquid liquid;

	private Bottle(){
		this.capacity = 0;
	}

	public Bottle(double capacity, Liquid liquid){

		this.capacity = capacity;
		this.liquid = liquid;
	}

	public double getCapacity(){
		return this.capacity;
	}


	protected Liquid getLiquid(){
		return this.liquid;
	}

	public String toString(){
		return this.getCapacity() + "oz " + this.getLiquid();
	}
	public void fill(double amount){
		System.out.println("bottle filled");
	}

	public void pour(double amount){
		System.out.println("bottle poured");
	}
}

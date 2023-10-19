package pe.com.design.pattern.app.factory.exam2;

public abstract class Animal {
	AnimalType type;
	AnimalEra era;
	String name;
	
	public Animal(AnimalType type, AnimalEra era, String name) {
		super();
		this.type = type;
		this.era = era;
		this.name = name;
	}
	
	abstract void create();

}

package pe.com.design.pattern.app.factory.exam2;

public class LandAnimal  extends Animal{

	public LandAnimal(AnimalType type, AnimalEra era, String name) {
		super(type, era, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void create() {
		System.out.println("LandAnimal");
		
	}

}

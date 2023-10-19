package pe.com.design.pattern.app.factory.exam2;

public class SkyAnimal  extends Animal{

	public SkyAnimal(AnimalType type, AnimalEra era, String name) {
		super(type, era, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void create() {
		System.out.println("SkyAnimal");
		
	}

}

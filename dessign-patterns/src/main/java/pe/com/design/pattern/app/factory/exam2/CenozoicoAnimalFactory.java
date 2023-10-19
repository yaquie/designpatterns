package pe.com.design.pattern.app.factory.exam2;

public class CenozoicoAnimalFactory implements EraAnimalFactory {

	@Override
	public LandAnimal makeLandAnimal() {
		System.out.println("Cenozoico makeLandAnimal");
		return null;
	}

	@Override
	public SkyAnimal makeSkyAnimal() {
		System.out.println("Cenozoico makeSkyAnimal");
		return null;
	}

}

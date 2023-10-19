package pe.com.design.pattern.app.factory.exam2;

public class MesozoicoAnimalFactory  implements EraAnimalFactory{

	@Override
	public LandAnimal makeLandAnimal() {
		System.out.println("Mesozoico makeLandAnimal");
		return null;
	}

	@Override
	public SkyAnimal makeSkyAnimal() {
		System.out.println("Mesozoico makeSkyAnimal");
		return null;
	}

}

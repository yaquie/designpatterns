package pe.com.design.pattern.app.factory.exam2;

public class AnimalAbstractFactory {
	 Animal animal;
	
	 Animal createAnimal(AnimalType type) {
		
		AnimalEra era = getFromConfiguration();
		switch (era) {
		case MESOZOIC:
			
			animal = new MesozoicoAnimalFactory().makeLandAnimal();
case CENOZOIC:
			
			animal = new CenozoicoAnimalFactory().makeLandAnimal();

	
		}
		
		return animal;
	}

	public static AnimalEra getFromConfiguration() {
		return AnimalEra.MESOZOIC;
	}
}

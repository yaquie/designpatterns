package pe.com.design.pattern.app.factory.exam2;

public class Application {
public static void main(String[] args) {
	new AnimalAbstractFactory().createAnimal(AnimalType.LAND);
}
}

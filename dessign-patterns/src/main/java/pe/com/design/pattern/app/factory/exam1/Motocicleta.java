package pe.com.design.pattern.app.factory.exam1;

public class Motocicleta implements Transporte {

	@Override
	public void arrancar() {
		System.out.println("Estoy arrancando la Motocicleta..");

	}

	@Override
	public void detener() {
		System.out.println("Estoy deteniendo la Motocicleta..");

	}

	@Override
	public String tipo() {
		return "Motocicleta";
	}
}

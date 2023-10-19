package pe.com.design.pattern.app.factory.exam1;

public class Automovil implements Transporte {

	@Override
	public void arrancar() {
		System.out.println("Estoy arrancando el Automovil..");

	}

	@Override
	public void detener() {
		System.out.println("Estoy deteniendo el Automovil..");

	}

	@Override
	public String tipo() {
		return "Automovil";
	}

}

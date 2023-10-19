package pe.com.design.pattern.app.factory.exam1;

public class Application {
	public static void main(String[] args) {
		Transporte t1= Fabrica.construir("Automovil");
		t1.arrancar();
		t1.detener();
		System.out.println(t1.tipo());
	}

}

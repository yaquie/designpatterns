package pe.com.design.pattern.app.singleton;

public class Main {
	public static void main(String[] args) {
		// la version no podemos usar en otro metodo o fuera de la clase
		//Version version = new Version(1, 0, 0);

		UserService userService = new UserService(Version.getInstance());
		CarritoDeCompras carrito = new CarritoDeCompras(Version.getInstance());
		System.out.println("userService: " + userService);
		System.out.println("carrito: " + carrito);
	}


}

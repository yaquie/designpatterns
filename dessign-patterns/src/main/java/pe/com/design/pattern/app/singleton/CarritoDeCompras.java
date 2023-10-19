package pe.com.design.pattern.app.singleton;

public class CarritoDeCompras {
	private Version version;

	public CarritoDeCompras(Version version) {
		super();
		this.version = version;
	}

	@Override
	public String toString() {
		return "CarritoDeCompras [version=" + version + "]";
	}
	
}

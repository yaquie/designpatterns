package pe.com.design.pattern.app.factory.exam3;

public class Main {
	public static void main(String[] args) throws NoSuchFieldException {
		
		//problema, existe muchos if anidados
		//patron factory -> crear clases independientes y gestionar cada una de sus implementaciones

		PagoFactory pagoFactory = new PagoFactory();
		Pago pago = pagoFactory.obtenerPago(TipoDePago.CREDIT_CARD);
		pago.crearPago();
		
	
	}



}

package pe.com.design.pattern.app.factory.exam3;



public class PagoFactory {
	/*
	private final static HashMap<TipoDePago, Pago> pagos = new HashMap<TipoDePago, Pago>() {{
		put(TipoDePago.CREDIT_CARD,  new PagoCreditCard());
		put(TipoDePago.DEBIT_CARD,  new PagoDebitCard());
		put(TipoDePago.PAYPAL,  new PagoPaypal());
	}};
	*/


	public Pago obtenerPago(TipoDePago tipoPago) throws NoSuchFieldException {
		//FORMA 1
		
		switch (tipoPago) {
		case CREDIT_CARD:
			return new PagoCreditCard();
		case DEBIT_CARD:
			return new PagoDebitCard();
		case PAYPAL:
			return (Pago) new PagoPaypal();
		default:
			throw new NoSuchFieldException("Tipo de pago no encontrado");
		}
		
		//FORMA 2, mas legible
		//return (Pago) pagos;

	}

}

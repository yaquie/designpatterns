package pe.com.design.pattern.app.prototype.exam2;

public class App {
	public static void main(String[] args) {
		AccountAHImpl accountsave = new AccountAHImpl();
		accountsave.setAmount(200);

		AccountAHImpl accountClone = (AccountAHImpl) accountsave.clone();
		accountClone.setAmount(300);

		System.out.println(accountsave);
		System.out.println(accountClone);
	}
}

package pe.com.design.pattern.app.prototype.exam2;

public class AccountAHImpl implements IAccount {
	private String type;
	private double amount;
	
	public AccountAHImpl() {
		type = "SAVE";
	}

	@Override
	public IAccount clone() {
		// TODO Auto-generated method stub
		AccountAHImpl account = new AccountAHImpl();
		account.setAmount(this.getAmount());
		return account;
	}

	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "AccountAHImpl [type=" + type + ", amount=" + amount + "]";
	}
	

}

package pe.com.design.pattern.app.observer.exam2;

public class PESOArgObserver extends Observer{

	private double exchange=349.95;
	
	public PESOArgObserver(Subject subject) {
		this.subject = subject;
		this.subject.add(this);
	}
	
	@Override
	public void update() {
		System.out.println("PEN: " + (subject.getStatus()*exchange));
		
	}

}

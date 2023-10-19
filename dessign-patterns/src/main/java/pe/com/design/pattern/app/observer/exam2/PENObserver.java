package pe.com.design.pattern.app.observer.exam2;

public class PENObserver extends Observer{

	private double exchange=3.727;
	
	public PENObserver(Subject subject) {
		this.subject = subject;
		this.subject.add(this);
	}
	
	@Override
	public void update() {
		System.out.println("PEN: " + (subject.getStatus()*exchange));
		
	}

}

package pe.com.design.pattern.app.observer.exam2;

public class PESOMexObserver extends Observer{

	private double exchange=17.434;
	
	public PESOMexObserver(Subject subject) {
		this.subject = subject;
		this.subject.add(this);
	}
	
	@Override
	public void update() {
		System.out.println("PEN: " + (subject.getStatus()*exchange));
		
	}

}

package pe.com.design.pattern.app.observer.exam2;

public class App {

	public static void main(String[] args) {
		Subject subject = new Subject();
		new PENObserver(subject);
		//new PESOArgObserver(subject);
		new PESOMexObserver(subject);
		
		System.out.println("Si dea cambiar 10 dolares obtendra: ");
		subject.setStatus(10);
		System.out.println("------------------------------------");
		System.out.println("Si dea cambiar 100 dolares obtendra: ");
		subject.setStatus(100);
	}
}

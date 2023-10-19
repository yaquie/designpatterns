package pe.com.design.pattern.app.observer.exam1;

public class Main {

	public static void main(String[] args) {

		ExampleObserbable observable = new ExampleObserbable();
		observable.addObserver(new Example1Observer());
		observable.addObserver(new Example2Observer());
		observable.notifyObserver();
		observable.addObserver(new Example3Observer());
		observable.notifyObserver();
	}

}

package pe.com.design.pattern.app.observer.exam1;

public interface Observable {
	void addObserver(Observer o);

	void deleteObserver(Observer o);

	void notifyObserver();

}

package pe.com.design.pattern.app.observer.exam2;

import java.util.HashSet;
import java.util.Set;

public class Subject {
	
	private Set<Observer> observers = new HashSet<Observer>();
	private int status;

	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
		notifyAllObservers();
	}
	
	public void add(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyAllObservers() {
		observers.forEach(obs -> obs.update());
	}

}

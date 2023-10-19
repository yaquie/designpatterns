package pe.com.design.pattern.app.observer.exam1;

import java.util.HashSet;
import java.util.Set;

public class ExampleObserbable implements Observable{
	
	Set<Observer> observerSet = new HashSet<>();

	@Override
	public void addObserver(Observer o) {
		observerSet.add(o);
		
	}

	@Override
	public void deleteObserver(Observer o) {
		observerSet.remove(o);
		
	}

	@Override
	public void notifyObserver() {
		observerSet.forEach(obs -> obs.update());
		
	}

}

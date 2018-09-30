public abstract class Subject {
	protected List<Observer> _observers;

	public Subject(){
		_observers = new LinkedList<Observer>();
	}

	public void attach(Observer o){
		_observers.add(o);
	}

	public void detach(Observer o){
		_observers.remove(o);
	}

	public void notify() {
		Iterator<Observer> it;
		it = _observers.iterator();
		while (it.hasNext()){
			it.next().update();
		}
	}
}

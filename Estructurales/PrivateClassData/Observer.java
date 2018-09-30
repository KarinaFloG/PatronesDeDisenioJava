public abstract class Observer {
	protected Subject _subject;
	
	public Observer (Subject s) {
		_subject = s;
		_subject.attach(this);
	}

	public abstract void update ();
}
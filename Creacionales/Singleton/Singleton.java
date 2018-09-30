public class Singleton{
	static Singleton instancia;

	private Singleton(){

	}

	public synchronized static Singleton getInstancia(){
		if(instancia == null){
			instancia = new Singleton();
		}
		return instancia;
	}
}
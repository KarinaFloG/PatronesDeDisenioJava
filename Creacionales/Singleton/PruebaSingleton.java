public class PruebaSingleton{
	public static void main(String[] args){
		Singleton singletonUno = Singleton.getInstancia();
		Singleton singletonDos = Singleton.getInstancia();

		if(singletonUno == singletonDos){
			System.out.println("En singleton los objetos son la misma instancia");
		}
	}
}
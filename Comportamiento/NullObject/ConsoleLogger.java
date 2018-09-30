/**
 * Escribe el mensaje por consola.
 */
public class ConsoleLogger implements Logger{
	public void log(String msg) {
		System.out.println("Mensaje:" +  msg + " registrado por consola");
	  }
}

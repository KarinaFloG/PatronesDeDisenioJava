/** 
 * Escribe el mensaje en un archivo.
 */
public class FileLogger implements Logger{
	public void log(String msg) {
		System.out.println("Mensaje:" +  msg + " grabado en el archivo");
	  }
}

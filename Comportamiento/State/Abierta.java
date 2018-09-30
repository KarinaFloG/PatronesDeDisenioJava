public class Abierta implements EstadoVentanilla{
	public void atender(Persona persona){
		System.out.println("Atendiendo a: " + persona.getNombre());
	}
}
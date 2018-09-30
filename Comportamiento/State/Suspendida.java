public class Suspendida implements EstadoVentanilla{
	public void atender(Persona persona){
		if(persona.getEdad() > 65){
			System.out.println("Atendiendo a: " + persona.getNombre());
		}else{
			System.out.println("Espere unos minutos por favor");
		}
	}
}
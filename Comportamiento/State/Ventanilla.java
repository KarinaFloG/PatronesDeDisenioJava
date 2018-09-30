public class Ventanilla{
	private String cajero;
	private EstadoVentanilla estado;

	public Ventanilla(){
		estado = new Abierta();
	}

	public void suspender(){
		estado = new Suspendida();
	}

	public void cerrar(){
		estado = new Cerrada();
	}

	public void abrir(){
		estado = new Abierta();
	}

	public void atender(Persona persona){
		estado.atender(persona);
	}

	public String getCajero(){
		return cajero;
	}
}
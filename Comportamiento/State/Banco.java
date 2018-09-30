public class Banco{
	private String nombre;
	private String direccion;
	private Ventanilla ventanilla;

	public Banco(){
		ventanilla = new Ventanilla();
	}

	public void atende(Persona persona){
		System.out.println(persona.getNombre() + "ingresa a la fila ");
		ventanilla.atender(persona);
	}

	public void suspendeVentanilla(){
		ventanilla.suspender();
	}

	public void cerrarVentanilla(){
		ventanilla.cerrar();
	}

	public void abrirVentanilla(){
		ventanilla.abrir();
	}

	public String getNombre(){
		return nombre;
	}
}
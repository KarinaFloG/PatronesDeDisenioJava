public class Usuario implements IUsuarioChat{
	private String nombre;
	private SalonDeCha salon;

	public Usuario(SalonDeChat salonDeChat){
		salon = salonDeChat;
	}

	public void recibe(String de, String msg){
		String s = "El usuario " + de + " te dice: " + msg;
		System.out.println(nombre + ": " + s);
	}

	public void enviar(String a, String msg){
		salon.envia(nombre, a, msg);
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

}
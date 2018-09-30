public class SalonDeChat implements ISalonDeChat{
	private HashMap<String,Usuario> participantes = new HashMap<String, Usuario>;

	public void registra(Usuario user){
		participantes.put(user.getNombre(), user);
	}

	public void envia(String de, String a, String msg){
		if(participantes.constainsKey(de) && participantes.constainsKey(a)){
			Usuario u = participantes.get(a);
			u.recibe(de, msg);
		}else{
			System.out.println("Usuario inexistente");
		}
	}
}
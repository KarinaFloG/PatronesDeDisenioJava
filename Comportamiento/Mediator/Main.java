public class Main{
	public static void main(String[] args){
		SalonDeChat s = new SalonDeChat();
		Usuario u = new Usuario(s);
		u.setNombre("Martin");
		s.registra(u);

		Usuario u1 = new Usuario();
		u1.setNombre("Joaquin");
		s.registra(u1); 
		
		Usuario u2 = new Usuario();
		u2.setNombre("Bety");
		s.registra(u2);

		u.envia("Martin", "Hola como estas?");	
		u1.envia("Joaquin", "Todo fine y ustedes?");
		u2.envia("Bety", "Todo ready fiesta al 100");
	}
}
public class FactoriaMacs{
	public static MacBookAir crearMacBookAir(String id, int ram ,int disco){
		MacLigero macLigero = ContenedorMacLigero.getMacLigero(ram, disco);	
		MacBookAir macBookAir = new MacBookAirFly(id,macLigero);
		return macBookAir;
 	}
}
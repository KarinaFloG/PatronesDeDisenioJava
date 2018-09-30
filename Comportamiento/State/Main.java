public class Main{
	public static void main(String[] args){
		Persona persona1 = new Persona("Juan", "Caloncho",50);
		Persona persona2 = new Persona("Juanita", "Caloncha",65);
		Persona persona3 = new Persona("Maria", "Perez",25);
		Persona persona4 = new Persona("Liz", "Consecua",96);	

		Banco banco = new Banco();
		banco.atender(persona1);
		banco.suspendeVentanilla();
		banco.atender(persona2);
		banco.atender(persona3);

		banco.cerrarVentanilla();
		banco.atender(persona4);
	}
}
public class Main{
	public static void main(String[] args){
		Division d = new Division("Mi sucursal");
		d.add("Empleado 1");
		d.add("Empleado 2");

		Iterator<Empleado> iter = d.iterator();
		while(iter.hasNext()){
			Empleado e = (Empleado) iter.next();
			e.print();
		}
	}
}
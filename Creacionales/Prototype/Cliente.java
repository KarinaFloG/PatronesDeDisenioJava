public class Cliente{
	public static void main(String[] args){
		PrototypeFactory factory = new PrototypeFactory();
		Prototype objeto = new ConcretePrototypeUno();
		ConcretePrototypeUno objetoClonado = (ConcretePrototypeUno) factory.getClonacion(objeto);
		
		System.out.println(objeto);
		System.out.println(objetoClonado);
		System.out.println("Hashcode del objeto clonado: " + System.identityHashCode(System.identityHashCode(objetoClonado)));
	}
}
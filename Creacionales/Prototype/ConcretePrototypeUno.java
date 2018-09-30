public class ConcretePrototypeUno implements Prototype{

	public ConcretePrototypeUno clonar(){
		ConcretePrototypeUno copiarObjeto = null;

		try{
			copiarObjeto = (ConcretePrototypeUno)super.clonar();
		}catch(CloneNotSupportedException e){
			e.printStackTracer();
		}
		return copiarObjeto;
	} 

	public String toString(){
		return "Concrete Prototype Uno";
	}
}
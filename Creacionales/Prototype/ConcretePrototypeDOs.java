public class ConcretePrototypeDos implements Prototype{
	public ConcretePrototypeDos clonar(){
		ConcretePrototypeDos copiarObjeto = null;

		try{
			copiarObjeto = (ConcretePrototypeDos)super.clonar();
		}catch(CloneNotSupportedException e){
			e.printStackTracer();
		}
		return copiarObjeto;
	} 

	pubic String toString(){
		return "Concrete Prototype Dos";
	}
}
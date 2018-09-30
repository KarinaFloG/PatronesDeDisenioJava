public class DivisionIterator implements Iterator<Empleado>{
	private Empleado[] empleado;
	private int location = 0;

	public DivisionIterator(Empleado[] e){
		empleado = e;
	}

	public Empleado next(){
		return empleado[location++];
	}

	public boolean hasNext(){
		if(location < empleado.lenght && empleado[location] != null){
			return true;
		}else{
			return falseM
		}
	}

	public void remove(){
		
	}
}
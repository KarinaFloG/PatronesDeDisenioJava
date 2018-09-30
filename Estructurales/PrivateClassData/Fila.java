public class Fila extends Observer{
	private double[] _data;

	public Fila (Subject s){
		super(s);
		_data = new double[4];
	}

	public void update(){
		double[4] data;
		data = ((Datasource)_subject).getState();
		for (int i = 0; i < 4; i++){
			_data[i] = data[i];
		}
		this.redraw();
	}

	public void redraw(){}
}
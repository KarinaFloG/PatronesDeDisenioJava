public class Datasource extends Subject {
	private double _a, _b, _c, _d;
	
	public double[] getState() {
		double[] d = new double[4];
		d[0] = _a;
		d[1] = _b;
		d[2] = _c;
		d[3] = _d;
		return d;
	}

	public void setState(double[] d){
		_a = d[0];
		_b = d[1];
		_c = d[2];
		_d = d[3];
		this.notify();
	}
}
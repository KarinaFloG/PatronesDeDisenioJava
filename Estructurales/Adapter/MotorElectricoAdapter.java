public class MotorElectricoAdapter extends Motor{
	private MotorElectrico motorElectrico;

	public MotorElectricoAdapter(){
		super();
		this.motorElectrico = new MotorElectrico();
		System.out.println("Creando el motor electrico adapter");
	}

	public void encender(){
		System.out.println("Encendiendo motor electrico adapter");
		this.motorElectrico.conectar();
		this.motorElectrico.activar();
	}

	public void acelerar(){
		System.out.println("Acelerando el motor electrico");
		this.motorElectrico.moverMasRapido();
	}

	public void apagar(){
		System.out.println("Apagando el motor electrico");
		this.motorElectrico.detener();
		this.motorElectrico.desconectar();
	}
}
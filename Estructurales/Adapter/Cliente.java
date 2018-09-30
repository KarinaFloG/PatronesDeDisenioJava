public class Cliente{
    private void usarMotorComun() {
        Motor motor = new MotorEconomico();
        motor = new MotorComun();
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
 
    private void usarMotorElectrico() {
        Motor motor = new MotorElectricoAdapter() ;
        motor.encender();
        motor.acelerar();
        motor.apagar();  
    }
 
    private void usarMotorEconomico() {
        Motor motor = new MotorEconomico();
        motor.encender();
        motor.acelerar();
        motor.apagar();  
    }
}
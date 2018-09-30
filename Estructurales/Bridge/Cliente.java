public class Cliente{
        public static void main(String[] args){

        // En primer lugar crearemos el objeto que representa a la emrpesa de mensajerio
                EmpresaMensajeria mensajero = new EuroTransport("0854752177");

                // Enviaremos un paquete vía aérea, que es la que esta empresa tiene pro defecto
                 mensajero.recogerPaquete();
                mensajero.enviarPaquete();
                mensajero.entregarPaquete();

                // Ahora le decimos a la empresa que queremos enviar por mar
                mensajero.setEnvio(new EnvioMar());
                mensajero.recogerPaquete();
                mensajero.enviarPaquete();
                mensajero.entregarPaquete();
        }
}
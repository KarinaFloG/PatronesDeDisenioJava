public class EnvioMar implements IEnvio{

        public void procesarEnvio(){
                System.out.println('El paquete se ha cargado en el barco.');
        }

        public void enviar(){
                System.out.println('El paquete va navegando por el mar.');
        }

        public void procesarEntrega(){
                System.out.println('El paquete se ha descargado en el puerto.');
         }
}
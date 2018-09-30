public class EuroTransport extends EmpresaMensajeria{

        private String nif;

        public EuroTransport(String nif){
                IEnvio envioPorDefecto = new EnvioAire();
                super(envioPorDefecto);
                this.nif=nif;
        }

        public EuroTransport(String nif, IEnvio envio){
                super(envio);
                this.nif=nif;
        }

        public void identificarse(){
                System.out.println("Identificación: "+this.nif);
        }

}
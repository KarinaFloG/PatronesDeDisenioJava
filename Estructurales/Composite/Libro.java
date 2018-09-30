public class Libro extends AbstractCompositor {
      private int costo = 0;
      private List<AbstractCompositor> listaComposicion;
      
      public Libro (){
          listaComposicion = new ArrayList<AbstractCompositor>();
      }
 
      public int getCosto() { 
          return this.costo;
      }
 
      public void agregarHoja(AbstractCompositor composicion){
          this.costo = this.costo + composicion.getCosto();
          this.listaComposicion.add(composicion);
      }
}
import java.util.ArrayList;
import java.util.List;
 
public class SuperTarea implements TareaProducto {
 	private List<TareaProducto> lista= new ArrayList<TareaProducto>();
     
    public void addTarea(TareaProducto tarea) {
        lista.add(tarea);
    }
    
    public void ejecutar(Producto producto) { 
        lista.forEach((t)->t.ejecutar(producto));
    }
 
}
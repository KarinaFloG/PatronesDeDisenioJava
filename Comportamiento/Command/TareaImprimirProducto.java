public class TareaImprimirProducto  implements TareaProducto{
    public void ejecutar(Producto producto) {
        System.out.println(producto.getNombre());
        System.out.println(producto.getId());
        System.out.println(producto.getPrecio());
    }
 
}
public class TareaEnvioCorreo implements TareaProducto{
    public void ejecutar(Producto producto) {
        System.out.println(producto.getNombre() +"enviado por correo") ;    
    }
 
}
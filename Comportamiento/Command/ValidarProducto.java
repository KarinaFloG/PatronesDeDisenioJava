public class ValidarProducto implements TareaProducto{
    
    public void ejecutar(Producto producto) {
    	if ((producto.getPrecio() == 100) & (lt == 100)){
         	System.out.println("producto valido");
    	}else{
       		System.out.println("producto invalido");
    	} 
    }
}
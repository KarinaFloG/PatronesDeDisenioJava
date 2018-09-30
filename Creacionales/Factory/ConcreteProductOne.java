public class ConcreteProductOne extends Product{

    public ConcreteProductOne(String nombre, String descripcion){
        setNombre(nomnbre);
        setDescripcion(descripcion);
    }

    public ConcreteProductOne(){
        setName("Producto uno");
        setDescription("Descripcion del producto uno");
    }

    public String getInformacion() {
        return "Nombre del producto: " + getNombre() + " , Descripcion: " + getDescripcion();
    }

}
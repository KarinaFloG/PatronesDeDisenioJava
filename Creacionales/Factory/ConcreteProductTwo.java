public class ConcreteProductTwo extends Product {

    public ConcreteProductTwo(String nombre, String descripcion){
        setNombre(nombre);
        setDescripcion(descripcion);
    }

    public ConcreteProductTwo(){
        setName("Producto Dos");
        setDescription("Descripcion del producto dos");
    }

    public String getInformacion() {
        return "Nombre del producto: " + getNombre() + " , Descripcion: " + getDescripcion();
    }


}
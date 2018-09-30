public class ConcreteFactoryTwo extends Factory{
    
    public Product crearProducto(String tipoProducto) {
        return new ConcreteProductTwo();
    }
}
public class ConcreteFactoryOne extends Factory{

    public Product crearProducto(String tipoProducto) {
        return new ConcreteProductoUno();
    }
}
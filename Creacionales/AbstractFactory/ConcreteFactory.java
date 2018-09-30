public class ConcreteFactoryOne extends AbstractFactory {
 
    public AbstractProductA crearProductA() {
        return new ProductAUno();
    }

 
    public AbstractProductB crearProductB() {
        return new ProductBUno();
    }
}
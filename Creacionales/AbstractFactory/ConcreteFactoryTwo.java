public class ConcreteFactoryTwo extends AbstractFactory{
    @Override
    public AbstractProductA crearProductA() {
        return new ProductADos();
    }

    @Override
    public AbstractProductB crearProductB() {
        return new ProductBDos();
    }
}
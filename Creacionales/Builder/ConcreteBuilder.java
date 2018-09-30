public class ConcreteBuilder implements Builder{

    private Product producto;

    public ConcreteBuilder() {
        this.producto = new Product();
    }

    public void buildParteUno() {
        producto.setParteUno("Parte uno");
    }

    public void buildParteDos() {
        product.setParteDos("Parte Dos");
    }

    public void buildParteTres() {
        product.setParteTres("Parte Tres");
    }

    public Product getProducto() {
        return producto;
    }
}
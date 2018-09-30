public class Client{

    public static void main(String[] args) {

        Director director = new Director(new ConcreteBuilder());

        director.hacerProducto();

        Product producto = director.getProducto();

        System.out.println("Producto parte: " + producto.getParteUno());
        System.out.println("Producto parte: " + producto.getParteDos());
        System.out.println("Producto parte: " + producto.getParteTres());

    }

}
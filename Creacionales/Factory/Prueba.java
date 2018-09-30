public class Prueba{

    public static void main(String[] args) {

        Factory factory;
        Product productoCreado;

        factory = new ConcreteFactoryOne();

        productoCreado= factory.crearProducto("Uno");

        if(productoCreado != null){
            System.out.println(productoCreado.getInformacion());
        }else{
            System.out.println("No product created.");
        }

        factory = new ConcreteFactoryTwo();

        productoCreado = factory.crearProducto("Dos");

        if(productoCreado != null){
            System.out.println(productoCreado.getInformacion());
        }else{
            System.out.println("NO SE CREO EL PRODUCTO");
        }


    }

}
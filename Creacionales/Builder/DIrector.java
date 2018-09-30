public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void hacerProducto(){
        builder.buildParteUno();
        builder.buildParteDos();
        builder.buildParteTres();
    }

    public Product getProducto(){
        return builder.getProducto();
    }
}
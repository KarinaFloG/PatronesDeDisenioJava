public class Main{
        public static void main(String [] args){

                // Creamos el arbol de expresiones y el contexto
                ArrayList tree = new ArrayList();
                Context context = new Context();

                // Añadimos los tokens pasados como argumentos
                for(String token : args){
                        if(context.getInteger(token) >= 0){
                                tree.add(new NumericExpression(token));
                        }else{
                                tree.add(new OperationExpression(token));
                        }
                }

                // Interpretamos cada expresión
                for(Expression e : tree){
                        e.interpret(context);
                }

                // Mostramos el resultado
                System.out.println("El resultado de la interpretación es " + context.getResult());
        }

}
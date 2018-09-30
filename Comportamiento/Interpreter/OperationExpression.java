public class OperationExpression implements Expression{
        private String operation;

        pubilc OperationExpression(String token){
                this.operator = token;
        }

        public interpret(Context context){
                context.setOperation(this.operation);
                context.calculate();
        }

}
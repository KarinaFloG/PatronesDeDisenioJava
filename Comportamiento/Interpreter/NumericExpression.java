public class NumericExpression implements Expression{
        private String value;

        public NumericExpression(String token){        {
                this.value = token;
        }

        public interpret(Context context){
                context.setOperator(context.getInteger(this.value));
                context.calculate();
        }
}

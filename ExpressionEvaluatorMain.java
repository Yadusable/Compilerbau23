public class ExpressionEvaluatorMain {

    public static void main(String[] args) throws Exception {
        compiler.Lexer lexer = new compiler.Lexer();
        compiler.ExpressionEvaluator exprEvaluator = new compiler.ExpressionEvaluator(lexer);
        int result = exprEvaluator.eval("4+ 5 -22 - 10");
        System.out.println(result);
    }

}
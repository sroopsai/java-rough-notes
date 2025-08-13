import java.util.function.Predicate;

public class InvalidLambdas {
    public static void main(String[] args) {
        // x,y -> x.startsWith("fish") Missing Parenthesis for parameter list
        // x -> {x.startsWith("camel");} Missing return statement on the right side
        // x -> {return x.startsWith("giraffe")} Missing semicolon on right side
        // String x -> x.endsWith("eagle") Missing parenthesis on left side
        
        // var invalid = (Animal a) -> a.canHop(); DOES NOT COMPILE, because var keyword relies on the context as well, 
        // based on right side the compiler going to resolve the type of invalid, compiler also relies on the right hand side to resolve type of functional interface, 
        // this leads to circular inference problem.
    }
}

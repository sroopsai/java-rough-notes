import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ValidLambdas {
    public static void main(String[] args) {
    
        // Valid Lambdas
        CheckTrait checkTrait = () -> true;
        Predicate<String> startsWith = x -> x.startsWith("test");
        Predicate<String> startsWithExplicitString = (String x) -> x.startsWith("test");
        BiPredicate<String, String> startsWithMultipleParameters = (String x, String y) -> x.startsWith("test");
        BiPredicate<String, String> startsWithMultipleParametersNoReturn = (x, y) -> x.startsWith("test");
    }
}

@FunctionalInterface
 interface CheckTrait {
 abstract boolean test();
    
}
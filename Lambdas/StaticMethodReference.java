public class StaticMethodReference {
    public static void main(String[] args) {
        Converter methodRef = Math::round;
        Converter lambda = x -> Math.round(x);
    }
    
}

interface Converter {

    long round(double num);
    
}

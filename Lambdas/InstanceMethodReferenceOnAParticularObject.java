public class InstanceMethodReferenceOnAParticularObject {
    public static void main(String[] args) {
        var str = "zoo";
        StringStart stringStart = x -> str.startsWith(x);
        StringStart methodRef = str::startsWith; 
    }
}

interface StringStart {

    boolean beginningCheck(String prefix);
    
}

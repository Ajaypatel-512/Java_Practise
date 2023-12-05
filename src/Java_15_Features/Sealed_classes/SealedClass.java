package Java_15_Features.Sealed_classes;

public sealed class SealedClass permits ThreeSeries,FiveSeries {

    /**
     * All the permitted subclasess must belong to the same module as that of sealed class
     * Every permitted subclass must explicitly extend the sealed class
     * Every permitted subclass must define a modifier : final, sealed, non-sealed
     * Reflection
     * The isSealed method return true if the given class or interface is sealed
     * Method permitted subclassess return an array of object representing all the permitted subclassess.
     * */

    public static void main(String[] args) {

    }
}

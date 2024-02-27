package core_java_made_easy.Java_17_Features.Switch;

public class SwitchDemo {

    public static double getPerimeter(Shape shape){
//        if (shape instanceof Circle c){
//            return 2*Math.PI * c.radius();
//        } else if (shape instanceof Rectangle r){
//            return 2 * r.length() * r.width();
//        } else {
//            throw new IllegalArgumentException();
//        }

        return switch (shape){
            case Circle c -> 2 * Math.PI * c.radius();
            case Rectangle r ->  2 * r.length() * r.width();
            default -> throw new IllegalStateException("Unexpected value: " + shape);
        };
    }

    public static void testNullSupport(Object obj){
        switch (obj){
            case String s -> System.out.println(s);
            case null -> System.out.println("Null");
            default -> System.out.println("Default");
        }
    }


    public static void main(String[] args) {
        double perimeter = getPerimeter(new Circle(1));
        System.out.println(perimeter);

        testNullSupport(null);
    }
}

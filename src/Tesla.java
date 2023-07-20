public class Tesla extends Car {
    public static void tesla() {

    }

    public static void tesla(String model) {
        System.out.println(model);
    }

    public Tesla() {
    }

    public Tesla(String name, String color) {
        super(name, color);
    }

    @Override
    public String toString() {
        return "Tesla{}";
    }

}
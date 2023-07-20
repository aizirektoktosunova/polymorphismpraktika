public class BMW extends Car{
    public static void bmw(){

    }
    public static void bmw(String model){
        System.out.println(model);
    }

    public BMW() {
    }

    public BMW(String name, String color) {
        super(name, color);
    }

    @Override
    public String toString() {
        return "BMW{}";
    }
}

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("CarName ","CarColor");
        Car tayota = new Tayota("Tayota "," white");
        Car bmw = new BMW("BMW ","black");
        Car tesla = new Tesla("Tesla ","blue");
  Car []cars={car,tayota,bmw,tesla};
        for (Car cars1 : cars) {
            System.out.println(cars1.getClass());
        }

    }
}
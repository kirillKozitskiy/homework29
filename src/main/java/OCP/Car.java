package OCP;

public class Car implements Vehicle {
    @Override
    public void starTheEngine() {
        System.out.println("Car started on engine");
    }
}

package OCP;

public class Test {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.starTheEngine();

        Vehicle helicopter = new Helicopter();
        helicopter.starTheEngine();
    }
}

package HW29.LSP;

public class Test {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.survive();
        tiger.killToEat();

        Elephant elephant = new Elephant();
        elephant.pickFromTreeToEat();
        elephant.survive();
    }
}

package HW29.LSP;

public class Elephant implements Herbivorous{

    @Override
    public void pickFromTreeToEat() {
        System.out.println("Elephant picks from tree to eat");
    }

    @Override
    public void survive() {
        System.out.println("Elephant survive");
    }
}

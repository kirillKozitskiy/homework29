package LSP;

public class Tiger implements Animal, Predator{

    @Override
    public void survive() {
        System.out.println("Tiger survive");
    }

    @Override
    public void killToEat() {
        System.out.println("Tiger kill to eat");
    }
}

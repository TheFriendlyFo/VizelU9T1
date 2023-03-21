public class Dog extends Animal {
    private boolean hasBeenWalked;
    private final int snoutLength;

    public Dog(String name, int age, boolean isVaccinated, boolean isNeutered, int snoutLength) {
        super(name, age, isVaccinated, isNeutered);
        this.hasBeenWalked = false;
        this.snoutLength = snoutLength;
    }

    public void walk() {
        System.out.println("Doggo walked");
        hasBeenWalked = true;
    }

    public void bite() {
        System.out.println("OW");
    }

    public boolean isHasBeenWalked() {
        return hasBeenWalked;
    }

    public int getSnoutLength() {
        return snoutLength;
    }
}

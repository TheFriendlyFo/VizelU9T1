public class Cat extends Animal {
    private final int whiskerLength;
    private boolean hasPlayedWith;

    public Cat(String name, int age, boolean isVaccinated, boolean isNeutered, int whiskerLength) {
        super(name, age, isVaccinated, isNeutered);
        this.whiskerLength = whiskerLength;
        this.hasPlayedWith = false;
    }

    public void play() {
        hasPlayedWith = true;
        System.out.println("WHEEEEE");
    }

    public void scratch() {
        System.out.println("SCRATCH");
    }

    public int getWhiskerLength() {
        return whiskerLength;
    }

    public boolean isHasPlayedWith() {
        return hasPlayedWith;
    }
}

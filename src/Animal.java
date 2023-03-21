public class Animal {
    protected final String name;
    protected int age;
    protected boolean isVaccinated;
    protected boolean isNeutered;

    protected Animal(String name, int age, boolean isVaccinated, boolean isNeutered) {
        this.name = name;
        this.age = age;
        this.isVaccinated = isVaccinated;
        this.isNeutered = isNeutered;
    }

    public void adopt() {
        System.out.println("I have been adopted");
    }

    public void feed() {
        System.out.println("NUTRITION");
    }

    public void neuter() {
        this.isNeutered = true;
        System.out.println("SNIP");
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public boolean isNeutered() {
        return isNeutered;
    }
}

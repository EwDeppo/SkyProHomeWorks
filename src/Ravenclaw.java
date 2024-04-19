public class Ravenclaw extends Hogwarts {
    private final int smart;
    private final int wisdom;
    private final int wit;
    private final int creation;

    public Ravenclaw(String name, int magicForce, int transgression, int smart, int wisdom, int wit, int creation) {
        super(name, magicForce, transgression);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public String toString() {
        return super.toString() +
                "smart=" + smart +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                '}';
    }

    public int getSmart() {
        return smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    public static void comparePropertiesPavenclaw(Ravenclaw firstRavenclaw, Ravenclaw secondRavenclaw) {
        int sumOfPropertiesFirst = firstRavenclaw.getCreation() + firstRavenclaw.getSmart() + firstRavenclaw.getWit() + firstRavenclaw.getWisdom() + firstRavenclaw.getMagicForce() + firstRavenclaw.getTransgression();
        int sumOfPropertiesSecond = secondRavenclaw.getCreation() + secondRavenclaw.getSmart() + secondRavenclaw.getWit() + secondRavenclaw.getWisdom() + secondRavenclaw.getMagicForce() + secondRavenclaw.getTransgression();
        if (sumOfPropertiesFirst > sumOfPropertiesSecond) {
            System.out.println(firstRavenclaw.getName() + " лучший Когтевранец, чем " + secondRavenclaw.getName());
        } else if (sumOfPropertiesSecond > sumOfPropertiesFirst) {
            System.out.println(secondRavenclaw.getName() + " лучший Когтевранец, чем " + firstRavenclaw.getName());
        } else {
            System.out.println(firstRavenclaw.getName() + " такой же Когтевранец, как и " + secondRavenclaw.getName());
        }
    }
}

public class Griffindir extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Griffindir(String name, int magicForce, int transgression, int nobility, int honor, int bravery) {
        super(name, magicForce, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public static void comparePropertiesGriffindir(Griffindir firstGriffindir, Griffindir secondGriffindir) {
        int sumOfPropertiesFirst = firstGriffindir.getNobility() + firstGriffindir.getHonor() + firstGriffindir.getBravery();
        int sumOfPropertiesSecond = secondGriffindir.getNobility() + secondGriffindir.getHonor() + secondGriffindir.getBravery();
        if (sumOfPropertiesFirst > sumOfPropertiesSecond) {
            System.out.println(firstGriffindir.getName() + " лучший Грифиндорец, чем " + secondGriffindir.getName());
        } else if (sumOfPropertiesFirst < sumOfPropertiesSecond) {
            System.out.println(secondGriffindir.getName() + " лучший Грифиндорец, чем " + firstGriffindir.getName());
        } else {
            System.out.println(firstGriffindir.getName() + " такой же Грифиндорец, как и " + secondGriffindir.getName());
        }
    }
}

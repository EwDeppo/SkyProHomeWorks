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
        return ", Благородство: " + nobility +
                ", Честь: " + honor +
                ", Храбрость: " + bravery +
                '.';
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

    public void comparePropertiesGriffindir(Griffindir firstGriffindir, Griffindir secondGriffindir) {
        int sumOfPropertiesFirst = firstGriffindir.getNobility() + firstGriffindir.getBravery() + firstGriffindir.getHonor();
        int sumOfPropertiesSecond = secondGriffindir.getNobility() + secondGriffindir.getBravery() + secondGriffindir.getHonor();
        if (sumOfPropertiesFirst > sumOfPropertiesSecond) {
            System.out.println(firstGriffindir.getName() + " лучший Гриффиндорец, чем " + secondGriffindir.getName());
        } else if (sumOfPropertiesFirst < sumOfPropertiesSecond) {
            System.out.println(firstGriffindir.getName() + " лучший Гриффиндорец, чем " + secondGriffindir.getName());
        } else {
            System.out.println(firstGriffindir.getName() + " такой же Гриффиндорец, как и " + secondGriffindir.getName());
        }
    }
}

public class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int lustForPower;

    public Slytherin(String name, int magicForce, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicForce, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public static void comparePropertiesSlytherin(Slytherin firstSlytherin, Slytherin secondSlytherin) {
        int sumOfPropertiesFirst = firstSlytherin.getAmbition() + firstSlytherin.getCunning() + firstSlytherin.getDetermination() + firstSlytherin.getLustForPower() + firstSlytherin.getResourcefulness();
        int sumOfPropertiesSecond = secondSlytherin.getAmbition() + secondSlytherin.getCunning() + secondSlytherin.getDetermination() + secondSlytherin.getLustForPower() + secondSlytherin.getResourcefulness();
        if (sumOfPropertiesFirst > sumOfPropertiesSecond) {
            System.out.println(firstSlytherin.getName() + " лучший Слизеринец, чем " + secondSlytherin.getName());
        } else if (sumOfPropertiesSecond > sumOfPropertiesFirst) {
            System.out.println(secondSlytherin.getName() + " лучший Слизеринец, чем " + firstSlytherin.getName());
        } else {
            System.out.println(firstSlytherin.getName() + " такой же Слизеринец, как и " + secondSlytherin.getName());
        }
    }
}

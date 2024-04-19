abstract public class Hogwarts {
    private final String name;
    private final int magicForce;
    private final int transgression;

    public Hogwarts(String name, int magicForce, int transgression) {
        this.name = name;
        this.magicForce = magicForce;
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magicForce=" + magicForce +
                ", transgression=" + transgression +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getMagicForce() {
        return magicForce;
    }

    public int getTransgression() {
        return transgression;
    }


    public static void comparePropertiesStudents(Hogwarts firstStudent, Hogwarts secondStudent) {
        int sumOfPropertiesFirst = firstStudent.getMagicForce() + firstStudent.getTransgression();
        int sumOfPropertiesSecond = secondStudent.getMagicForce() + secondStudent.getTransgression();
        if (sumOfPropertiesFirst > sumOfPropertiesSecond) {
            System.out.println(firstStudent.getName() + " обладает большей мощностью магии, чем " + secondStudent.getName());
        } else if (sumOfPropertiesFirst < sumOfPropertiesSecond) {
            System.out.println(firstStudent.getName() + " обладает меньшей мощностью магии, чем " + secondStudent.getName());
        } else {
            System.out.println(firstStudent.getName() + " обладет такой же мощностью магии, как и " + secondStudent.getName());
        }
    }

}

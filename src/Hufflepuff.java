public class Hufflepuff extends Hogwarts {
    private final int hardWork;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, int magicForce, int transgression, int hardWork, int loyalty, int honesty) {
        super(name, magicForce, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                "hardWork=" + hardWork +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public static void comparePropertiesHufflepuff(Hufflepuff firstHufflepuff, Hufflepuff secondHufflepuff) {
        int sumOfPropertiesFirst = firstHufflepuff.getHardWork() + firstHufflepuff.getLoyalty() + firstHufflepuff.getHonesty();
        int sumOfPropertiesSecond = secondHufflepuff.getHardWork() + secondHufflepuff.getLoyalty() + secondHufflepuff.getHonesty();
        if (sumOfPropertiesFirst > sumOfPropertiesSecond) {
            System.out.println(firstHufflepuff.getName() + " лучший Пуффиндуец, чем " + secondHufflepuff.getName());
        } else if (sumOfPropertiesFirst < sumOfPropertiesSecond) {
            System.out.println(secondHufflepuff.getName() + " лучший Пуффиндуец, чем " + firstHufflepuff.getName());
        } else {
            System.out.println(firstHufflepuff.getName() + " такой же Пуффиндуец, как и " + secondHufflepuff.getName());
        }
    }
}

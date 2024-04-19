public class Main {

    public static void main(String[] args) {
        Griffindir harryPotter = new Griffindir("Harry Potter", 30, 20, 70, 75, 80);
        Griffindir hermioneGranger = new Griffindir("Hermione Granger", 40, 35, 50, 55, 60);
        Griffindir ronaldWeasleyonald = new Griffindir("Ronald Weasley", 25, 15, 49, 55, 70);
        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 30, 18, 65, 75, 80);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 25, 22, 70, 55, 70);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 30, 19, 60, 71, 56);
        Ravenclaw choChang = new Ravenclaw("Cho Chang", 32, 25, 65, 55, 70, 65);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 35, 26, 50, 65, 74, 60);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 26, 26, 50, 65, 55, 65);
        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 28, 23, 55, 65, 60, 65, 70);
        Slytherin grahamMontague = new Slytherin("Graham Montague", 15, 19, 50, 55, 60, 63, 80);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 30, 25, 60, 45, 50, 65, 77);
        System.out.println(ronaldWeasleyonald);
        System.out.println(justinFinchFletchley);
        System.out.println(choChang);
        System.out.println(gregoryGoyle);
        Griffindir.comparePropertiesGriffindir(harryPotter, hermioneGranger);
        Hufflepuff.comparePropertiesHufflepuff(zachariasSmith, cedricDiggory);
        Ravenclaw.comparePropertiesPavenclaw(choChang, marcusBelby);
        Slytherin.comparePropertiesSlytherin(grahamMontague, dracoMalfoy);
        Hogwarts.comparePropertiesStudents(dracoMalfoy, padmaPatil);
    }
}

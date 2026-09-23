package Week4_5;

public class Downcasting {
    public static void main(String[] args) {

        Cat21 cat = new Cat21();

        // Upcasting - automatic
        AnimalNotAbstract animal = cat;

        // Downcasting - manual
        Cat21 catAgain = (Cat21) animal;

        catAgain.makeCatSound();
    }
}

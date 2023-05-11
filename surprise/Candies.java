package surprise;
import java.util.Random;

public class Candies implements ISurprise{
    private int num;
    private String type;

    private static Random randomGenerator = new Random();

    private static String[] typeOfCandies = {"chocolate", "jelly", "fruits", "vanilla"};

    public Candies(int num, String type) {
        this.num = num;
        this.type = type;
    }

    @Override
    public void enjoy() {
        System.out.println("You received " + this.num + " " + this.type + " candies.");
    }

    @Override
    public String toString() {
        return "[Candies] number = " + this.num + ", type = " + this.type;
    }

    public static Candies generate() {
        return new Candies(Candies.randomGenerator.nextInt(9) + 1, Candies.typeOfCandies[Candies.randomGenerator.nextInt(Candies.typeOfCandies.length)]);
    }

    public static void main(String[] args){
        Candies c1 = Candies.generate();
        c1.enjoy();

        Candies c2 = Candies.generate();
        c2.enjoy();

        Candies c3 = Candies.generate();
        c3.enjoy();
    }
}

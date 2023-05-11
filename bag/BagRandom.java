package bag;
import surprise.ISurprise;
import java.util.ArrayList;
import java.util.Random;

import surprise.FortuneCookie;
public class BagRandom implements IBag {
    private ArrayList<ISurprise> surprises;

    BagRandom() {
        this.surprises = new ArrayList<ISurprise>();
    }

    @Override
    public void put(ISurprise newSurprise) {
        this.surprises.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        for(int i = 0; i < bagOfSurprises.size(); i++){
            this.put(bagOfSurprises.takeOut());
        }
    }

    @Override
    public ISurprise takeOut() {
        Random random = new Random();
        return this.surprises.remove(random.nextInt(this.surprises.size()));
    }

    @Override
    public boolean isEmpty() {
        return this.surprises.isEmpty();
    }

    @Override
    public int size() {
        return this.surprises.size();
    }

    public static void main(String[] args){
        BagRandom bag = new BagRandom();
        ISurprise s1 = FortuneCookie.generate();

        System.out.println(bag.isEmpty());
        System.out.println(bag.size());
        bag.put(s1);
        bag.put(s1);

        System.out.println(bag.isEmpty());
        System.out.println(bag.size());

        bag.takeOut();
        bag.takeOut();

        System.out.println(bag.isEmpty());
        System.out.println(bag.size());
    }
}

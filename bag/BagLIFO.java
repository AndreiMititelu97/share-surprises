package bag;
import surprise.*;
import java.util.ArrayList;

public class BagLIFO implements IBag{
    private ArrayList<ISurprise> surprises;

    BagLIFO() {
        this.surprises = new ArrayList<ISurprise>();
    }

    @Override
    public void put(ISurprise newSurprise) {
        this.surprises.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        while(!bagOfSurprises.isEmpty()){
            this.put(bagOfSurprises.takeOut());
        }
    }

    @Override
    public ISurprise takeOut() {
        return this.surprises.remove(this.surprises.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return this.surprises.isEmpty();
    }

    @Override
    public int size() {
        return this.surprises.size();
    }

    @Override
    public String toString(){
        return this.surprises.toString();
    }

    public static void main(String[] args){
        IBag bag = new BagLIFO();
        IBag bag2 = new BagLIFO();

        ISurprise s1 = Candies.generate();
        ISurprise s2 = FortuneCookie.generate();
        ISurprise s3 = MinionToy.generate();
        ISurprise s4 = FortuneCookie.generate();

        bag.put(s1);
        bag.put(s2);
        bag.put(s3);
        bag.put(s4);

        bag2.put(bag);
        System.out.println(bag);
        System.out.println(bag2);
        System.out.println(bag.isEmpty());
        System.out.println(bag.size());





    }
}

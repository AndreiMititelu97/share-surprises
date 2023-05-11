package bag;
import surprise.FortuneCookie;
import surprise.ISurprise;
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
        for(int i = 0; i < bagOfSurprises.size(); i++){
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

        ISurprise s1 = FortuneCookie.generate();
        ISurprise s2 = FortuneCookie.generate();
        ISurprise s3 = FortuneCookie.generate();
        ISurprise s4 = FortuneCookie.generate();

        System.out.println(bag);

        bag.put(s1);
        bag.put(s2);
        bag.put(s3);
        bag.put(s4);

        System.out.println(bag.isEmpty());
        System.out.println(bag.size());
        System.out.println(bag);

        bag.takeOut();
        bag.takeOut();
        System.out.println(bag);


    }
}

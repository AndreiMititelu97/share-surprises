import give.*;
import bag.*;
import surprise.*;
public class Main {
    public static void main(String[] args){
        GiveSurpriseAndHug g1 = new GiveSurpriseAndHug("FIFO", 0); //construct GiveSurpriseAndHug FIFO 0

        IBag BagLIFO = BagFactory.getInstance().makeBag("LIFO");
        BagLIFO.put(GatherSurprises.gather());
        BagLIFO.put(GatherSurprises.gather());
        BagLIFO.put(GatherSurprises.gather());
        BagLIFO.put(GatherSurprises.gather());
        System.out.println(BagLIFO.size());

        g1.put(GatherSurprises.gather());
        g1.put(GatherSurprises.gather());
        System.out.println(g1.isEmpty());
        g1.give();
        g1.put(BagLIFO);
        System.out.println(BagLIFO.size());
        g1.giveAll();
        System.out.println(g1.isEmpty());

    }
}

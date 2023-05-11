package give;

import bag.BagFactory;
import surprise.GatherSurprises;
import bag.IBag;

public class GiveSurpriseAndHug extends AbstractGiveSurprises {
    public GiveSurpriseAndHug(String bagType, int waitTime){
        super(bagType, waitTime);
    }
    @Override
    public void giveWithPassion(){
        System.out.println("Singing a nice song, full of joy and genuine excitement...");
    }
}

package give;

import bag.BagFactory;
import bag.IBag;
import surprise.ISurprise;
import surprise.GatherSurprises;
import java.util.concurrent.TimeUnit;
public abstract class AbstractGiveSurprises {
    protected IBag myBag;
    protected int waitTime;

    public AbstractGiveSurprises(String bagType, int waitTime){
        this.waitTime = waitTime;
        myBag = BagFactory.getInstance().makeBag(bagType);
    }

    public void put(ISurprise newSurprise){
        myBag.put(newSurprise);
    }
    public void put(IBag surprises) {
        myBag.put(surprises);
    }

    public void give(){
        ISurprise gift = myBag.takeOut();
        giveWithPassion();
    }

    public void giveAll(){
        for(int i = 0; i < myBag.size(); i++){
            ISurprise gift = myBag.takeOut();
            giveWithPassion();

            // Sleep for X seconds - code snippet
            try {
                TimeUnit.SECONDS.sleep(this.waitTime); // number of seconds to sleep
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public boolean isEmpty(){
        return myBag.isEmpty();
    }

    protected abstract void giveWithPassion();

}


package bag;

public class BagFactory implements IBagFactory{
    private BagFactory() {}

    public static BagFactory getInstance() {
        return new BagFactory();
    }

    @Override
    public IBag makeBag(String type) {
       if(type.equals("RANDOM")){
           return new BagRandom();
       } else if (type.equals("FIFO")){
           return new BagFIFO();
       } else {
           return new BagLIFO();
       }
    }
    public static void main(String[] args){
        BagFactory a = new BagFactory();
        a.makeBag("RANDOM");
        System.out.println(a);

        System.out.println(BagFactory.getInstance().makeBag("RANDOM"));
    }
}

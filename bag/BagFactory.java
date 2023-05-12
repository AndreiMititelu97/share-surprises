package bag;

public class BagFactory implements IBagFactory{
    private BagFactory() {}

    private static final BagFactory factory = new BagFactory();

    public static BagFactory getInstance() {
        return factory;
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
        IBag a = BagFactory.getInstance().makeBag("LIFO");
        System.out.println(a);

    }
}

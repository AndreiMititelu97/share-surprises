package bag;

public interface IBagFactory {
    // Create a new container, according to the specified type
    //"RANDOM"; "FIFO"; "LIFO"
    IBag makeBag(String type);
}

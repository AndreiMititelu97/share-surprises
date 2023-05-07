package surprise;

public class Saying {
    private String message;
    private String author;

    public Saying(String message, String author){
        this.message = message;
        this.author = author;
    }

    public String getMessage(){
        return this.message;
    }

    public String getAuthor(){
        return this.author;
    }
}


public class Book {
    //Attributes
    private String title;

    //Methods
    public Book(String title) {
        this.title = title;
        System.out.println("Book " + this.title + " created.");
    }

    public String toString() {
        return this.title;
    }

    public String getTitle() {
        return this.title;
    }
}

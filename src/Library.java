import java.util.ArrayList;
import java.util.List;

public class Library {
    //Attributes
    private static int counter;
    private List<Book> bookList = new ArrayList<>();

    //Constructors
    public Library() {
        System.out.println("Hello, I am a library, which can store up to 10 books!");
    }

    //Methods
    public void add(Book book) {
        if(counter > 10) {
            System.out.println("The library is full!");
        } else {
            bookList.add(book);
            System.out.println("I added the book " + book.getTitle() + "!");
            counter++;
        }

    }

    public Book search(String title) {
        int i = 0;
        for(Book b : this.bookList){
            if(title == this.bookList.get(i).getTitle()) {
                System.out.println("The book with the title " + title +
                " exists in the library!");
                return this.bookList.get(i);
            }
            i++;
        }
        System.out.println("The book with the title " + title +
                " does not exist in the library!");
        return null;
    }

}

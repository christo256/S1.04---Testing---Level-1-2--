package task1_S1_04_Testing_Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {

    private List<String> books;

    public Library () {
        this.books = new ArrayList<>();
    }

    public List<String> getBooks() {
        return new ArrayList<>(books);
    }
public void addBook(String title){
    if (!books.contains(title)){
        books.add(title);
        Collections.sort(books);
        }
    }

    public void addBookPosition(String title, int position) {
        if (!books.contains(title)) {
            books.add(position, title);
        }
    }

        public String getAddBookPosition(int index) {
            return books.get(index);
        }

        public void removeBook(String title) {
        books.remove(title);
        Collections.sort(books);




    }

}

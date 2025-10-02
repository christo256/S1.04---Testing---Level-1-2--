package task1_S1_04_Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public List<String> getBooks() {
        List<String> titles = new ArrayList<>();
        for (Book book : books) {
            titles.add(book.getTitle());
        }
        return Collections.unmodifiableList(titles);
    }

    public void addBook(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Book title cannot be null or empty");
        }
        Book newBook = new Book(title);
        if (books.contains(newBook)) {
            throw new IllegalArgumentException("Book with title '" + title + "' already exists");
        } else books.add(newBook);
        sortBooks();
    }

    public String getBookTitleAtPosition(int position) {
        if (position < 0 || position >= books.size()) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        return books.get(position).getTitle();
    }

    public void removeBook(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Book title cannot be null or empty");
        }
        Book bookToRemove = new Book(title);
        boolean removed = books.remove(bookToRemove);
        if (!removed) {
            throw new IllegalArgumentException("Book with title '" + title + "' not found");
        }
        sortBooks();
    }

    private void sortBooks() {
        Collections.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
    }
}

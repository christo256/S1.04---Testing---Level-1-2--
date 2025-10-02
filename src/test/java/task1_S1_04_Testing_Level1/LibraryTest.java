package task1_S1_04_Testing_Level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task1_S1_04_Level1.Book;
import task1_S1_04_Level1.Library;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testBooksListIsNotNullAfterCreation() {
        List<String> books = library.getBooks();
        assertNotNull(books, "Books list should not be null after Library creation");
    }

    @Test
    public void testAddBooksIncreasesListSize() {
        library.addBook(new Book("Harry Potter"));
        library.addBook(new Book("La caida de los gigantes"));
        assertEquals(2, library.getBooks().size(), "Books list size should be 2 after adding two books");
    }

    @Test
    public void testBookIsInCorrectPosition() {
        library.addBook((new Book("First Book")));
        library.addBook(new Book("Second Book"));
        assertEquals("First Book", library.getBooks().get(0), "First book should be 'First Book'");
        assertEquals("Second Book", library.getBooks().get(1), "Second book should be 'Second Book'");
    }

    @Test
    public void testNonDuplicateBookTitles() {
        library.addBook((new Book("UniqueBook")));
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            library.addBook(new Book("UniqueBook"));
        });
        String expectedMessage = "already exists";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testGetBookTitleByPosition() {
        library.addBook(new Book("Book A"));
        library.addBook(new Book("Book B"));
        library.getBookTitleAtPosition(1);
        assertEquals("Book B", library.getBookTitleAtPosition(1), "Book at position 1 should be 'Book B'");
    }

    @Test
    public void testAddBookModifiesList() {
        library.addBook(new Book("New Book"));
        assertEquals(1, library.getBooks().size(), "List size should be 1 after adding a book");
        assertTrue(library.getBooks().contains("New Book"), "List should contain the new book");
    }

    @Test
    public void testRemoveBookDecreasesListSize() {
        library.addBook(new Book("Book 1"));
        library.addBook(new Book("Book 2"));
        library.removeBook(new Book("Book 1"));
        assertEquals(1, library.getBooks().size(), "List size should be 1 after removing a book");
        assertFalse(library.getBooks().contains("Book 1"), "List should no longer contain the removed book");
    }

    @Test
    public void testListIsSortedAfterAddRemove() {
        library.addBook(new Book("The house"));
        library.addBook(new Book("Angus"));
        library.addBook(new Book("Ouija"));
        library.addBook(new Book("Mars"));
        assertEquals("Angus", library.getBooks().get(0));
        assertEquals("Mars", library.getBooks().get(1));
        assertEquals("Ouija", library.getBooks().get(2));
        assertEquals("The house", library.getBooks().get(3));

        library.removeBook(new Book("Book 1"));
        assertEquals("Angus", library.getBooks().get(0));
        assertEquals("Ouija", library.getBooks().get(1));
        assertEquals("The house", library.getBooks().get(2));
    }
}

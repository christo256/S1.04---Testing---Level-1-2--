package task1_S1_04_Testing_Level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        library.addBook("Harry Potter");
        library.addBook("La caida de los gigantes");
        assertEquals(2, library.getBooks().size(), "Books list size should be 2 after adding two books");
    }

    @Test
    public void testBookIsInCorrectPosition() {
        library.addBook(("First Book"));
        library.addBook("Second Book");
        assertEquals("First Book", library.getBooks().get(0), "First book should be 'First Book'");
        assertEquals("Second Book", library.getBooks().get(1), "Second book should be 'Second Book'");
    }

    @Test
    public void testNonDuplicateBookTitles() {
        library.addBook(("UniqueBook"));
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            library.addBook("UniqueBook");
        });
        String expectedMessage = "already exists";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testGetBookTitleByPosition() {
        library.addBook("Book A");
        library.addBook("Book B");
        library.getBookTitleAtPosition(1);
        assertEquals("Book B", library.getBookTitleAtPosition(1), "Book at position 1 should be 'Book B'");
    }

    @Test
    public void testAddBookModifiesList() {
        library.addBook("New Book");
        assertEquals(1, library.getBooks().size(), "List size should be 1 after adding a book");
        assertTrue(library.getBooks().contains("New Book"), "List should contain the new book");
    }

    @Test
    public void testRemoveBookDecreasesListSize() {
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.removeBook("Book 1");
        assertEquals(1, library.getBooks().size(), "List size should be 1 after removing a book");
        assertFalse(library.getBooks().contains("Book 1"), "List should no longer contain the removed book");
    }

    @Test
    public void testListIsSortedAfterAddRemove() {
        library.addBook("The house");
        library.addBook("Angus");
        library.addBook("Ouija");
        library.addBook("Mars");
        assertEquals("Angus", library.getBooks().get(0));
        assertEquals("Mars", library.getBooks().get(1));
        assertEquals("Ouija", library.getBooks().get(2));
        assertEquals("The house", library.getBooks().get(3));

        library.removeBook("Mars");
        assertEquals("Angus", library.getBooks().get(0));
        assertEquals("Ouija", library.getBooks().get(1));
        assertEquals("The house", library.getBooks().get(2));
    }
}

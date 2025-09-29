package task1_S1_04_Level1;

import java.util.Objects;

public class Book {
    private final String title;


    public Book(String title) {

        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title can't be null or empty");
        }
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;
        return Objects.equals(title, other.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return title;
    }
}


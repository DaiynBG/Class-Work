import java.util.ArrayList;

class LibraryItem {
    protected String title;
    protected String author;
    protected boolean isAvailable;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public void checkOut() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("Item is already checked out.");
        }
    }

    public void returnItem() {
        isAvailable = true;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author;
    }
}

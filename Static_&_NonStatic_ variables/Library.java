public class Library {

    static String libraryName = "Central Library"; // static variable
    String bookTitle = "Java Programming"; // non-static variable

    public static void main(String[] args) {
        System.out.println("Library Name: " + Library.libraryName);

        Library lib = new Library();
        System.out.println("Book Title: " + lib.bookTitle);
    }
}
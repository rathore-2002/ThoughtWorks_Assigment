public class TestBook {
    public static void main(String[] args) {
        Author author = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(author);  // Author's toString()

        Book dummyBook = new Book("Java for dummy", author, 19.95, 99);  // Test Book's Constructor
        System.out.println(dummyBook);  // Test Book's toString()

        // Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        // Use an anonymous instance of Author to construct a Book instance
        Book anotherBook = new Book("more Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);  // toString()

        // Printing the name and email of the author from a Book instance.
        System.out.println("Author name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author email is: " + dummyBook.getAuthor().getEmail());
        System.out.println("Author gender is: " + dummyBook.getAuthor().getGender());

        // Getting Author details by calling  getAuthorName(), getAuthorEmail(), getAuthorGender() in the Book class.
        System.out.println("Author name is: " + dummyBook.getAuthorName());
        System.out.println("Author email is: " + dummyBook.getAuthorEmail());
        System.out.println("Author gender is: " + dummyBook.getAuthorGender());
    }


}

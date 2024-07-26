public class TestAuthor {

    public static void main(String[] args) {
        Author author = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(author);
        author.setEmail("paulTan@nowhere.com");
        System.out.println("name is: " + author.getName());
        System.out.println("email is: " + author.getEmail());
        System.out.println("gender is: " + author.getGender());
    }
}

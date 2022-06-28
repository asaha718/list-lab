import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getBookInput();
    }

    public static void getBookInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            String title = "";
            String genre = "";
            Integer numberOfPages = 0;
            System.out.println("Add a Book");

            System.out.print("Enter title: ");
            title = scanner.nextLine();
            System.out.print("Enter the Genre: ");
            genre = scanner.nextLine();

            System.out.print("Please enter the number of pages: ");
            numberOfPages = scanner.nextInt();
            scanner.nextLine();

            Book book = new Book(title, genre, numberOfPages);
            Library.addBook(book);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

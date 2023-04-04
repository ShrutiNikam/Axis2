public class AdultUser implements LibraryUser
{
    int age;
    String bookType;

    // Constructor for AdultUser class
    AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    // Method to register account for adult users
    public void registerAccount() {
        if(age > 12) {
            System.out.println("You have successfully registered under an Adult Account");
        }
        else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    // Method to request book for adult users
    public void requestBook() {
        if(bookType.equals("Fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        }
        else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}


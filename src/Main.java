// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Phones john = new Phones("John", "1234567890");
        Emails johnny = new Emails("jonny", "johnny@johnmail.john");
        john.contact();
        johnny.contact();
    }
}

abstract class Contacts{
    private String name;

    public Contacts(String name) {
        this.name = name;
    }

    public abstract void contact();
}
class Emails extends Contacts{
    private String email;

    public Emails(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    public void contact() {
        System.out.println("Emailing " + this.email);
    }
}

class Phones extends Contacts{
    private String phoneNumber;

    public Phones(String name, String phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void contact() {
        System.out.println("Calling " + this.phoneNumber);
    }
}
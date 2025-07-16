import java.time.LocalDate;

/* ------------- Employee class ------------- */
class Employee {
    int id;                // primitive
    String name;           // reference
    double salary;         // primitive

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

/* ------------- BankAccount class ------------- */
class BankAccount {
    long accountNumber;    // primitive long
    double balance;        // primitive
    Employee owner;        // reference to Employee object

    BankAccount(long accountNumber, Employee owner) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = 0.0;
    }

    void deposit(double amount) { balance += amount; }
}

/* ------------- Book class (Library) ------------- */
class Book {
    String title;
    String author;
    LocalDate dueDate;     // java.time reference type

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

/* ------------- Main demo ------------- */
public class DataTypesDemo {
    public static void main(String[] args) {

        Employee emp = new Employee(101, "Asha", 50_000.00);
        BankAccount acct = new BankAccount(1234567890L, emp);
        acct.deposit(20_000);

        Book book = new Book("Clean Code", "Robert C. Martin");
        book.dueDate = LocalDate.now().plusWeeks(2);

        System.out.println("Employee: " + emp.name);
        System.out.println("Account Balance: ₹" + acct.balance);
        System.out.println("Issued Book: " + book.title +
                           " (due " + book.dueDate + ")");
    }
}

// Main class is public
public class AccessModifierExample {

    // static variable (shared among all objects)
    static int staticCount = 0;

    // final variable (constant, value can't be changed)
    final int finalId;

    // private variable (accessible only inside this class)
    private String privateMessage = "This is PRIVATE.";

    // default variable (no modifier, accessible only within same package)
    String defaultMessage = "This is DEFAULT (package-private).";

    // protected variable (accessible in same package or subclass)
    protected String protectedMessage = "This is PROTECTED.";

    // public variable (accessible from anywhere)
    public String publicMessage = "This is PUBLIC.";

    // Constructor
    public AccessModifierExample(int id) {
        finalId = id; // final can be assigned once (here in constructor)
        staticCount++; // static variable incremented
    }

    // private method (only this class can call it)
    private void showPrivateMessage() {
        System.out.println(privateMessage);
    }

    // default method (accessible within same package)
    void showDefaultMessage() {
        System.out.println(defaultMessage);
    }

    // protected method (accessible in subclass or same package)
    protected void showProtectedMessage() {
        System.out.println(protectedMessage);
    }

    // public method (accessible from anywhere)
    public void showPublicMessage() {
        System.out.println(publicMessage);
    }

    // Method to show all messages using access modifiers
    public void showAllMessages() {
        showPrivateMessage();
        showDefaultMessage();
        showProtectedMessage();
        showPublicMessage();
        System.out.println("Final ID: " + finalId);
        System.out.println("Static Count: " + staticCount);
    }

    // Main method (entry point of the program)
    public static void main(String[] args) {
        AccessModifierExample obj1 = new AccessModifierExample(101);
        AccessModifierExample obj2 = new AccessModifierExample(102);

        obj1.showAllMessages();
        System.out.println("------------------------");
        obj2.showAllMessages();
    }
}

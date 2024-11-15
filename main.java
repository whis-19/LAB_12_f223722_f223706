public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the application!");
        greetUser(); // Removed this line to introduce a bug
    }

    public static void greetUser() {
        System.out.println("Hello, User!");
    }
}
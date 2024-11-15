public class Login {
    public boolean authenticate(String username, String password) {
        if (username == null || password == null) {
        System.out.println("Invalid input");
        return false;
        }
        System.out.println("Authenticating user...");
        return username.equals("admin") && password.equals("password123");
        }

}
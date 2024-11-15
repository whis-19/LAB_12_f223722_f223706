public class Login {
    public boolean authenticate(String username, String password) {
        System.out.println("Authenticating user...");
        return username.equals("admin") && password.equals("password123");
        }

}
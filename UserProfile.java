public class UserProfile {
private String name;
private String email;

public UserProfile(String name, String email) {
this.name = name;
this.email = email;
}

public void displayProfile() {
System.out.println("Name: " + name);
System.out.println("Email: " + email);
}
}
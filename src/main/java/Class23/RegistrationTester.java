package Class23;

public class RegistrationTester {
    public static void main(String[] args) {
        Registration r = new Registration("fun@yahoo.com",
                "fun55555", "fun123456");

        System.out.println(r.getEmail());
        System.out.println(r.getUserName());
        System.out.println(r.getPassword());
        r.setEmail("Ehab@yahoo.com");
        r.setUserName("Ehab12345");
        r.setPassword("Ehab12345");
        System.out.print("Email: ");
        System.out.println(r.getEmail());
        System.out.print("User name: ");
        System.out.println(r.getUserName());
        System.out.print("Password: ");
        System.out.println(r.getPassword());

    }

}

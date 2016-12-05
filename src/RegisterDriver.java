/**
 * Created by Katie on 03/12/2016.
 */

public class RegisterDriver {

    private static User register() {

        String firstName = "Katie";
        String lastName = "Griffiths";
        String username = "SmashingCake";
        String email = "smashing.cake@gmail.com";
        String password = "SuperSecretPassword";
        String phoneNumber = "555 555 555";
        String address = "Tralee";

        Register newRegister = new Register(firstName, lastName, address, username, password, email, phoneNumber);

        return newRegister.getUser();
    }

    public static void main(String args[]) {
        User newUser = register();
        System.out.println(newUser);
    }
}

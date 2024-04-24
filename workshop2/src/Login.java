import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        //4-) Kullanıcının username, email, firstname, lastname ve password
        // bilgilerini tutan bir ArrayList kullanarak giriş yapma algoritması yazınız.

        Scanner scanner = new Scanner(System.in);

        List<HashMap<String, String>> users = new ArrayList<>();

        HashMap<String, String> user1 = new HashMap<>();
        user1.put("username", "kubrabzp");
        user1.put("email", "kubra@etiya.com");
        user1.put("firstname", "Kubra");
        user1.put("lastname", "Bozalp");
        user1.put("password", "kubra");
        users.add(user1);

        HashMap<String, String> user2 = new HashMap<>();
        user2.put("username", "selo7");
        user2.put("email", "selahaddin@etiya.com");
        user2.put("firstname", "Selahaddin");
        user2.put("lastname", "is");
        user2.put("password", "selo");
        users.add(user2);

        System.out.print("Enter the email: ");
        String mail = scanner.next();

        System.out.print("Enter the password: ");
        String sifre = scanner.next();

        System.out.println(mail);
        System.out.println(sifre);


        for (HashMap<String, String> user : users) {
            String email = user.get("email");
            String password = user.get("password");
            String username = user.get("username");

            System.out.println(email);
            System.out.println(password);

            if (mail.equals(email) && sifre.equals(password)) {
                System.out.println("Login successful! Welcome " + username);
                break;

            } else {
                System.out.println("Login failed. Email or password is incorrect!");
            }
        }


    }
}

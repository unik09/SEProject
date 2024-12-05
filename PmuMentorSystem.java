import java.util.ArrayList;
import java.util.Scanner;
public class PmuMentorSystem {
     static ArrayList<User> users = new ArrayList<>();
    static int userIdCounter = 001;
    

    //Main method
     public static void main(String[] args) {
        createAccount(); // Call the method
    }





    // creating new account method
    public static void createAccount() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // Check if email is already taken
        for (User user : users) {
            if (user.email.equals(email)) {
                System.out.println("Error: Email already exists!");
                return;
            }

             User newUser = new User(userIdCounter++, name, email, password, role);
        users.add(newUser);

        System.out.println("Account created successfully!");
    
}

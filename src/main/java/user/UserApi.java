package user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class UserApi {
    public static void main(String[] args) {
        ApplicationContext appcontext = new AnnotationConfigApplicationContext(ApplictionConfiguration.class);


        Scanner input = new Scanner(System.in);
        boolean itr = true;
        while (itr) {
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("5. Quit");

            int choice = input.nextInt();
            input.nextLine();

            UserServices userServices = (UserServices) appcontext.getBean("UserServices");

            switch (choice) {
                case 1:
                    System.out.println("Insert user Details");
                    System.out.println("Emails: ");
                    String email = input.nextLine();
                    System.out.println("First Name: ");
                    String firstName = input.nextLine();
                    System.out.println("Last Name: ");
                    String lastName = input.nextLine();

                    User user = new User.UserBuilder(email).firstName(firstName).lastName(lastName).build();

                    // UserServices userServices = new UserServices();

                    userServices.insertUserDetails(user);


                    break;
                case 2:
                    System.out.println("EmailId for Search");
                    email = input.nextLine();
                    User user1 = userServices.searchUser(email);
                    if (user1 != null) {
                        System.out.println("firstName " + user1.getFirstName());
                        System.out.printf("lastName " + user1.getLastName());
                    }
                    System.out.println(" ");


                    break;
                case 3:
                    System.out.println("EmailId for Delete");
                    email = input.nextLine();
                    if (userServices.deleteUser(email)) {
                        System.out.println("Deleted Successfully");
                    } else {
                        System.out.println("unsuccessfull");
                    }
                    break;

                case 4:
                    itr = false;
                    break;

            }
        }

    }


}

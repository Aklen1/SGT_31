package FinalProject;

import FinalProject.BookingDesk;
import FinalProject.DBConnection;
import FinalProject.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    //variable for checking current user
    static public int currentUserId = 0;
    static char runAgain = 'y';
    static DBConnection dataBase = new DBConnection();
    static Scanner scanner = new Scanner(System.in);
    static UserRegistration currentUser = new UserRegistration();

    public static void main(String[] args) {
        char tryAgain = 'y';
        while (currentUserId == 0 && tryAgain == 'y') {
            System.out.println("What you want to do?");
            System.out.println("l - login");
            System.out.println("c - create an account");
            char action = scanner.nextLine().charAt(0);

            if (action == 'l') {
                login();
            } else if (action == 'c') {
                createUser();
            }

            if (currentUserId > 0) {
                while (runAgain == 'y') {
                    System.out.println("What would you like to do?");
                    System.out.println("l - list free Desks");
                    System.out.println("b - book a Desk");
                    System.out.println("c - cancel booking");
                    char choice = scanner.nextLine().charAt(0);

                    if (choice == 'b') {
                        bookDesk();
                    }/* else if (choice == 'c') {
                        cancelDesk();
                    } else
                    if (choice == 'l') {
                        listDesk();
                    }*/

                    System.out.println("Do you want to do something more? y/n");
                    runAgain = scanner.nextLine().charAt(0);
                }
            } else {
                System.out.println("Incorrect user name or password");
                System.out.println("Try again? y/n");
                tryAgain = scanner.nextLine().charAt(0); //FIX no input possible
            }
        }
    }



    public static void login() {
        //UserRegistration currentUser = new UserRegistration();

        System.out.println("Enter username");
        currentUser.setUserName(scanner.nextLine());

        System.out.println("Enter password");
        currentUser.setPassword(scanner.nextLine());

        //DataBase class method for login check returns current Users ID Nr.
        int userId = dataBase.checkLogin(currentUser.getUserName(), currentUser.getPassword());
        if (userId > 0) {
            System.out.println("You have logged in successfully!");
            currentUserId = userId;
        }
    }

    private static String getMatchedPattern(String inputMessage, String warnMessage, String pattern) {
        String inputValue;
        System.out.println(inputMessage);

        inputValue = scanner.nextLine();

        Pattern myPattern = Pattern.compile(pattern);
        Matcher myMatcher = myPattern.matcher(inputValue);

        while (!myMatcher.matches()) {
            System.out.println(warnMessage);
            inputValue = scanner.nextLine();
            myPattern = Pattern.compile(pattern);
            myMatcher = myPattern.matcher(inputValue);
        }
        return inputValue;
    }

    public static void createUser() {
        UserRegistration newUser = new UserRegistration();

        newUser.setUserName(getMatchedPattern("Enter username", "Please enter a valid username! It should be at least 3 characters!","^[a-zA-Z\\d]{3,20}$"  ));

        //DataBase class method for username check returns 1 if true, 0 if false
        int userId = dataBase.checkUser(newUser.getUserName());
        while (userId > 0) {
            newUser.setUserName(getMatchedPattern("Username already exists! Try another one!","Please enter a valid username! It should be at least 3 characters!","^[a-zA-Z\\d+_.!-]]{3,20}$"));
            userId = dataBase.checkUser(newUser.getUserName());
        }

        newUser.setPassword(getMatchedPattern("Enter password","Please enter a valid password! It should be at least 3 characters!","^[a-zA-Z\\d+_.!-]{3,20}$"));

        newUser.setFullName(getMatchedPattern("Enter full name","Please enter valid first name and last name!","^([A-Za-z]*((\\s)))+[A-Za-z]*$" ));

        newUser.setUserEmail(getMatchedPattern("Enter email", "Please enter valid e-mail!","^[A-Za-z\\d+_.-]+@(.+)$"));

        newUser.setUserRole(getMatchedPattern("What is your role: m - manager | e - employee","Please make a valid choice","[me]"));

        //CurrentUserID returns new userID Nr.
        currentUserId = dataBase.createUser(newUser.getUserName(), newUser.getPassword(), newUser.getFullName(), newUser.getUserEmail(), newUser.getUserRole());

        if (currentUserId > 0) {
            System.out.println("You have created an account successfully!");
        }
    }

    public static void listDesk () {
        dataBase.readListDesk();
    }
    public static void bookDesk () {
        BookingDesk newBooking = new BookingDesk();

        newBooking.setWplaceID(getMatchedPattern("Please enter Workplace ID","Please check Workplace ID! It should be 6 digits","\\d{6}"));

        newBooking.setOccupied("1");

        newBooking.setDateFrom(getMatchedPattern("Please enter Date From: YYYYMMDD", "Please check DateFrom! It should be in YYYYMMDD format", "\\d{8}"));

        newBooking.setDateTo(getMatchedPattern("Please enter Date To: YYYYMMDD", "Please check DateTo! It should be in YYYYMMDD format","\\d{8}"));

        //currentUserId = dataBase.createUser(newBooking.getUserID());
        newBooking.setUserID(dataBase.getUserName(currentUser.getUserID()));  //CURRENT USER TO TEST CAREFULLY!!!

        dataBase.saveBookingDesk(newBooking);

        //THANK YOU MESSAGE
    }


}
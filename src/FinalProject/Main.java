package FinalProject;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static public int currentUserId = 0;
    static public String currentUserRole;
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

            if (currentUserId > 0 && currentUserRole.equals("e")) {


                    //System.out.println("What would you like to do?");
                    //System.out.println("l - list free Desks");
                    //System.out.println("o - book a Desk");
                    //System.out.println("b - book a Desk");
                    //System.out.println("c - cancel booking");
                System.out.println("VIEW VACANT desks - enter 1:  \nBook Desk - enter 2 \nCancel Desk - enter 3 \n\nPlease enter your option:");

                int option;
                Scanner console = new Scanner(System.in);
                do
                {
                    System.out.println("Any other action? yes the 1/2/3 no then 0");
                    option = console.nextInt();
                    switch (option) {
                        case 1:
                            System.out.println("View Vacant desks!");
                            DeskManagement.operationMgt(2);
                            break;
                        case 2:
                            System.out.println("Book desks!");
                            bookDesk();

                           // DeskManagement.operationMgt();
                            break;
                        case 3:
                            System.out.println("Cancel desk!!");
                            deleteDesk();
                            //DeskManagement.operationMgt(3);
                            break;

                    }

                }while (option != 0);
            } else if (currentUserId > 0 && currentUserRole.equals("m")) {
                System.out.println("VIEW Booking - enter 1  \nCall VACANT desks List - enter 2 \nADD desk - enter 3 \nDELETE desk - enter 4 \nEXIT from program - enter 5  \n\nPlease enter your option:");

                int option;
                Scanner console = new Scanner(System.in);
                do
                {
                    System.out.println("Any other action? yes the 1/2/3/4 no then 0");
                    option = console.nextInt();
                    switch (option) {
                        case 1:
                            System.out.println("View booking!");
                            DeskManagement.operationMgt(1);
                            break;
                        case 2:
                            System.out.println("View Vacant desks!");
                            DeskManagement.operationMgt(2);
                            break;
                        case 3:
                            System.out.println("Adding desk!!");
                            DeskManagement.operationMgt(3);
                            break;
                        case 4:
                            System.out.println("Delete desk!");
                            DeskManagement.operationMgt(4);
                            break;

                    }

                }while (option != 0);


            }else if (currentUserId <0) {
                System.out.println("Incorrect user name or password");
                System.out.println("Try again? y/n");
                tryAgain = scanner.nextLine().charAt(0);
            }
        }
    }

    public static void login() {

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
        currentUserRole = dataBase.getUserRole(currentUser.getUserName());
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
        currentUserId = dataBase.createUserDB(newUser);

        if (currentUserId > 0) {
            System.out.println("You have created an account successfully!");

            login();
        }
    }
    public static void listDesk () {
        dataBase.readListDesk();
    }
    public static void bookDesk () {
        BookingDesk newBooking = new BookingDesk();
// changed 4 from 6
        newBooking.setWplaceID(getMatchedPattern("Please enter Workplace ID","Please check Workplace ID! It should be 4 digits","\\d{4}"));
// changed y from 1
        newBooking.setOccupied("y");

        newBooking.setDateFrom(getMatchedPattern("Please enter Date From: YYYYMMDD", "Please check DateFrom! It should be in YYYYMMDD format", "\\d{8}"));

        newBooking.setDateTo(getMatchedPattern("Please enter Date To: YYYYMMDD", "Please check DateTo! It should be in YYYYMMDD format","\\d{8}"));

        newBooking.setUserID(dataBase.getUserID(currentUser.getUserName()));

        dataBase.saveBookingDesk(newBooking);

    }
    public static void deleteDesk () {
        BookingDesk delBooking = new BookingDesk();
// changed 4 from 6
        delBooking.setWplaceID(getMatchedPattern("Please enter Workplace ID","Please check Workplace ID! It should be 4 digits","\\d{4}"));
// changed n from 0
        delBooking.setOccupied("n");

      // user ID must be null
        delBooking.setDateFrom(null);
        delBooking.setDateTo(null);

        delBooking.setUserID(dataBase.getUserID(currentUser.getUserName()));  //CURRENT USER TO TEST CAREFULLY!!!

        dataBase.delBookingDesk(delBooking);
    }

}
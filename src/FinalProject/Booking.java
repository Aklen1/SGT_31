package FinalProject;

import java.util.Scanner;

public class Booking {
    static String myBooking(String userDtl) {
        String bookingConfirmation="";
        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome booking management System");
        System.out.println("Please enter your preferance");
        System.out.println("prefered floor number :\n ");
        int floorNo = myObj.nextInt();
        System.out.println("prefered Room number :\n ");
        int roomNo = myObj.nextInt();
        myObj.nextLine();
        System.out.println("Booking date from (dd.mm.yyyy):\n ");
        String startDate = myObj.nextLine();

        System.out.println("Booking End date (dd.mm.yyyy):\n ");
        String endDate = myObj.nextLine();

        System.out.println("Name :"+userDtl+ "\nFloor no : "+ floorNo + ", \nRoom no: " +roomNo + ", \nStarting date : "+startDate + ",\nEnding date :" +endDate);

        return bookingConfirmation;
    }
    static void myDeskMgt(String userDtl) {
        System.out.println("Welcome Desk management System");

        Scanner myObj = new Scanner(System.in);


        System.out.println("Please select operation:");
        System.out.println("Enter floor or f for floor //room or r for room // desk or d for desk operations(add/delete/view):");

        String menuSelect = myObj.nextLine();

        if("floor".equals(menuSelect.toLowerCase()) ||"f".equals(menuSelect.toLowerCase()) ){
            floorMgt(userDtl);

        }else if("room".equals(menuSelect.toLowerCase()) || "r".equals(menuSelect.toLowerCase())){
            roomMgt(userDtl);
        }else if("desk".equals(menuSelect.toLowerCase()) || "d".equals(menuSelect.toLowerCase())){
            deskMgt(userDtl);
        }else{
            System.out.println("Opps...!!! invalid input please choose option from book or manage option");
        }
    }
    static void floorMgt(String userDtl) {
        System.out.println("Welcome Floor management System");

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please select operation:");
        System.out.println("Enter List or l for list //add or a for adding // delete or d for delete operation of floor:");
        String menuSelect = myObj.nextLine();
        if("list".equals(menuSelect.toLowerCase()) ||"l".equals(menuSelect.toLowerCase()) ){
            System.out.println("List of Floor");

        }else if("Add".equals(menuSelect.toLowerCase()) || "a".equals(menuSelect.toLowerCase())){
            System.out.println("Add Floor");
        }else if("delete".equals(menuSelect.toLowerCase()) || "d".equals(menuSelect.toLowerCase())){
            System.out.println("Delete Floor");
        }else{
            System.out.println("Opps...!!! invalid input please choose option from book or manage option");
        }
    }
    static void roomMgt(String userDtl) {
        System.out.println("Welcome Room management System");

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please select operation:");
        System.out.println("Enter List or l for list //add or a for adding // delete or d for delete operation of Room:");
        String menuSelect = myObj.nextLine();
        if("list".equals(menuSelect.toLowerCase()) ||"l".equals(menuSelect.toLowerCase()) ){
            System.out.println("List of Room");

        }else if("Add".equals(menuSelect.toLowerCase()) || "a".equals(menuSelect.toLowerCase())){
            System.out.println("Add Room");
        }else if("delete".equals(menuSelect.toLowerCase()) || "d".equals(menuSelect.toLowerCase())){
            System.out.println("Delete Room");
        }else{
            System.out.println("Opps...!!! invalid input please try again later!");
        }
    }

    static void deskMgt(String userDtl) {
        System.out.println("Welcome Desk management System");

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please select operation:");
        System.out.println("Enter List or l for list //add or a for adding // delete or d for delete operation of Desk:");
        String menuSelect = myObj.nextLine();
        if("list".equals(menuSelect.toLowerCase()) ||"l".equals(menuSelect.toLowerCase()) ){
            System.out.println("List of Desk");

        }else if("Add".equals(menuSelect.toLowerCase()) || "a".equals(menuSelect.toLowerCase())){
            System.out.println("Add Desk");
        }else if("delete".equals(menuSelect.toLowerCase()) || "d".equals(menuSelect.toLowerCase())){
            System.out.println("Delete Desk");
        }else{
            System.out.println("Opps...!!! invalid input please try again later!");
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to the Desk Reservation Application!\n------------------------------------------------------------");
        System.out.println("Would you like to book a desk or manage desk? :\n ");
        System.out.println("*select option book or manage or exit : (book/b or manage/m or Exit)");
        Scanner myObj = new Scanner(System.in);
        String menuSelect = myObj.nextLine();
        System.out.println("Please enter user's full name : ");
        String userDtl = myObj.nextLine();
        if("book".equals(menuSelect.toLowerCase()) ||"b".equals(menuSelect.toLowerCase()) ){

            myBooking(userDtl.toLowerCase());
        }else if("manage".equals(menuSelect.toLowerCase()) || "m".equals(menuSelect.toLowerCase())){
            myDeskMgt(userDtl.toLowerCase());
        }else{
            System.out.println("Opps...!!! invalid input please choose option from book or manage option");
        }

        System.out.println("\n\n\nThank you for useing our system...!!!" );

    }
}
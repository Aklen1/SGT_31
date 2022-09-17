package FinalProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DeskManagement {
    static void operationMgt(Integer operationType) {

        Scanner scanner  = new Scanner(System.in);
        switch (operationType) {
            case 1:
                myConMgt("SELECT * FROM `workplaces` WHERE `occupied`='y'",1);
                break;
            case 2:
                myConMgt("SELECT * FROM `workplaces` WHERE `occupied`='n'",1);
                break;
            case 3:
                AddingDesk addingDesk = new AddingDesk();
                System.out.print("Enter Floor number (1 to 9): ");
                addingDesk.setFloor(scanner.nextInt());
                System.out.print("Enter Room number (1 to 99): ");
                addingDesk.setRoom(scanner.nextInt());
                System.out.print("Enter Desk Id  (1 to 999): ");
                addingDesk.setDeskID(scanner.nextInt());
                String strWpId = "" + addingDesk.getFloor() + addingDesk.getRoom() + addingDesk.getDeskID() ;
                addingDesk.setWplaceID(strWpId);
                System.out.println(addingDesk.getWplaceID());
                System.out.println("New desk added successfully ");
                //wplaceID, floor, room, deskID, occupied, dateFrom, dateTo
                myConMgt("INSERT INTO `workplaces` (`wplaceID`,`floor`, `room`, `deskID`,`occupied` ) VALUES ('"+addingDesk.getWplaceID()+"','"+addingDesk.getFloor()+"', '"+addingDesk.getRoom()+"', '"+addingDesk.getDeskID()+"', 'n')",2);
                break;
            case 4:
                System.out.print("Enter Workplace ID: ");
                String WpID = scanner.nextLine();
                myConMgt("DELETE FROM `workplaces` WHERE `wplaceID`= '"+WpID+"'",3);
                System.out.println( "Desk deleted successfully");
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Opps...!!! invalid input please choose option from book or manage option");
                break;
        }
    }
    static void myConMgt(String qryString , int operation) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java31_group1","root","Corolla1");
            Statement stmt=con.createStatement();

            if(operation==1){
                ResultSet rs=stmt.executeQuery(qryString);

                //prints the list objects in tabular format
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.printf("%5s %5s %5s %5s %5s %5s %5s %5s", "WorkplaceID", "User ID", "Floor", "Room", "Desk", "Occupied","DateFrom","DateTo");
                System.out.println();
                System.out.println("---------------------------------------------------------------------------------------------");
//iterates over the list
                while(rs.next()) {
                    System.out.format("%7s %10s %5s %5s %5s %5s %8s %8s",rs.getString(1) , rs.getString(2) , rs.getInt(3) ,rs.getInt(4) , rs.getInt(5) ,rs.getString(6) ,rs.getString(7), rs.getString(8));

                    System.out.println();
                }
                System.out.println("----------------------------------------------------------------------------------------------");


           // while(rs.next()) {

             //       System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getInt(3) + "  " + rs.getInt(4) + "  " + rs.getInt(5) + "  " + rs.getString(6) + "  " + rs.getString(7) + "  " + rs.getString(8));
               // }
            }else{

                stmt.executeUpdate(qryString);
            }
            con.close();

        }catch(Exception e){ System.out.println(e);}

    }
    public static void main(String[] args) {

        System.out.println("Welcome to the Desk Reservation Application!\n-------------------------------------------------");
        System.out.println("The following options are available: ");
        System.out.println("VIEW Booking - enter 1  \nCall VACANT desks List - enter 2 \nADD desk - enter 3 \nDELETE desk - enter 4 \nEXIT from program - enter 5  \n\nPlease enter your option:");

        Scanner scanner = new Scanner(System.in);
        int oprSelect = scanner.nextInt();

        switch (oprSelect) {
            case 1:
                System.out.println("View booking!");
                operationMgt(oprSelect);
                break;
            case 2:
                System.out.println("View Vacant desks!");
                operationMgt(oprSelect);
                break;
            case 3:
                System.out.println("Adding desk!!");
                operationMgt(oprSelect);
                break;
            case 4:
                System.out.println("Delete desk!");
                operationMgt(oprSelect);
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Opps...!!! invalid input please choose option from book or manage option");
                break;

        }

    }
}
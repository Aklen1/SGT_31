package FinalProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Booking {
    static void operationMgt(String userDtl, Integer operationType) {
        System.out.println("Welcome "+operationType+" method");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please select operation:");

        switch (operationType) {
            case 1:
                System.out.println("view booking!!!");
                myConMgt("SELECT * FROM `workplaces` WHERE `occupied`='1'",1);
                break;
            case 2:
                System.out.println("view Vacant desks!");
                myConMgt("SELECT * FROM `workplaces` WHERE `occupied`='0'",1);
                break;
            case 3:
                System.out.println("adding desk!");

                myConMgt("INSERT INTO Workplaces  (wplaceID, floor, room, deskID, occupied, dateFrom, dateTo) VALUES ('2512', 2, 5, 12, false, '18.09.2022',  '18.09.2022');",2);
                break;
            case 4:
                System.out.println("delete desk!");
                myConMgt("DELETE from workplaces WHERE wplaceID = '2512'",3);
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
        System.out.println("qry:" + qryString);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java31_group1","root","Corolla1");
            //here sonoo is the database name, root is the username and root is the password
            Statement stmt=con.createStatement();

            if(operation==1){
                System.out.println("view booking!!!");
                ResultSet rs=stmt.executeQuery(qryString);
                while(rs.next())
                    System.out.println(rs.getString(1)+"   "+rs.getInt(2)+"  "+rs.getInt(3)+"  "+rs.getInt(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7));

            }else{

                stmt.executeUpdate(qryString);

            }


            con.close();

        }catch(Exception e){ System.out.println(e);}



    }
    public static void main(String[] args) {

        System.out.println("Welcome to the Desk Reservation Application!\n------------------------------------------------------------");
        System.out.println("Would you like to book a desk or manage desk? :\n ");
        System.out.println("*select option book or manage or exit : (view booking  or view vacant desks or add desk or delete desk or Exit)");
        System.out.println("Enter 1 for view booking! \nEnter 2 for view Vacant desks! \nEnter 3 for adding desk! \nEnter 4 for delete desk! \nEnter 5 for exit!\n\nPlease enter your option:");

        Scanner myObj = new Scanner(System.in);
        int oprSelect = myObj.nextInt();
        String userDtl = "N001";
        System.out.println("UserID is : "+userDtl);

        switch (oprSelect) {
            case 1:
                System.out.println("view booking!");
                operationMgt(userDtl,oprSelect);
                break;
            case 2:
                System.out.println("view Vacant desks!");
                operationMgt(userDtl,oprSelect);
                break;
            case 3:
                System.out.println("adding desk!");
                operationMgt(userDtl,oprSelect);
                break;
            case 4:
                System.out.println("delete desk!");
                operationMgt(userDtl,oprSelect);
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Opps...!!! invalid input please choose option from book or manage option");
                break;
        }

        System.out.println("\n\n\nThank you for useing our system...!!!" );

    }
}
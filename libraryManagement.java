
package library_management;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class libraryManagement {

   
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        
//            connection starts
	Class.forName("com.mysql.cj.jdbc.Driver");

	String url="jdbc:mysql://localhost:3306/book_manage";
	String username="root";
	String userpassword="7800";


	Connection con=DriverManager.getConnection(url,username,userpassword);

	if(con.isClosed())
	{
                                    System.out.println("connection is close still..");


	}else
	{
                                    System.out.println("connection is created...");

				
	}
//           connection ends
            
//    while loop starts    
         while(true){
             
//      selection options
             System.out.println("==========================================");
            System.out.println("Enter 1 for add books.");
            System.out.println("Enter 2 for delete books.");
            System.out.println("Enter 3 for issue books.");
            System.out.println("Enter 4 for return books.");
            System.out.println("Enter 5 for books list.");
            System.out.println("Enter 6 for students list.");
            System.out.println("Enter 7 for search book.");
            System.out.println("Enter 8 for search student.");
            System.out.println("Enter 9 for exit.");

//     for selection entry
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int input = Integer.parseInt(br.readLine());
            
//     for add book
            if(input==1){
                       operations.addBook();
            }
        
//     for delete book
           else if(input==2){
                        operations.deleteBook();
            }
           
//    for issue book
            else if(input==3){
                        operations.issueBook();
            }
            
//     for return book
            else if(input==4){
                       operations.returnBook();
            }
            
//     for books list
            else if(input==5){
                        operations.booksList();
            }
            
//     for students list
            else if(input==6){
                        operations.studentsList();
            }
            
//     for search book
            else if(input==7){
                        operations.searchBook();
            }
            
//     for search student
            else if(input==8){

                        operations.searchStudent();
            }
            
//     for exit
            else if(input==9){
                        System.out.println("Thanks for visit.");
                        System.out.println("Good bye...");
                        break;
            }
            
//     for invalid entry
            else{
                        System.out.println("Invalid Entry, Please try again...");
                        System.out.println("Input must be between 1 to 9.");
            }
      }
//      while loop closed
    
   }
//   main method closed
}
//class closed

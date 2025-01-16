import java.sql.*;

public class DataDeletion {
    public static void main(String[] args)  {

        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password  = "root177";
        String query  ="DELETE FROM employees where Emp_id = 116; ";
        Connection con;
        Statement stmt;
        ResultSet rs;
        int rowsaffected =0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println("not installed ");
        }
        try{
            con = DriverManager.getConnection(url ,username ,  password );
            stmt = con.createStatement();
            rowsaffected= stmt.executeUpdate(query);

            if(rowsaffected > 0 ){
                System.out.println(rowsaffected + " row deleted succesfuly");
            }else {
                System.out.println("Not deleted");
            }



        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }




    }
}
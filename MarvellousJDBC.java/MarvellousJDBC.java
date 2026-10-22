imoport java.sql.*;
public class marvellousJDBC
public static void main(String A[])
{
    try
    {
        class.forNmae("com.Mysql.cj.jdbc.Driver");
        connection con = DriverManager.getConnection("jdbc:mysql://localhost:330/6PPA55","root","");
        statement stmt = con.createStatement();=ResultSet rs =stmt.executeQuery("SELECT*FROM stdent");
         while(rs.next());.
         {
             System.out.println("Roll No:"+rs.getlnt("rno"));
            System.out.println("Name"+rs.getString("name"));
            System.out.println("city"+rs.getString("city"));
            System.out.println("Marks"+rs.getString("marks"));

            System.out.println("------------");
         }
         rs.close();
         stmt.close();
         con.close();
    }
    catch(Exception e)
    {
        System.out.println("Exception occured:"+e);
    }
}

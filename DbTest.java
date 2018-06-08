import java.sql.*;

/**
 * Created by agnel on 6/2/18.
 */
public class DbTest {
    public static void main(String[] args) throws ClassNotFoundException,SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2","root","agnel");
        Statement st =con.createStatement();
        ResultSet rs = st.executeQuery("select * from student");

        //Iterating the values
        while(rs.next()){
            System.out.println("Id : "+rs.getInt(1)+" Name : "+rs.getString(2));
        }


    }
}

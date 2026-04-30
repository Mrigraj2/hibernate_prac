import java.sql.*;

public class Demo {

    public static void main(String[] args) throws Exception{

        String url="jdbc:postgresql://localhost:5432/postgres";
        String uname="postgres";
        String password="12345";

        String sql = "select * from student";

        Class.forName("org.postgresql.Driver");  //-----> optional now
        Connection con = DriverManager.getConnection(url,uname,password );

//        Statement st = con.createStatement();
        PreparedStatement st = con.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        rs.next();
        System.out.println(rs.getString("name"));
//        while(rs.next()){
//            System.out.print(rs.getInt(1));
//            System.out.print(rs.getString(2));
//        }
    }
}

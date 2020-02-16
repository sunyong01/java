package Login;

//TODO 没写完

import java.sql.*;

public class UserDAO {
    private String userName;
    private String userPassword;
//    static final String DB_URL ="127.0.0.1:3306";
//    static final String USER = "username";
//    static final String PASS = "password";
    Statement stmt ;
    Connection dbConnection;

    private void db() throws SQLException {
        this.dbConnection = new getDBC().getConnection("127.0.0.1:3306","username","password");
        this.stmt= dbConnection.createStatement();

    }

    public boolean findUser(String username, String password)throws Exception{
        /* 处理SQL,执行SQL */
        try {

            db();

            // 执行查询
            System.out.println("实例化Statement对象...");
            stmt = dbConnection.createStatement();
            String sql="SELECT * FROM user where username='"+username+"'and password='"+password+"'";
            ResultSet rs = stmt.executeQuery(sql);
//            System.out.println( rs.getString("username"));
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace(); // 处理SQLException异常
        }
        return  false;
    }


}

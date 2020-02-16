package Login;

//TODO 没写完

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
    private String userName;
    private String userPassword;
    Statement stmt ;
    String sql = "select * from database where id=?";
    private void db() throws SQLException {
        Connection dbConnection = new getDBC().getConnection();
        PreparedStatement ptmt = dbConnection.prepareStatement(sql);
        this.stmt= dbConnection.createStatement();
    }
    public boolean findUser(String userName) throws SQLException {
        db();

        //TODO 在这里补充查询语句

        return true;
    }
    
}

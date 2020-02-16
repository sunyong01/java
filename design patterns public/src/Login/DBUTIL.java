package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public interface DBUTIL {
    Connection getConnection(String dburl,String user,String pass) throws SQLException;

}

//只需要修改这里return 就可以轻松修改数据库的类型了
class getDBC implements DBUTIL{

    @Override
    public Connection getConnection(String DB_URL,String USER,String PASS) throws SQLException {
        return new MysqlConnection().getConnection(DB_URL,USER,PASS);
    }
}

class MysqlConnection implements DBUTIL{


    @Override
    public Connection getConnection(String a,String b,String c) throws SQLException {
        return DriverManager.getConnection(a,b,c);

    }
}


class SqlServerConnection implements DBUTIL{
    @Override
    public Connection getConnection(String a,String b,String c) throws SQLException {
        return DriverManager.getConnection(a,b,c);

    }
}


class ORACLEConnection implements DBUTIL{

    @Override
    public Connection getConnection(String a,String b,String c) throws SQLException {
        return DriverManager.getConnection(a,b,c);

    }
}
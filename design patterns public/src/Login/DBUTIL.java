package Login;

import java.sql.Connection;



public interface DBUTIL {
    Connection getConnection();
}

//只需要修改这里return 就可以轻松修改数据库的类型了
class getDBC implements DBUTIL{

    @Override
    public Connection getConnection() {
        return new MysqlConnection().getConnection();
    }
}

class MysqlConnection implements DBUTIL{


    @Override
    public Connection getConnection() {
        return null;
    }
}


class SqlServerConnection implements DBUTIL{

    @Override
    public Connection getConnection() {
        return null;
    }
}


class ORACLEConnection implements DBUTIL{

    @Override
    public Connection getConnection() {
        return null;
    }
}
package BadConnection;

import java.sql.Connection;

public class DBUtil {
	/*对类采用继承。假如原来采用JDBC连接数据库，现在采用数据库连接池，则需要修改DBUtil
	 类源代码，如果两个类分别采用不同的数据库连接方式，则需要再增加一个DBUtil
	 类，这违背了开闭原则，系统扩展性较差*/
	public Connection getConnection() {
		return null;
	}
}

package BetterLogin;

import java.sql.Connection;

public class DBUtil { //该类负责数据库的连接，可提供多个数据库操作类重用
	public Connection getConnection() {
		return null;
		//所有操作数据库的类都可以调用该类中的该方法获取数据库的连接对象
	}
}

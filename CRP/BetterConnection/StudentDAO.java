package BetterConnection;

public class StudentDAO {
	//尽量使用对象组合/聚合，而不是继承来达到复用目的。
	private DBUtil dBOperator=new DBUtil();
	public void setDBOperator(DBUtil dBOperator) {
		
	}
	public StudentDTO findStudentByid(String id) {
		
	}
	public List findStudents() {
		
	}
	public int save (StudentDTO student) {
		
	}
}

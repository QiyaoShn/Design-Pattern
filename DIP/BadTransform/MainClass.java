package BadTransform;

public class MainClass {
	/*该系统每增加一个新的类型的数据源或者新的类型的文件格式，
	 MainClass都需要修改源代码，以便使用新的类，违背了开闭原则。*/
	DatabaseSource d = new DatabaseSource();
	TextSource t = new TextSource();
	public static void main(String[] args) {
		
	}
}

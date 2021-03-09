package BetterLogin;

public class MainClass {	//负责启动程序
	public static void main(String[] args) {
		LoginForm a = new LoginForm();
		a.init();
		a.validate();
	}
}

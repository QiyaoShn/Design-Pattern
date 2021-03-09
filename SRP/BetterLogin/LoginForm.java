package BetterLogin;

import java.util.Scanner;

public class LoginForm {	//负责界面显示
	private UserDAO dao;
	public void init() {
		// TODO Auto-generated method stub
	}
	public void display() {
		System.out.println("登录成功！");
	}
	public void validate() {
		String userName = null;
		String userPassword = null;
		System.out.println("请输入用户名：");
		Scanner sc = new Scanner(System.in);
		userName = sc.nextLine();
		System.out.println("用户名："+userName);
		
		System.out.println("请输入登录密码：");
		Scanner sr = new Scanner(System.in);
		userPassword = sr.nextLine();
		System.out.println("密码："+userPassword);
		sr.close();
		sc.close();
		if(dao.findUser(userName, userPassword))
			display();
		else
			System.out.println("用户名或密码输入错误！");
	}
}

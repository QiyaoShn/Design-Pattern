package BetterButton;

public class LoginForm {
	/*如需修改系统行为，只需要增加新的具体类来实现新的业务
	 功能（不需要修改抽象层）。需要扩展系统功能时只需修改配置
	 文件，而原有的Java代码不做任何修改，这时系统符合开闭原则，
	 具有良好的灵活性和可扩展性，且大部分的设计模式都符合开闭原则*/
	private AbstractButton button = new AbstractButton() {
		@Override
		public void display() {
			// TODO Auto-generated method stub
			button.display();
		}
	};
	public static void main(String[] args) {
		LoginForm m = new LoginForm();
	}
}

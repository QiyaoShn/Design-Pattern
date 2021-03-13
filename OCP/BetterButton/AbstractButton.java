package BetterButton;

public abstract class AbstractButton {
	/*抽象化是开闭原则的关键，为系统定义一个相对稳定的抽象
	 层，将不同的实现行为在具体的实现层也就是不同的类中完成。*/
	public abstract void display();
}

package BuilderPattern;

public class Client {
	/*建造者模式四个关键的角色：指挥者或服务员（组装产品）、
	抽象建造者、各种具体的建造者、最后的产品（组装后的）
	隐藏的一个角色：组装产品的各种零件（抽象）*/
	public static void main(String[] args) {
		MealBuilder mb = (MealBuilder)XMLUtil.getBean();
		KFCWaiter waiter = new KFCWaiter();
		waiter.setMealBuilder(mb);
		Meal meal =waiter.constract();
	}
}

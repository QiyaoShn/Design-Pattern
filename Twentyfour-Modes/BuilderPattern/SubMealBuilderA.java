package BuilderPattern;

public class SubMealBuilderA extends MealBuilder {
	//各种具体的建造者
	@Override
	public void buildFood() {
		System.out.println("一份瑞士卷");
	}

	@Override
	public void buildDrink() {
		System.out.println("一杯桃桃乌龙");
	}
	public void buildFruit() {
		System.out.println("一份西瓜");
	}
}

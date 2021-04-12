package BuilderPattern;

public class SubMealBuilderB extends MealBuilder {
	//各种具体的建造者
	@Override
	public void buildFood() {
		System.out.println("一份芝士焗饭");
	}

	@Override
	public void buildDrink() {
		System.out.println("一杯奶盖芒果桃桃");
	}

	@Override
	public void buildFruit() {
		// TODO Auto-generated method stub
		
	}
}

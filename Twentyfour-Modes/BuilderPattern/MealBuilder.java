package BuilderPattern;

public abstract class MealBuilder {
	//抽象建造者
    private Meal meal;
    public abstract void buildFood();

    public abstract void buildDrink();

    public abstract void buildFruit();
    public Meal getMeal() {
		return null;
    }

}

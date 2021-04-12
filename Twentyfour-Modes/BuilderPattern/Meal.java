package BuilderPattern;

public class Meal implements MealKind{
	//最后的产品（组装后的）
	private String drink;
	private String food;
	private MealKind fruit;
    public void setFood(String food){
    	this.food = food;
    }

    public void setDrink(String drink){
    	this.drink = drink;
    }

    public String  getFood(){
        return food;
    }

    public String getDrink(){
        return drink;
    }

	@Override
	public Fruit getFruit() {
		return (Fruit) fruit;
	}

	public void setFruit(MealKind fruit) {
		this.fruit = fruit;
	}
}

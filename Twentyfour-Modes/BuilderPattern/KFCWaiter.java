package BuilderPattern;

public class KFCWaiter {
	//指挥者或服务员（组装产品）
    private MealBuilder mb;

    public void setMealBuilder(MealBuilder mb){
    	this.mb = mb;
    }

    public Meal constract(){
        mb.buildDrink();
        mb.buildFood();
        mb.buildFruit();
        return mb.getMeal();
    }

}

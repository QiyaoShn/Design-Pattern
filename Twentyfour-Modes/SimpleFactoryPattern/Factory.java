package SimpleFactoryPattern;
public class Factory {

    public static Fruit CreateFruit(String fruit)throws Exception{
        if(fruit.equals("Apple")) {
        	System.out.println("水果工厂生产苹果！");
        	return new Apple();
        }else if(fruit.equals("Banana")) {
        	System.out.println("水果工厂生产香蕉！");
        	return new Banana();
        }else if(fruit.equals("Peach")) {
        	System.out.println("水果工厂生产桃子！");
        	return new Peach();
        }
        else {
        	throw new Exception("对不起，暂时不能生产该水果！");
        }
    }

}

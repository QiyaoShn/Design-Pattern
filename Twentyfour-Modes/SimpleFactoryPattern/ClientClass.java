package SimpleFactoryPattern;

public class ClientClass {
	public static void main(String[] args) throws Exception {
		try {
			Fruit fruit;
			String fruitName = XMLUtil.getFruitName();
			fruit = Factory.CreateFruit(fruitName);
			fruit.eat();
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
	}	
}
